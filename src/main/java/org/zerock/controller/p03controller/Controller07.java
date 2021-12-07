package org.zerock.controller.p03controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/cont07")
public class Controller07 {

	
	public String met1() {
		
		System.out.println("cont7 met1 일함!");
	
	return "redirect:/cont07/met02";
	}
	
	@RequestMapping("/met03")
	private String met03(RedirectAttributes rtt) {
		rtt.addAttribute("city", "seoul");
		rtt.addAttribute("country", "korea");
		return "redirect:/cont07/met04";
	}
}
