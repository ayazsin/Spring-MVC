package model;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class Person {
	
	private int id;
	private String first_name;
	private String last_name;
	private int salary;
	private int year;
	private String gender;
	private String language;
	private String department;
	private String formation;
	
	
	
	public Person() {
		super();
	}
	
	


	public Person(String first_name, String last_name, int salary, int year) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
		this.year = year;
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getLanguage() {
		return language;
	}




	public void setLanguage(String language) {
		this.language = language;
	}




	public String getDepartment() {
		return department;
	}




	public void setDepartment(String department) {
		this.department = department;
	}




	public String getFormation() {
		return formation;
	}




	public void setFormation(String formation) {
		this.formation = formation;
	}




	@Override
	public String toString() {
		return "Person [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", salary=" + salary
				+ ", year=" + year + ", gender=" + gender + ", language=" + language + ", department=" + department
				+ ", formation=" + formation + "]";
	}


	

}
