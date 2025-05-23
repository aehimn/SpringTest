package com.haemin.spring.test.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haemin.spring.test.mvc.domain.Seller;
import com.haemin.spring.test.mvc.service.SellerService;

@Controller
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@RequestMapping("/mvc/seller/info")
	public String sellerInfo(Model model) {
		Seller seller = sellerService.getLastSeller();
		model.addAttribute("result", seller);
		return "mvc/sellerInfo";
	}
	
	@RequestMapping("/mvc/seller/insert")
	public String insertSeller() {
		return "mvc/insertSeller";
	}

}
