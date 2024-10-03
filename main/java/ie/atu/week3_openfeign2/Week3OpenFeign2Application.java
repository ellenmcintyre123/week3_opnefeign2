package ie.atu.week3_openfeign2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week3OpenFeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(Week3OpenFeign2Application.class, args);
	}

}
