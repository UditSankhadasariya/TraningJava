package ioTraining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class RweadWriteData {
	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new  InputStreamReader(Sytem.in));
		
		System.out.println("Enter Employee Id");
		int empId = Integer.parseInt(br.readLine());
		
		System.out.println("Enter your name");
		String empName = br.readLine();
		
		System.out.println("Enter the slary");
		double salary = Double.parseDouble(br.readLine());
		
		
		while((line = br.File.readLine())!=null) {
			System.out.println(line);
		}
		     
		
			private static void display(int empId, String empName, double salary1) {
			System.out.println(empId);
			System.out.println(empName);
			System.out.println(salary1);		
		}
		
	
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Emp.txt"));
		
		
		bw.write("EmpId:"+ empId);
		bw.write("EmpName" + empName);
		bw.write("EmpSal"+ salary);
	
	
		bw.write(empId);
		
		
	}

}
