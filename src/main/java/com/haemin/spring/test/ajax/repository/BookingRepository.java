package com.haemin.spring.test.ajax.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.haemin.spring.test.ajax.domain.Booking;

@Mapper
public interface BookingRepository {
	
	public List<Booking> selectBookingList();

}
