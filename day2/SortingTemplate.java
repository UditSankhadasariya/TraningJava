package day2;

import java.util.Arrays;
import java.util.Comparator;

public class SortingTemplate {
	public static Student [] sortByNameAsc(Student [] students) {
		Comparator<Student> comparatorSort = new Comparator<Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {
				return arg0.getsId() - arg1.getsId();
			}
			
		};
		
		Arrays.sort(students, comparatorSort);
		return students;
	}
}
