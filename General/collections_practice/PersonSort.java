package collections_practice;

import java.util.*;

public class PersonSort {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Ashok","Punnam","USA",35));
        personList.add(new Person("Vijaya","Ravula","India",30));
        personList.add(new Person("Jasnitha Sree","Punnam","India",9));
        personList.add(new Person("Sai Jaishna","Punnam","USA",4));
        List<String> sortList = new ArrayList<>();
       // sortList.add("firstName");
       // sortList.add("lastName");
        sortList.add("Country");
       // sortList.add("firsName");
        System.out.println("Ashok");

        PersonComparator pcomparator = new PersonComparator();


        pcomparator.comparePerson(personList,sortList);

        for (Person person : personList) {
            System.out.println("Ashok"+person);

        }

    }
}


class Person {

    private String firstName;
    private String lastName;
    private String country;
    private int age;

    public Person(String firstName, String lastName, String country, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}


class personFirstNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2){
        return p1.getFirstName().compareTo(p2.getFirstName());

    }

}


class personLastNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2){
        return p1.getLastName().compareTo(p2.getLastName());

    }

}

class personCounrtyComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2){
        return p1.getCountry().compareTo(p2.getCountry());

    }

}

class personAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2){
        return p1.getAge()-p2.getAge();

    }

}

class PersonComparator {
    public void comparePerson(List<Person> personList, List<String> list){
        //Iterator iter = list.iterator();
        System.out.println("Ashok1"+list.size());
        for(int i=0;i<list.size();i++){
            System.out.println("Ashok2");
            if(list.get(i).toString().equalsIgnoreCase("firstName")){
                Collections.sort(personList, new personFirstNameComparator());
                break;
            }
            else if(list.get(i).toString().equalsIgnoreCase("lastName")){
                Collections.sort(personList, new personLastNameComparator());
                break;
            }
            else if(list.get(i).toString().equalsIgnoreCase("country")){
                Collections.sort(personList, new personCounrtyComparator());
                break;
            }
            else if(list.get(i).toString().equalsIgnoreCase("age")){
                Collections.sort(personList, new personAgeComparator());
                break;
            }
        }

    }
}

/*class PersonComparator {
    public void comparePerson(List<Person> personList, List<String> list){
       Iterator iter = list.iterator();
        int score=0;
        while(iter.hasNext()){
            int currentScore = 0;
            if(iter.next().toString().equalsIgnoreCase("firstName")){
                return

            }

        }



    }
}*/
