package OOPS_Concepts;

import java.util.ArrayList;
import java.util.Objects;

public class Employee1 {

	private String e_Name;
	private int e_Id;
	private String e_Designation;
	private double e_Salary;
	private double Percentage;
	
	
	Employee1(String e_name, int e_id, String e_desg, double e_salary){
		
		this.e_Name = e_name;
		this.e_Id = e_id;
		this.e_Designation = e_desg;
		this.e_Salary = e_salary;
	}
	
	public void SetE_Name(String Name) {
		this.e_Name = Name;
	}
	
	public void SetE_id(int ID) {
		this.e_Id = ID;
	}
	
	public void SetE_Desg(String desg) {
		this.e_Designation = desg;
	}
		
	public void setE_Salary(double salary){
		this.e_Salary = salary;
	}
	
	public double getSalary() {
		return e_Salary;
	}
		
	public void Salary_Hike(double percentage) {
		e_Salary = e_Salary + (e_Salary*percentage/100);
	}
	
	public void EmployeeInfo() {
		System.out.println(e_Name+"  "+e_Id+"  "+e_Designation+"  "+e_Salary+"\n");
	}
		
}
