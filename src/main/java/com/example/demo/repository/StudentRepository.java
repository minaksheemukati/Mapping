package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
	public interface StudentRepository extends JpaRepository<Student, Integer>
	{
	  @Query(value="SELECT * FROM STUDENT_TABLE  WHERE name = 'pooja'", nativeQuery = true)
	List<Student> findbyName(String name);
//	@Query(value="select s.id, s.stname, c.coursename from student s Inner JOIN course c ON s.course=c.id", nativeQuery=true)
//	List<Object[]> findStudent();
//select u from User u where u.emailAddress = ?1
//	Student findbyName(String name);
	}


