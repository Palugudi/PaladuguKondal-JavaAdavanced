package fr.epita.Kondal.Services;

import java.util.List;

import fr.epita.Kondal.model.Student;

public interface StudentServices {
	public void add(Student student);
	public void update(Student student);
	public void delete(int studentId);
	
	public Student getStudent(int studentId);
	public List getAllStudent();
	

}
