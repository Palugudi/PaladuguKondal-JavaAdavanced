package fr.epita.Kondal.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.epita.Kondal.Services.StudentServices;
import fr.epita.Kondal.model.Student;

@Controller
public class StudentController {
	
@Autowired
	private StudentServices studentServices;

    @RequestMapping("/index")  
    public String setupForm(Map<String, Object>map){
    	Student student = new Student();
    	map.put("student", student);
    	map.put("studentList", studentServices.getAllStudent());
    	return "student";
    	
    	}
    @RequestMapping(value="/student.do", method=RequestMethod.POST)
    public String doActions(@ModelAttribute Student student, BindingResult result, @RequestParam String action, Map<String, Object>map ){
    	Student studentResult = new Student();
    	switch(action.toLowerCase()) {   // only in Java7 you can put String in switch
    	case "add":
    		studentServices.add(student);
    		studentResult = student;
    		break;
    	case "upadate":
    		studentServices.update(student);
    		studentResult = student;
    		break;
    	case "delete":
    		studentServices.delete(student.getStudentId());
    		studentResult =new  Student();
    		break;
    	case "search":
    		Student searchedStudent = studentServices.getStudent(student.getStudentId());
    		studentResult = searchedStudent!=null ? searchedStudent : new Student();
    		break;
    	}
    	map.put("student", studentResult);
    	map.put("studentList", studentServices.getAllStudent());
    	
    	return "student";
    }
}
