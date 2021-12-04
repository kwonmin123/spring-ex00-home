package org.zerock.controller.p01controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class Controller03 {


	@RequestMapping("/met01")
	public void method01(String name , Integer age) {

		
		System.out.println("met1실행");
		System.out.println(name);
		System.out.println(age);
		
	}

	@RequestMapping("/met02")
	public void method02(@RequestParam("name") String first, @RequestParam("age") Integer howold) {
	

		System.out.println("met2실행");
		System.out.println(first);
		System.out.println(howold);
	}

	@PostMapping("/met03")
	public void method03() {

	}


	@GetMapping("/met04")
	public void method04() {

	}

	@RequestMapping(value="/met05", method = {RequestMethod.GET, RequestMethod.POST})
	public void method05() {

	}


}
