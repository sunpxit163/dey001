package xyz.sunpxit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@SpringBootApplication
@EnableEurekaClient
//告知@FeignClient(value = "MICROSERVICECLOUD-DEPT8001")的位置
@EnableFeignClients(basePackages = {"xyz.sunpxit"})
/**
 * 会被spring自动扫描并且装入bean容器。
 * Component:组件
 * Scan:扫描
 */

@ComponentScan("xyz.sunpxit")

public class DeptProvider_feign_80_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider_feign_80_App.class, args);
	}
}
