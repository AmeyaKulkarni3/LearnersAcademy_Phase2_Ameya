package com.learnersacademy.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	
	@Column(nullable = false)
	private String fistName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private LocalDate dateOfBirth;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String phone;
	
	@ManyToOne
	@JoinColumn(name="class_offered_id", nullable = true)
	private ClassOffered classJoined;

	public Student() {
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int id) {
		this.studentId = id;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public ClassOffered getClassJoined() {
		return classJoined;
	}

	public void setClassJoined(ClassOffered classJoined) {
		this.classJoined = classJoined;
	}

	@Override
	public String toString() {
		return "Student [fistName=" + fistName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", address=" + address + ", phone=" + phone + ", classJoined=" + classJoined + "]";
	}
	
	

}
