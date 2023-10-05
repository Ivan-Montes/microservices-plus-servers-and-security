package ime.mediummicroservice.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("basic-microservice")
public interface BasicClient {

	
}
