package com.sewa_app.usersService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsersController {
	
	@ResponseBody
	@GetMapping("/view")
	public String home() {
		return "Default Page";

	}
	
    @GetMapping("/gfg") 
    public ResponseEntity<String> getAnonymous() { 
        return ResponseEntity.ok("Welcome to GeeksforGeeks"); 
    } 

}
