package com.model.test.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.test.exception.InvalidLengthName;
import com.model.test.model.StudentModel;
import com.model.test.service.StudentService;

//swagger 
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
//swagger

@RestController
@RequestMapping("studentdetail")

//swagger
@Api(value="online book",description="operation to be performed")
//swagger

public class StudentController  {
@Autowired
StudentService service;

//swagger
@ApiOperation(value="view list of options",response=Iterable.class)
@ApiResponses(value= {
		   @ApiResponse(code = 200, message = "Successfully retrieved list"),

            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),

            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),

            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
})
//swagger

@PostMapping("insert")
public StudentModel insert(@RequestBody StudentModel add)
{
	return service.insert(add);
}
@GetMapping("getall")
public  ArrayList<StudentModel> getall()
{
	return service.getall();
}
//custom exception
@PutMapping("update/{id}")
public StudentModel update(@PathVariable long id,@RequestBody StudentModel alter) throws InvalidLengthName 
{
	return service.update(id,alter);
}//custom exception
@DeleteMapping("delete/{id}")
public long delete(@PathVariable long id,@RequestBody StudentModel cancel)
{
	return service.delete(id);
}
@DeleteMapping("delete")
public void deleteAll()
{
	service.deleteAll();
}
@GetMapping("getbyid/{id}")
public Optional<StudentModel> getById(@PathVariable long id)
{
	return service.getById(id);
}
}