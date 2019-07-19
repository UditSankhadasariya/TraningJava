package test.basic;
class Employee{
	int empId;
	String empName;
	double empSal;
	
	public setEmpName(String empName) {
		this.empName=empName;
		if(empName.length()<3) {
			System.out.println("Small");
			this.empName="NA";
		}
		
	}
	
	public setEmpId(String empid) {
		this.empId=empId;
		
	}
	
	public display() {
		System.out.println(empName);
		System.out.println(empId);
	}
}