package org.cloning;

public class Sample implements Cloneable {
	
	int a ;
	String s;
	Employee employee;
	public void ssd(int a, String s) {
		this.a=a;
		this.s=s;
		employee = new Employee();
		employee.empName=33;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		//Sample clone = (Sample) super.clone();
		
		return super.clone();
	}

}
