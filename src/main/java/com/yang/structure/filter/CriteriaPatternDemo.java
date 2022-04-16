package com.yang.structure.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年04月16日
 */
public class CriteriaPatternDemo {

  public static void main(String[] args) {
    List<Person> persons = new ArrayList<Person>();

    persons.add(new Person("Robert",0, 0));
            persons.add(new Person("John",0, 1));
    persons.add(new Person("Laura",1, 1));
    persons.add(new Person("Diana",1, 0));
    persons.add(new Person("Mike",0, 0));
    persons.add(new Person("Bobby",0, 0));

    Criteria male = new CriteriaMale();
    Criteria female = new CriteriaFemale();
    Criteria single = new CriteriaSingle();
    Criteria singleMale = new AndCriteria(single, male);
    Criteria singleOrFemale = new OrCriteria(single, female);

    System.out.println("Males: ");
    printPersons(male.meetCriteria(persons));

    System.out.println("\nFemales: ");
    printPersons(female.meetCriteria(persons));

    System.out.println("\nSingle Males: ");
    printPersons(singleMale.meetCriteria(persons));

    System.out.println("\nSingle Or Females: ");
    printPersons(singleOrFemale.meetCriteria(persons));
  }


    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
