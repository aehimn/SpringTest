package com.haemin.spring.test.jpa.domain;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder(toBuilder=true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name="`recruit`")
@Entity
public class Recruit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int companyId;
	private String position;
	private String responsibilities;
	private String qualification;
	private String type;
	private String region;
	private int salary;
	private LocalDateTime deadline;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	private LocalDateTime updatedAt;

}
