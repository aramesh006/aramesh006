package org.css;

public class EmployeeNotFoundException extends Exception {
	@Override
	public String getMessage() {
		String mess = "Employee Not Found";
		return mess;
	}
	

}
