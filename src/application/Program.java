package application;

import java.util.Locale;
import java.util.Scanner;

import model.entitie.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		
		System.out.print("How many course: ");
		int n = sc.nextInt();
		
		System.out.print ("How many students");
		int M = sc.nextInt();
		
		for(int i = 1; i<= n; i++) {
			System.out.println("couse #" + i);
			for(int j = 1; j <= M; j++) {
				System.out.print("number: ");
				int number = sc.nextInt();
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Teacher's course:");
				String teachersCourse = sc.nextLine();
				System.out.print("Couser: ");
				char course = sc.next().charAt(0);
				student.getStudant().add(new Student(number, name, teachersCourse, course));				
			}
		}
		
		for(Student st : student.getStudant()) {
			System.out.println(st.getNumber());			
		}		
		sc.close();
	}

}
