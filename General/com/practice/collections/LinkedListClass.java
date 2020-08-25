package com.practice.collections;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {

        LinkedList<Employee> employeeList = new java.util.LinkedList<>();

        Employee empAsh = new Employee("Ashok","Punnam",7);
        Employee empRa = new Employee("Rani","Ganamaina",4);
        Employee empJas = new Employee("Jasnitha Sree","Punnam",1);
        Employee empJai = new Employee("Sai Jaishna","Punnam",2);

        employeeList.addFirst(empAsh);
        employeeList.addFirst(empRa);
        employeeList.addFirst(empJas);
        employeeList.addFirst(empJai);

        //Collections.sort(employeeList);

        //employeeList.forEach(employee -> System.out.println(employee));

        Iterator itr = employeeList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
