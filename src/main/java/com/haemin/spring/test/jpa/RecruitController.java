package com.haemin.spring.test.jpa;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haemin.spring.test.jpa.domain.Recruit;
import com.haemin.spring.test.jpa.repository.RecruitRepository;

@Controller
@RequestMapping("/jpa/recruit")
public class RecruitController {
	
	@Autowired
	private RecruitRepository recruitRepository;
	
	@ResponseBody
	@GetMapping("/find-by-id")
	public Recruit findRecruitById() {
		Optional<Recruit> optionalRecruit = recruitRepository.findById(8);
		Recruit recruit = optionalRecruit.get();
		return recruit;
	}

	@ResponseBody
	@GetMapping("/find-by-company-id")
	public List<Recruit> findRecruitByCompanyId(@RequestParam("companyId") int companyId) {
		List<Recruit> recruitList = recruitRepository.findByCompanyId(companyId);
		return recruitList;
	}
	
	@ResponseBody
	@GetMapping("/find")
	public List<Recruit> findRecruit() {
		List<Recruit> recruitList = null;
//		recruitList = recruitRepository.findByPositionAndType("웹 back-end 개발자", "정규직");
//		recruitList = recruitRepository.findByTypeOrSalaryGreaterThanEqual("정규직", 9000);
//		recruitList = recruitRepository.findTop3ByTypeOrderBySalaryDesc("계약직");
//		recruitList = recruitRepository.findByRegionAndSalaryBetween("성남시 분당구", 7000, 8500);
		recruitList = recruitRepository.selectByQuery(LocalDate.of(2026, 4, 10), 8100, "정규직");
		return recruitList;
	}

}
