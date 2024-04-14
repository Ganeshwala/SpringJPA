package com.springjpa.main.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

	@Id
	private long teacherId;
	private String firstName;
	private String lastName;
	
	/*@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacher_Id",referencedColumnName = "teacherId")
	private List<Course> courseObjInTeacher;*/
}
