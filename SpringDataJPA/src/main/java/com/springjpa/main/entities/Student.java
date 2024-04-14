package com.springjpa.main.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
		name = "Students",
		uniqueConstraints = @UniqueConstraint(
				name = "email_Unique",
				columnNames = "StudentEmail" // @UniqueConstraint will check this particular column can not be same value it should be unique value
		))
@Builder // this will create instance of class so we don't need to define or create object like student s = new student();
/* or we can also use @Data annotation which will do both below annotation*/
@Getter // annotation will generate getter method for you
@Setter // annotation will generate setter method for you 
@AllArgsConstructor // this will create argument constructor for you
@NoArgsConstructor // this will create no-argument constructor for you
public class Student {

	@Id
	@SequenceGenerator(
			name = "s_sequence",// this is reference name this we use for us
			sequenceName = "student_sequence", //this name is store in database sequence for reference for studentSequence   
			initialValue = 100,
			allocationSize = 1 //what is increment value
			)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "s_sequence")
	@Column(name = "S_Id" ,nullable = false)
	private Long studentId;
	
	@Column(name="StudentFirstName", nullable = false)
	private String firstName;
	
	@Column(name="StudentLastName", nullable = false)
	private String lastName;
	
	@Column(name="StudentEmail", nullable = false)
	private String email;
	
	//private Address address;
	
	@Column(name="BirthDate", nullable = false)
	private Date dob;
	
	@Embedded
	private Address address;
	
	private String guardianName;
	private String guardianEmail;
	private String guardianPhone;
	
}
