package ime.basicmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ime.basicmicroservice.client.MediumClient;


@RestController
@RequestMapping("api/main-basic")
@RefreshScope
public class MainController {


	@Value("${main.creator.name}")
	private String creatorName; 
	
	@Autowired
	private MediumClient mediumClient;
	
	@GetMapping
	public ResponseEntity<String> fnHello() {
		return ResponseEntity.ok("Hello, it's me " + creatorName);
	}
	
	@GetMapping("/medium")
	public ResponseEntity<String> fnBye(){
		return mediumClient.sayBye();
	}
	
}