package com.springjpa.main.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	@Id
	@SequenceGenerator(name="cSeq", sequenceName = "courseSequence",initialValue = 100,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cSeq")
	private long courseId;
	private String courseTitle;
	private int credit;
	
	@OneToOne(mappedBy = "courseObjInMaterial")
	private CourseMaterial courseMaterial;
}
