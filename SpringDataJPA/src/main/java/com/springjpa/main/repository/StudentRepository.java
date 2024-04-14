package com.springjpa.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springjpa.main.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	//JPQL
	@Query("select s from Student s where s.email=:studentEmail")
	public Student getStudentByEmailId(@Param("studentEmail") String email);
	
	@Query(value="select * from Student where email=:emailId and lastName=:lname ",nativeQuery = true)
	public Student getStudentBYEmailIdandLastName(@Param("emailId")String email,@Param("lname")String lastName);
}
