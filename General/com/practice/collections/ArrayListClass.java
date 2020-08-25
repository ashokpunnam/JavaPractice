package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args){

        List<Employee> employeeList  = new ArrayList<>();

        employeeList.add(new Employee("Ashok","Punnam",7));
        employeeList.add(new Employee("Rani","Ganamaina",4));
        employeeList.add(new Employee("Jasnitha Sree","Punnam",1));
        employeeList.add(new Employee("Sai Jaishna","Punnam",2));

        Collections.sort(employeeList);

       // employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for(Employee employee : employeeArray){
            System.out.println(employee);
        }


    }
}
