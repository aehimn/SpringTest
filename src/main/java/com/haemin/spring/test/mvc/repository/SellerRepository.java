package com.haemin.spring.test.mvc.repository;

import org.apache.ibatis.annotations.Mapper;

import com.haemin.spring.test.mvc.domain.Seller;

@Mapper
public interface SellerRepository {
	
	public Seller selectLastSeller();

}
