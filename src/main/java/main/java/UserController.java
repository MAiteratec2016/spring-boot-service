package main.java;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/users")
	public ResponseEntity<String> getUsers() {
		return new ResponseEntity<String>("Got all users", HttpStatus.OK);
	}
}
