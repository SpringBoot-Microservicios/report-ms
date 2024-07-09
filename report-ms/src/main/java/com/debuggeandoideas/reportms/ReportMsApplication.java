package com.debuggeandoideas.reportms;

import com.debuggeandoideas.reportms.helpers.ReportHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ReportMsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReportMsApplication.class, args);
    }

}
