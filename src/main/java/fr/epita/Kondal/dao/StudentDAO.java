package fr.epita.Kondal.dao;

import java.util.List;

import fr.epita.Kondal.model.Student;

public interface StudentDAO {
	public void add(Student student);
	public void update(Student student);
	public void delete(int studentId);
	
	public Student getStudent(int studentId);
	public List getAllStudent();
	
}
