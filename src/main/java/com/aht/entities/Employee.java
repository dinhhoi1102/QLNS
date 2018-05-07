package com.aht.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column
	private String name;
	@Column
	private Date birthday;
	@Column
	private int sex;
	@Column
	private String insurance;
	@Column
	private String address;
	@Column
	private String phone;
	@Column
	private int level;
	
}
