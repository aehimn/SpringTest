package com.haemin.spring.test.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haemin.spring.test.mybatis.domain.RealEstate;
import com.haemin.spring.test.mybatis.service.RealEstateService;

@Controller
@RequestMapping("/mybatis/real-estate/select")
public class RealEstateController {
	
	@Autowired
	private RealEstateService realEstateService;
	
	@ResponseBody
	@RequestMapping("/1")
	public RealEstate realEstateId(@RequestParam("id") int id) {
		
		RealEstate realEstate = realEstateService.getRealEstateId(id);
		return realEstate;
		
	}
	
	@RequestMapping("/2")
	public  realEstateRentPrice(@RequestParam("rent") int rent) {
		// 2번 문제 풀기 시작함
	}

}
