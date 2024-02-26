package com.sewa_app.uiService.controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ui")
public class UIController {
	@GetMapping(value = "/index")
	public String index() throws IOException {
		// Load the contents of the index.html file from the classpath
		ClassPathResource resource = new ClassPathResource("static/index.html");
		try (Reader reader = new InputStreamReader(resource.getInputStream())) {
			return FileCopyUtils.copyToString(reader);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/home")
	public String home() {
		return "How are you";
	}
}