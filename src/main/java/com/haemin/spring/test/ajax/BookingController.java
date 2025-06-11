package com.haemin.spring.test.ajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.haemin.spring.test.ajax.domain.Booking;
import com.haemin.spring.test.ajax.service.BookingService;

@Controller
@RequestMapping("/ajax/booking")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/list")
	public String bookingList(Model model) {
		List<Booking> bookingList = bookingService.getBookingList();
		model.addAttribute("bookingList", bookingList);
		return "/ajax/booking/list";
	}
	
	@GetMapping("/delete")
	public  deleteBooking(@RequestParam("id") int id) {
		// 하는중
	}

}
