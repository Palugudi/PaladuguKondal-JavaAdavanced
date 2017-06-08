package fr.epita.Kondal.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.epita.Kondal.dao.StudentDAO;
import fr.epita.Kondal.model.Student;

@Repository
public class StudentDaoimpl implements StudentDAO {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Student student) {
		session.getCurrentSession().save(student);
		
	}

	@Override
	public void update(Student student) {
		session.getCurrentSession().update(student);
	}

	@Override
	public void delete(int studentId) {
		
		session.getCurrentSession().delete(getStudent(studentId));
	}

	@Override
	public Student getStudent(int studentId) {
		return (Student)session.getCurrentSession().get(Student.class, studentId);
	}

	@Override
	public List getAllStudent() {
	
		return session.getCurrentSession().createQuery("from Student").list();
	}

}
