package main.java;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

	@RequestMapping("/animals")
	public ResponseEntity<String> getAnimals() {
		return new ResponseEntity<String>("Got Animals",HttpStatus.OK);
	}
	
	@RequestMapping(path = "/animals", method = RequestMethod.POST)
	public ResponseEntity<String> createAnimal() {
		return new ResponseEntity<String>("New Animal Created", HttpStatus.OK);
	}
	
	@RequestMapping(path = "/animals/{animalName}", method = RequestMethod.PUT)
	public ResponseEntity<String> changeAnimal(@PathVariable String animalName) {
		return new ResponseEntity<String>("Changed Animal "+animalName, HttpStatus.OK);
	}
	
	@RequestMapping(path = "/animals/{animalName}", method = RequestMethod.GET)
	public ResponseEntity<String> getAnimal(@PathVariable String animalName) {
		return new ResponseEntity<String>("Got animal " + animalName, HttpStatus.OK);
	}
	
	@RequestMapping(path = "/animals/{animalName}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteAnimal(@PathVariable String animalName) {
		return new ResponseEntity<String>("Deleted animal " + animalName, HttpStatus.OK);
	}
}
