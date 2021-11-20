package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController 
{
	@GetMapping("api/sample")
	public ResponseEntity<?> samplecheck(){
		return ResponseEntity.ok("Hello world");
	}
	
	@GetMapping("api/exit")
	public ResponseEntity<?> exitcheck(){
		return ResponseEntity.ok("Exit");
				
	}	
}
