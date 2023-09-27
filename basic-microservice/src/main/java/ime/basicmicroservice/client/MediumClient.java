package ime.basicmicroservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("medium-microservice")
public interface MediumClient {
	
	@GetMapping("/api/main-medium")
	ResponseEntity<String> sayBye();

}
