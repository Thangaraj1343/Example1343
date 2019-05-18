package com.mazomlm.MazoMLM;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/asdfg")
	public String getString()
	{
		return "Hello";
	}
}
