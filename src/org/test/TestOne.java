package org.test;


public class TestOne {
	
	private void empName() {

		System.out.println("Employee name is : Anand");

	}

	private void empMobNo() {

		System.out.println("Employee mobile number is : 8667070832");

	}

	private void empId() {
		System.out.println("Employee id is : 6546");
	}
	
	private void empLocation() {
		
		System.out.println("Banglore");
	}

	public static void main(String[] args) {

		TestOne ed = new TestOne();

		ed.empId();
		ed.empMobNo();
		ed.empName();

	}

}
