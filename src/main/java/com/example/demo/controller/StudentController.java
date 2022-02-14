package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/s")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@PostMapping(path = "/addStudent/{id}")
	public Student saveStudent(@PathVariable int t_id ,@RequestBody Student student ) {
		return studentservice.saveStudent(t_id, student);

	}

	@PostMapping(path = "/addAllstudent")
	public List<Student> addAllStudent(@RequestBody List<Student> student) {
		return studentservice.saveStudents(student);
	}

	@GetMapping(path = "/getStudent")
	public List<Student> findAllStudents() {
		return studentservice.getStudents();
	}

	@GetMapping(path = "/StudentbyId/{id}")
	public Student findStudentById(@PathVariable int id) {
		return studentservice.getStudent(id);
	}

	@PutMapping(path = "/updatestudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentservice.updateStudent(student);

	}

	@DeleteMapping(path = "/Deletestudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentservice.deleteStudent(id);
	}

	@GetMapping("/Student/{name}")
	public List<Student> findStudentByName(@PathVariable String name) {
		return studentservice.getStudentByName(name);
	}


}
