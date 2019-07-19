package day2;

import java.util.Arrays;

public class StudentSort {
	public static void main(String[] args) {
		Student [] students = {
				new Student (100,"udit",1),
				new Student (1001,"asdf",147),
				new Student (10,"asdF",145),
		};
		for(Student temp : students) {
			System.out.println(temp);
		}
//		Arrays.sort(students);
		
		SortingTemplate.sortByNameAsc(students);
		
		System.out.println("___________");
		
		for(Student temp : students) {
			System.out.println(temp);
		}
		
		Arrays.binarySearch(arr,id);
		
	}
	
}
