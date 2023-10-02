package ime.basicmicroservice.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/secondary-basic")
@RefreshScope
public class SecondaryController {

	@GetMapping
	public ResponseEntity<String> fnHello() {
		return ResponseEntity.ok("Hello, Sideshow ");
	}
}
