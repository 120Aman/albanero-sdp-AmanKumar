package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@Autowired
private Returning Obj;
@GetMapping("/String/{T}")
public String Return(@PathVariable(value="T")  String Q) {
	String V= Obj.returnvalues(Q);
	    return V;
	  }

}
