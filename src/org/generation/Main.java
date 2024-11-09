///https://github.com/generation-org/JAVA/tree/master/Object%20Oriented%20Programming%20-%20Fundamentals
package org.generation;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Miguel = new Student("Miguel", "Gonzales");
		Student dita = new Student("Diana", "Fernanda", 0,99, 0);
		Student amparo = new Student("Sonia", "Garibay",0,80,1);

		Miguel.printFullName();
		dita.printFullName();
		amparo.printFullName();
		Courses java = new Courses("JAva", "Deitel", 1);
		
		java.enroll(amparo);
		java.enroll(dita);
		java.enroll(Miguel);
		
		System.out.println(Miguel.changeYearIfApproved());
		System.out.println(dita.changeYearIfApproved());
		
		java.unEnroll(Miguel);
		
		System.out.println(java.bestGrade());
		System.out.println(java.countStudents());
		
	}

}
