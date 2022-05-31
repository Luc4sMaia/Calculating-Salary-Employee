package entities;

import java.util.List;
import java.util.ArrayList;

public class Employee {

	protected String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	public List<Employee> listEmployee = new ArrayList<>();
	
	public Employee() {
	}
	
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Integer getHoursInteger() {
		return hours;
	}

	public void setHoursInteger(Integer hoursInteger) {
		this.hours = hoursInteger;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment() {
		return valuePerHour * hours;
	}
	
	public void addEmployee(Employee employee) {
		listEmployee.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		listEmployee.remove(employee);
	}

	public List<Employee> getListEmployee() {
		return listEmployee;
	}	
	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name + " - $" + payment() + "\n");
		return sb.toString();
	}
}
