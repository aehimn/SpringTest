package com.haemin.spring.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haemin.spring.test.database.domain.Store;
import com.haemin.spring.test.database.service.StoreService;

@Controller
public class StoreController {
	
	@Autowired
	private StoreService storeService;

	// 가제 정보를 모두 response에 담는다
	@ResponseBody
	@RequestMapping("/db/store/list")
	public List<Store> storeList() {
		
		// 가게 정보 목록 얻어 오기
		List<Store> storeList = storeService.getStoreList();
		
		return storeList;
		
	}
	
}
