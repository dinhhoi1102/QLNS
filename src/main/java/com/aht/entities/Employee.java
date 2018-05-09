package com.aht.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column
	private String name;
	@Column
	@Temporal(TemporalType.DATE)
//	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date birthday;
	@Column
	private int sex;
	@Column
	private String insurance;
	@Column
	private String address;
	@Column
	@Pattern(regexp = "[\\s]*[0-9]*[1-9]+",message="not a phone number")
	private String phone;
	@Column
	private int level;
	
	@OneToMany(mappedBy="employee")
	private List<TrainingEmployee> trainingEmployees;
	
	
	public List<TrainingEmployee> getTrainingEmployees() {
		return trainingEmployees;
	}



	public void setTrainingEmployees(List<TrainingEmployee> trainingEmployees) {
		this.trainingEmployees = trainingEmployees;
	}


	@OneToMany(mappedBy="employee")
	private List<Department> department;
	
	@OneToMany(mappedBy="employee")
	private List<ContractEmployee> contractEmployee;

	public String getName() {
		return name;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}


	public Employee(List<ContractEmployee> contractEmployee) {
	
		this.contractEmployee = contractEmployee;
	}

	public Employee() {
		
	}


	public Employee(String name, Date birthday, int sex, String insurance, String address, String phone, int level) {
		
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.insurance = insurance;
		this.address = address;
		this.phone = phone;
		this.level = level;
	}
	
	
}
