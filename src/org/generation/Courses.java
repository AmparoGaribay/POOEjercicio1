package org.generation;

import java.util.ArrayList;
import java.util.List;

public class Courses {
	public String courseName; 
	public String professorName; 
	public int year;
	List<Student> enrrolled = new ArrayList<Student>();
	
	public Courses(String courseName, String professorName, int year) {
		super();
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}

	public void enroll(Student student){
		 //TODO add the student to the collection
		 enrrolled.add(student);
		   
	}
	
	public void enroll(Student[] students){
		//TODO add the student to the collection
		for (Student student : students) {
		 enroll(student);
	   	}  
	}

	public void unEnroll(Student student){
	//TODO remove this student from the collection
		// Hint: check if that really is this student
			 ///if if (enrrolled.indexOf(student)!=-1){ 
		 if (enrrolled.contains(student)) {
			enrrolled.remove(student);
		}
	}

	public int countStudents(){
		return enrrolled.size();
	}
		   
	public int bestGrade(){
		int best=0;
		for (Student student : enrrolled) {
			if(student.grade>best) {
						best= student.grade;
			}
		}
		       return best;
	}

}
