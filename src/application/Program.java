package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> students = new HashSet<Integer>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int number = sc.nextInt();
			students.add(number);
		}
		
		System.out.print("How many students for couse B? ");
		int m  = sc.nextInt();
		
		for (int i = 1; i<= m; i++) {
			int number = sc.nextInt();
			students.add(number);
		}
		
		System.out.print("How many students for couse C? ");
		int x = sc.nextInt();
		
		for(int i =1; i <= x; i++) {
			int number = sc.nextInt();
			students.add(number);
		}
		
		System.out.println("Total students: " + students.size());
		
		sc.close();
	}

}
