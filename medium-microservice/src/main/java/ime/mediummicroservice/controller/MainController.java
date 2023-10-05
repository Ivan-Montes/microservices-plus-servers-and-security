package ime.mediummicroservice.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/main-medium")
@RefreshScope
public class MainController {

	
	@GetMapping
	public ResponseEntity<String> fnBye() {
		return ResponseEntity.ok("Farewell, old friend");
	}
	
	
}
