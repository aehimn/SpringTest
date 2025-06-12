package com.haemin.spring.test.ajax.repository;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.haemin.spring.test.ajax.domain.Booking;

@Mapper
public interface BookingRepository {
	
	public List<Booking> selectBookingList();

	public int deleteBooking(@Param("id") int id);
	
	public int insertBooking(
			@Param("name") String name
			, @Param("date") LocalDate date
			, @Param("day") int day
			, @Param("headcount") int headcount
			, @Param("phoneNumber") String phoneNumber
			, @Param("state") String state);
	
	public Booking selectBookingByNameAndPhoneNumber(
			@Param("name") String name
			, @Param("phoneNumber") String phoneNumber);
	
}
