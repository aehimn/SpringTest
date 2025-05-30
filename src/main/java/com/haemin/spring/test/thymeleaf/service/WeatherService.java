package com.haemin.spring.test.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haemin.spring.test.thymeleaf.domain.Weather;
import com.haemin.spring.test.thymeleaf.repository.WeatherRepository;

@Service
public class WeatherService {
	
	@Autowired
	private WeatherRepository weatherRepository;
	
	public List<Weather> getWeatherHistory() {
		List<Weather> weatherHistory = weatherRepository.selectWeatherHistory();
		return weatherHistory;
	}
	
	public int addWeather(
			String date
			, String weather
			, double temperatures
			, double precipitation
			, String microDust
			, double windSpeed) {
		int count = weatherRepository.insertWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		return count;
	}
	
	public int addWeatherByObject(Weather weather) {
		return weatherRepository.insertWeatherByObject(weather);
	}

}
