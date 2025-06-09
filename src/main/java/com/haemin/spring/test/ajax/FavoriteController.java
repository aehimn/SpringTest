package com.haemin.spring.test.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax/favorite")
public class FavoriteController {

	@GetMapping("/list")
	public String list() {
		return "ajax/favorite/list";
	}
	
	@GetMapping("/input")
	public String input() {
		return "ajax/favorite/input";
	}
	
}
