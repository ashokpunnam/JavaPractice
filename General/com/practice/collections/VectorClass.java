package com.practice.collections;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClass {

    public static void main(String[] args){

        List<Employee> employeeList = new Vector<>();

        employeeList.add(new Employee("Ashok","Punnam",7));
        employeeList.add(new Employee("Rani","Ganamaina",4));
        employeeList.add(new Employee("Jasnitha Sree","Punnam",1));
        employeeList.add(new Employee("Sai Jaishna","Punnam",2));

        Collections.sort(employeeList);

        employeeList.forEach(employee -> System.out.println(employee));
    }
}
