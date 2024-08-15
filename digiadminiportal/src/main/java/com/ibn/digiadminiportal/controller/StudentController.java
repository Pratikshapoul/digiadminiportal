package com.ibn.digiadminiportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibn.digiadminiportal.entity.Student;
import com.ibn.digiadminiportal.service.StudentService;

@RestController
@RequestMapping ("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping ("/Create-data")
	public ResponseEntity <Student> createStudent (@RequestBody Student student ){
	Student createAccount = studentService.createAccount(student);
	return new ResponseEntity <> (createAccount,HttpStatus.CREATED) ;

	}
	
}