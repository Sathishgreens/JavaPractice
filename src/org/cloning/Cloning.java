package org.cloning;

public class Cloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Sample sample = new Sample();
		sample.ssd(111, "aaa");
		System.out.println(sample.a);
		System.out.println(sample.employee.empName);
		Sample clone = (Sample) sample.clone();
		System.out.println(clone.s);
		clone.ssd(99, "s");
		System.out.println(sample.s);
		clone.employee.empName=0;
		System.out.println(clone.employee.empName);
		System.out.println(sample.employee.empName);
	
	}
}
