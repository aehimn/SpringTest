package com.haemin.spring.test.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haemin.spring.test.mybatis.domain.RealEstate;
import com.haemin.spring.test.mybatis.repository.RealEstateRepository;

@Service
public class RealEstateService {
	
	@Autowired
	private RealEstateRepository realEstateRepository;
	
	public RealEstate getRealEstateId(int id) {
		
		RealEstate realEstate = realEstateRepository.selectRealEstateId(id);
		return realEstate;
	}

}
