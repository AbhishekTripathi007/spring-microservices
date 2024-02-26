package com.sewa_app.surveyService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/survey")
public class surveyController {
	@ResponseBody
	@RequestMapping(value = "/home")
	public String home() {
		return "How are you";
	}

}
