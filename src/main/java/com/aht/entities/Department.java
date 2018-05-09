package com.aht.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column
	private String name;
	
	@ManyToOne
	@JoinColumn(name="idDepartment")
	private Parts parts;

	@ManyToOne
	@JoinColumn(name="idEmployee")
	private Employee employee;
	
	
	
	public Department(Employee employee) {
		super();
		this.employee = employee;
	}


	public Department( String name) {
			
		this.name = name;
		
	}
	

	public Department() {
		
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Parts getParts() {
		return parts;
	}


	public void setParts(Parts parts) {
		this.parts = parts;
	}




	
	
}
