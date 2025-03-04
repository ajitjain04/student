//StudentOperations.java //CURD operations on ArrayList

import java.util.*;
class StudentOperations{
		ArrayList<Student> students;
		
		public StudentOperations(){
			this.students = new ArrayList<>();
		}

		public void addStudent(Student student){
			students.add(student);
			System.out.println("Students Added");
		
		}
		
		public void displayStudents(){
			if (students.isEmpty()) {
            		System.out.println("No students available to display.");
            		return;
        		}
	
}


