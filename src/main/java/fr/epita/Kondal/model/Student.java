package fr.epita.Kondal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) // for autonumber
	
	private int StudentId;
	@Column
	private String name;
	@Column
	private String email;

	public Student(){
		
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int studentId, String name, String email) {
		super();
		StudentId = studentId;
		this.name = name;
		this.email = email;
	}
	
}
