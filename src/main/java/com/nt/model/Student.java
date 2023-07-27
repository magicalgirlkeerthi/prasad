package com.nt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

 

 @Data
@Entity
@Table(name="student_management_Data")
public class Student implements Serializable{
   @Id
   @SequenceGenerator(name="gen1",sequenceName ="student_id_seq",allocationSize = 1,initialValue = 1)
   @GeneratedValue(generator="gen1" ,strategy = GenerationType.SEQUENCE)
	private Integer studentId;
   
   @Column(length=20)
	private String studentName;
   
   @Column(length=20)
	private String  studentBranch;
   
   @Column(length=20)
	private String  studentAddrs;
   
   @Column(length=30)
	private String studentEmailId;
   
	private Float studentFee;
	
}
