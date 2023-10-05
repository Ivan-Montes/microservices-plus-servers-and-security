package ime.mediummicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MediumMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediumMicroserviceApplication.class, args);
	}

}
