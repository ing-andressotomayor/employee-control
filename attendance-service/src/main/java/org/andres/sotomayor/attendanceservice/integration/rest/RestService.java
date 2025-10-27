package org.andres.sotomayor.attendanceservice.integration.rest;

import org.andres.sotomayor.attendanceservice.integration.dto.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;


@Service
public class RestService {
    private final RestClient restClient;
    private static final String PATH = "/api/employee/find-by-employee-number";

    public RestService(RestClient.Builder restClient) {
        this.restClient = restClient.build();
    }

    public Employee getEmployeeForEmployeeNumber(String employeeNumber) {
            return restClient.get()
                    .uri(uriBuilder -> uriBuilder.path(PATH)
                            .queryParam("employeeNumber", employeeNumber)
                            .build())
                    .retrieve().body(Employee.class);
    }
}
