package com.ibn.digiadminiportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibn.digiadminiportal.entity.Student;

@Repository 
public interface StudentRepository extends JpaRepository <Student, Long>{

}
