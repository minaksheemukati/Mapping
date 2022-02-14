package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.example.demo.repository.StudentRepository;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentService {
	@Autowired
	private TeacherService teacherService;

	@Autowired
	private StudentRepository studentrepo;

	public List<Student> getStudents() {
		System.out.println(studentrepo.findAll());
		return studentrepo.findAll();
	}

	public List<Student> saveStudents(List<Student> students) {
		return studentrepo.saveAll(students);
	}

	public Student getStudent(int id) {
		return studentrepo.findById(id).orElse(null);
	}

	public String deleteStudent(int id) {
		studentrepo.deleteById(id);
		return "removed product..||" + id;
	}

	public Student updateStudent(Student student) {
		Student existstudent = studentrepo.findById(student.getId()).orElse(null);
		existstudent.setName(student.getName());
		existstudent.setBirthdate(student.getBirthdate());
		existstudent.setCity(student.getCity());
		existstudent.setInstitute(student.getInstitute());
		return studentrepo.save(existstudent);
	}

	public Student saveStudent(int t_id,Student student ) {
		Teacher teacher=teacherService.getTeacher(t_id);
		student.setTeacher(teacher);
		student = studentrepo.save(student);
		return student;

	}

	
	
	public List<Student> getStudentByName(String name) {
	return studentrepo.findbyName(name);

}

}