package com.zzz.test.dwr;

public class TestDwr {
  public Person[] getPersons(){
	  Person[] persons = new Person[]{new Person(1,"张三",11),new Person(2, "李四", 12),new Person(3,"王五",13)};
	  return persons;
  }
}
