package com.training;

public class ExceptionApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Employee emp = new Employee("asdf", "skilled", 101, 5000);
		} catch (EmpException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		finally{
			
		}
	}

}
