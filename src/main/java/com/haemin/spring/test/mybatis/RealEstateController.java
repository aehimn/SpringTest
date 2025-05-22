package com.haemin.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haemin.spring.test.mybatis.domain.RealEstate;
import com.haemin.spring.test.mybatis.service.RealEstateService;

@Controller
@RequestMapping("/mybatis/real-estate")
public class RealEstateController {
	
	@Autowired
	private RealEstateService realEstateService;
	
	@ResponseBody
	@RequestMapping("/select/1")
	public RealEstate realEstate(@RequestParam("id") int id) {
		
		RealEstate realEstate = realEstateService.getRealEstate(id);
		return realEstate;
		
	}
	
	@ResponseBody
	@RequestMapping("/select/2")
	public List<RealEstate> realEstateByRentPrice(@RequestParam("rent") int rentPrice) {
		List<RealEstate> realEstateList = realEstateService.getRealEstateByRentPrice(rentPrice);
		return realEstateList;
	}
	
	@ResponseBody
	@RequestMapping("/select/3")
	public List<RealEstate> realEstateByAreaAndPrice(
			@RequestParam("area") int area
			, @RequestParam("price") int price) {
		List<RealEstate> realEstateList = realEstateService.getRealEstateByAreaAndPrice(area, price);
		return realEstateList;
	}
	
	@ResponseBody
	@RequestMapping("/insert/1")
	public String createRealEstateByObject() {
		RealEstate realEstate = new RealEstate();
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);

		int count = realEstateService.addRealEstateByObject(realEstate);
		return "입력 성공 : " + count;
		// mysql real_estate 재부팅
	}

}
