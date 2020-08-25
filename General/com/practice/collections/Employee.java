package com.practice.collections;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private String firstName;
    private String lastName;
    private int employeeId;

    public Employee(String firstName, String lastName, int employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

   

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId &&
                firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, employeeId);
    }

    @Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
        if(this.employeeId == e.employeeId){
            return this.firstName.compareTo(e.firstName);
        }
        else{
            return this.employeeId - e.employeeId;
        }

	}
}
