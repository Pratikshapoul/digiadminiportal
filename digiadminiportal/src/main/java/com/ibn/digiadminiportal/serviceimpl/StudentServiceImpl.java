package com.ibn.digiadminiportal.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibn.digiadminiportal.entity.Student;
import com.ibn.digiadminiportal.repository.StudentRepository;
import com.ibn.digiadminiportal.service.StudentService;
@Component
public class StudentServiceImpl implements StudentService {

	@Autowired 
	private StudentRepository studentRepository;

	@Override
	public Student createAccount(Student student) {
		Student createdAccount = studentRepository.save(student);
		return createdAccount;
	}

	

	

	

	
}
