package com.slackerscode.sf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller(value = "/")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	String showHelloWorld(Model model) {
		if (!model.containsAttribute("user")) {
			model.addAttribute("user", "World");
		}
		return "index";
	}

	@RequestMapping(method = RequestMethod.POST)
	String saveHelloWorld(RedirectAttributes att, @ModelAttribute("user") String user) {
		att.addFlashAttribute("user", user);
		return "redirect:index";
	}

}
