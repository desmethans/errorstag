package org.example;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
class IndexController {
	@GetMapping
	ModelAndView index() {
		return new ModelAndView("index").addObject(new Person());
	}

	@PostMapping
	String index(@Valid Person person, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "index";
		}
		return "redirect:/";
	}
	
}
