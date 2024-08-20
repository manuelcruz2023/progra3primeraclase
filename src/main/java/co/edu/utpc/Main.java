package co.edu.utpc;

import co.edu.utpc.models.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person();
        person.setName("Manuel");
        person.setLastName("Cruz");
        System.out.println(person.getName() + " " + person.getLastName());
    }
}