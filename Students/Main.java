//Main.java

import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int choice = 1 ;
		StudentOperations operations = new StudentOperations();

		do{//mUltiple students
		System.out.println("Enter Name:");
		String name = scan.nextLine();

		System.out.println("Enter PRN:");
		int prn = Integer.parseInt(scan.nextLine());

		System.out.println("Enter Branch:");
                String branch = scan.nextLine();

            	System.out.println("Enter Batch:");
            	String batch = scan.nextLine();

            	System.out.println("Enter CGPA:");
            	float cgpa = Float.parseFloat(scan.nextLine());



		Student student = new Student(name ,prn ,branch, batch, cgpa);
		operations.addStudent(student);//Adding student

		System.out.println("Enter choice 1.Continue 2.Exit:");
		choice = Integer.parseInt(scan.nextLine());
		}while(choice !=2);

		operations.displayStudents();//Display students

		

	}

}

