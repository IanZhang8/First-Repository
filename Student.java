/** This is a complete class for a Student. You do not
	* need to make any modifications here. This is for 
	* your reference */
public class Student{
		private String firstName;
		private String lastName; 
		private double gpa;
		private int grade;
		/**
		*	Student constructor. @param n, the name of the student.
		*/
		public Student(String fn, String ln, double gp, int g){
				firstName = fn;
				lastName = ln;
				grade = g;
				gpa = gp;	
		}
		@Override
		public String toString(){
			return "Student Name:\t" + firstName + " " + lastName 
						+ "\nStudent Grade:\t" + grade
						+ "\nGPA:\t" + gpa
						+ "\n==========================\n";
		}
   //Accessors 
		public String getFirstName(){
			return firstName;
		}
		public String getLastName(){
			return lastName;
		}
		public int getGrade(){
			return grade;
		}
    public double getGpa(){
			return gpa;
		}
	//Mutators
		public void setLastName(String n){
			lastName = n;
		}
	
		public void setFirstName(String n){
			  firstName = n;
		}
		public void setGpa(double n){
			  gpa = n;
		}
		public void setGrade(int n){
			  grade = n;
		}
}