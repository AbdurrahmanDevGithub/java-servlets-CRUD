package entities;

import java.io.Serializable;

public class User implements Serializable {
	private int id;
	private String name;
	private String position;
	private int phone;
	private String email;
	private double bas_salary;
	private double ot_hours;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBas_salary() {
		return bas_salary;
	}
	public void setBas_salary(double bas_salary) {
		this.bas_salary = bas_salary;
	}
	public double getOt_hours() {
		return ot_hours;
	}
	public void setOt_hours(double ot_hours) {
		this.ot_hours = ot_hours;
	}
	
	public User() {
		id=0;
		name="";
		phone=0;
		email="";
		position="";
		bas_salary=0;
		ot_hours=0;
	}
	public double finalSalary() {
		double f_salary=bas_salary + (1000 * ot_hours);
		return f_salary;
	}
	
}
