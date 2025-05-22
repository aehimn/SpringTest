package com.haemin.spring.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.haemin.spring.test.mybatis.domain.RealEstate;

@Mapper
public interface RealEstateRepository {
	
	public RealEstate selectRealEstate(@Param("id") int id);

	public List<RealEstate> selectRealEstateByRentPrice(@Param("rentPrice") int rentPrice);
	
	public List<RealEstate> selectRealEstateByAreaAndPrice(
			@Param("area") int area
			, @Param("price") int price);
	
	public int insertRealEstateByObject(RealEstate realEstate);
	
}
