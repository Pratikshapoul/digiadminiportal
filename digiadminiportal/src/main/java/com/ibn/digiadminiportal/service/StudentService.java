package com.ibn.digiadminiportal.service;


import org.springframework.stereotype.Service;

import com.ibn.digiadminiportal.entity.Student;

@Service
public interface StudentService {


	public Student createAccount(Student student);

	
}
