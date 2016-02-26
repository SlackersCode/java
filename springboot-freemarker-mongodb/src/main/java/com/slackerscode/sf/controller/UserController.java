package com.slackerscode.sf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.slackerscode.sf.model.User;
import com.slackerscode.sf.model.UserForm;
import com.slackerscode.sf.repository.UserRepository;

@Controller
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	String showUsersPage(Model model) {
		
		model.addAttribute("user", new UserForm());
		model.addAttribute("users",userRepository.findAll());
		
		return "user";
	}

	@RequestMapping(method = RequestMethod.POST)
	String saveUser(RedirectAttributes att, @ModelAttribute("user") UserForm user) {
		userRepository.save(new User(user.getUsername(), user.getPassword()));
		att.addFlashAttribute("success", "User created!");
		return "redirect:user";
	}

}
