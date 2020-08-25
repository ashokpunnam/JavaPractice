package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RankPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner scan = new Scanner (System.in);
		//int numberOfPersons = scan.nextInt();
		
		List<Person> persons = new ArrayList<>();
		//Person person1 = new Person();
		
		persons.add(new Person("Ashok",1,"A",95));
		persons.add(new Person("Ashok",2,"B",70));
		persons.add(new Person("Rani",2,"A",98));
		persons.add(new Person("Jasnitha",3, "A+",100));
		persons.add(new Person("Jaishna",4, "A+",99));
		
		Collections.sort(persons);	
		System.out.println(persons);
		

	}

}

class Person implements Comparable<Person>{
	
	private String name;
	private String grade;
	private int marks;
	private int studentId;
	
	public Person(String name, int studentId, String grade, int marks) {
		this.name = name;
		this.grade = grade;
		this.marks = marks;
		this.studentId = studentId;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
		
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGrade() {
		return this.grade;
	}
	
	public int getMarks() {
		return this.marks;
	}
	
	public int getstudentId() {
		return this.studentId;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(o==null) {
			return -1;
		}
		
		int nameCompare =  this.name.compareTo(o.name);
		
		if(nameCompare==0) {
			return Integer.valueOf(studentId).compareTo(o.studentId);
		}
		return nameCompare;
		//return 0;
	}	
	
	@Override
	public String toString() {
		return name + "-"+ studentId+ "-" + grade +"-"+ marks;		
	}
		
	
}

