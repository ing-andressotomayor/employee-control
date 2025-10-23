package org.andres.sotomayor.employeeservice.business;

import org.andres.sotomayor.employeeservice.dto.Deduction;
import org.andres.sotomayor.employeeservice.dto.Employee;
import org.andres.sotomayor.employeeservice.dto.GrossMonthlyCompensation;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

@Service
public class EmployeeData {

    private void validateAge(LocalDate age) {
        if (Period.between(age, LocalDate.now()).getYears() < 18)
            throw new IllegalArgumentException("{validation.message.age}");
    }

    private Employee generateNumberEmployee(Employee employee) {
        employee.getLaboralInformation().setEmployeeNumber(UUID.randomUUID().toString());
        return employee;
    }

    public Employee calculateNetSalary(Employee employee) {
        validateAge(employee.getPersonalInformation().getBirthDate());
        Employee employeeResult = generateNumberEmployee(employee);

        double totalGrossSalary = 0.0;


        for (GrossMonthlyCompensation remuneration : employeeResult.getGrossMonthlyCompensations()) {
            totalGrossSalary += remuneration.getAmount();
        }

        for (Deduction deduction : employeeResult.getDeductions()) {
            totalGrossSalary = totalGrossSalary - ((deduction.getPercentage() / 100.00) * totalGrossSalary);
        }
        employeeResult.getLaboralInformation().setNetSalary(Double.parseDouble(new DecimalFormat("#.00").format(totalGrossSalary)));
        return employeeResult;
    }
}
