package xyz.sunpxit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class  cloude_hystrix_Dashboar_9001{
	public static void main(String[] args)
	{
		SpringApplication.run(cloude_hystrix_Dashboar_9001.class, args);
	}
}