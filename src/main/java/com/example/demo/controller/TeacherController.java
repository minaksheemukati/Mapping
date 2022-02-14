package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
//@RequestMapping("/starting")
@RestController
public class TeacherController {
	@Autowired
	private TeacherService teacherService;

	@PostMapping(path = "/AddTeacher")
	public Teacher addTeacher(@RequestBody Teacher teacher ) {
		return teacherService.saveTeacher(teacher);

	}

	@PostMapping(path = "/addAllTeacher")
	public List<Teacher> addAllTeacher(@RequestBody List<Teacher> teachers) {
		return teacherService.saveTeachers(teachers);
	}

	@GetMapping(path = "/getTeacher")
	public List<Teacher> findAllTeachers() {
		return teacherService.getTeachers();
	}

	@GetMapping(path = "/TeacherbyId/{id}")
	public Teacher findTeacherById(@PathVariable int id) {
		return teacherService.getTeacher(id);
	}

//	@GetMapping("/Product/{name}")
//	public Student findStudentByName(@PathVariable String name) {
//		return studentservice.getStudentByName(name);
//	}

	@PutMapping(path = "/updateteacher")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		return teacherService.updateTeacher(teacher);

	}

	@DeleteMapping(path = "/Deleteteacher/{id}")
	public String deleteTeacher(@PathVariable int id) {
		return teacherService.deleteTeacher(id);
	}

}
