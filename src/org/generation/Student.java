package org.generation;

   public class Student {
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;

       
   public Student(String firstName, String lastName, int registration, int grade, int year) {
	   super();
	   this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}//constructor
       
       

    public Student(String firstName, String lastName) {
		this(firstName, lastName, 0,0,1);
	}
    
    public void printFullName(){
    	      //TODO implement
    	System.out.println(firstName + " "+ lastName);  	   
    }

    public boolean isApproved(){
    	       //TODO implement: should return true if grade >= 60
	   if (grade>=60) {
		   return true;
	   }	   
	   		return false;
    	}

   	public int changeYearIfApproved(){
    	       //TODO implement: the student should advance to the next year if he/she grade is >= 60
    	       // Make year = year + 1, and print "Congragulations" if the student has been approved
   		if (isApproved()) {
    	    	  year = year +1;
    	    	  System.out.println("Felicidades pasaste");
    	       }
    		   return year;
    	   }
       
   }