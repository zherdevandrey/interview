package org.example.sealed;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    //@Override
    public int compareTo(Person person) {
        if(age==person.age)
            return 0;
        else if(age>person.age)
            return 1;
        else
            return -1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
