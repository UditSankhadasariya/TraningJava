package Project;

import java.util.Scanner;

public class Implementaion {
	public static void main(String[] args) {
	Teacher t = new Teacher();
	int option = 0;
	System.out.println("Select your Operation");
	System.out.println("1.Add a Student");
	System.out.println("2.hll");
	Scanner sc = new Scanner(System.in);
	option = sc.nextInt();
	switch(option) {
	case 1:
		t.addTeacher(1, "Udit", 5, "Maths", "98654578989", "abc@gmail.com", "Bandra West Mumbai");
		break;
	case 2:
		System.out.println("hll");
	}
	t.print();
	}
}
