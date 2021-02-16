package com.punith.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="userdetails")
public class UserDetails {
	
	@Id
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="mobile_number")
	private int number;
}
