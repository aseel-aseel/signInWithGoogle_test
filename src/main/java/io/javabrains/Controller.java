package io.javabrains;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
@GetMapping("/")
public String hello() {
	
	return "jhjuh";
}

@GetMapping("/ccc")
public String hellow() {
	
	return "ccc";
}


}
