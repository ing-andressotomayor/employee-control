package org.andres.sotomayor.attendanceservice.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientService {
    @Bean
    @LoadBalanced
    public RestClient.Builder restClientServiceConfiguration(){
        return RestClient.builder().baseUrl("http://employee-service");
    }
}
