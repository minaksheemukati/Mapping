package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherService {
	@Autowired
	private TeacherRepository teacherRepo;

	public List<Teacher> getTeachers() {
		System.out.println(teacherRepo.findAll());
		return teacherRepo.findAll();
	}

	public List<Teacher> saveTeachers(List<Teacher> teachers) {
		return teacherRepo.saveAll(teachers);
	}

	public Teacher getTeacher(int id) {
		return teacherRepo.findById(id).orElse(null);
	}

	public String deleteTeacher(int id) {
		teacherRepo.deleteById(id);
		return "removed product..||" + id;
	}

	public Teacher updateTeacher(Teacher teacher) {
		Teacher existteacher = teacherRepo.findById(teacher.getId()).orElse(null);
		existteacher.setName(teacher.getName());
		existteacher.setCity(teacher.getCity());
		existteacher.setSubject(teacher.getCity());
		return teacherRepo.save(existteacher);
	}

//	public Student getStudentByName(String name) {
//		return studentrepo.findbyName(name);
//
//	}

	public Teacher saveTeacher(Teacher teacher) {
		List<Student> students=new ArrayList<>();
		Student student=new Student();
    	students.add(student);
	  teacher.setStudents(students);
	//	teacher.setStudent(student);
		return teacherRepo.save(teacher);
	}

}
