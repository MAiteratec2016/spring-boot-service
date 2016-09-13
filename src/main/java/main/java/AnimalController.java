package main.java;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
	
    @RequestMapping(path="/animals", method = RequestMethod.GET, produces = {"application/json"})
	public ResponseEntity<String> getAnimals(@RequestHeader(name="x-myapp-numberOfAnimals", defaultValue="10",required=false) String numberOfAnimals) {
		return new ResponseEntity<String>("Got "+ numberOfAnimals + " Animals",HttpStatus.OK);
	}
		
	@RequestMapping(path = "/animals", method = {RequestMethod.POST,RequestMethod.PUT}, consumes={"application/json","application/xml"})
	public ResponseEntity<String> createAnimal(@RequestBody(required = true) Animal animal) {
		return new ResponseEntity<String>("New " + animal.getRace() +" \""+animal.getName()+" \" created with age of " + animal.getAge() + ".", HttpStatus.OK);
	}
	
	@RequestMapping(path = "/animals/{animalName}", method = RequestMethod.PUT, consumes={"application/json"})
	public ResponseEntity<String> changeAnimal(@PathVariable String animalName, @RequestBody(required = true) Animal animal) {
		return new ResponseEntity<String>("Changed Animal "+animalName+". Race = " + animal.getRace() + "; Age = " + animal.getAge(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/animals/{animalName}", method = RequestMethod.GET, produces = {"application/json","application/xml"})
	public ResponseEntity<String> getAnimal(@PathVariable String animalName) {
		return new ResponseEntity<String>("Got animal " + animalName, HttpStatus.OK);
	}
	
	@RequestMapping(path = "/animals/{animalName}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteAnimal(@PathVariable String animalName) {
		return new ResponseEntity<String>("Deleted animal " + animalName, HttpStatus.OK);
	}
	
	@RequestMapping("/test") 
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("TEST", HttpStatus.OK);
	}
}
