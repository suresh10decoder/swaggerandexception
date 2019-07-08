package com.model.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.model.test.model.StudentModel;
//custom exception
@ResponseStatus(HttpStatus.NOT_FOUND)
//custom exception
public interface StudentRepository extends JpaRepository<StudentModel,Long>{


}
