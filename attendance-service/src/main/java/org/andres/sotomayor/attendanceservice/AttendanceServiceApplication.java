package org.andres.sotomayor.attendanceservice;

import org.andres.sotomayor.attendanceservice.integration.rest.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AttendanceServiceApplication {
    @Autowired
    private RestService restService;

    public static void main(String[] args) {
        SpringApplication.run(AttendanceServiceApplication.class, args);
    }

}
