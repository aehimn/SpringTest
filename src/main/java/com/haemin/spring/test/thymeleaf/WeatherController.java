package com.haemin.spring.test.thymeleaf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.haemin.spring.test.thymeleaf.domain.Weather;
import com.haemin.spring.test.thymeleaf.service.WeatherService;

@Controller
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;

	@GetMapping("/thymeleaf/weather/list")
	public String test04(Model model) {
		
		List<Weather> weatherHistory = weatherService.getWeatherHistory();
		
		model.addAttribute("weatherHistory", weatherHistory);
		
		return "thymeleaf/weather/list";
	}

}
