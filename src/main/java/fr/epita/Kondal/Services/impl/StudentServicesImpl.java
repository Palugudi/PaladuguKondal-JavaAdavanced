package fr.epita.Kondal.Services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epita.Kondal.Services.StudentServices;
import fr.epita.Kondal.dao.StudentDAO;
import fr.epita.Kondal.model.Student;

@Service
public class StudentServicesImpl implements StudentServices {
	@Autowired
	private StudentDAO studentDAO;

	@Transactional
	public void add(Student student) {
		studentDAO.add(student);
	}

	@Transactional
	public void update(Student student) {
		studentDAO.update(student);
	}

	@Transactional
	public void delete(int studentId) {
		studentDAO.delete(studentId);
	}

	@Transactional
	public Student getStudent(int studentId) {
		return studentDAO.getStudent(studentId);
	}

	@Transactional
	public List getAllStudent() {
		return studentDAO.getAllStudent() ;
	}

}
