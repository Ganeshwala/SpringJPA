package com.springjpa.main.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseMaterial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseMaterialId;
	private String url;
	@JoinColumn(
			name="course_Id", // what will be join column in DB 
			referencedColumnName = "courseId" //class field name that we want to refer here
			)
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Course courseObjInMaterial;
}
