package com.ibn.digiadminiportal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "student")
public class Student {
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String studentName;
	
	private String subject;
	
	@Column (name = "stumark_100")
	private int studentmark ;
}
//	"studentName" : "omkar jadhav",
//	"subject" : "Histroy",
//	"studentmark" : 100/50