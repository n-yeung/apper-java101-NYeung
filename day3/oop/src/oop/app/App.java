package oop.app;

import oop.app.blueprint.Person;

public class App {
    public static void main(String[] args) {
        Person mark = new Person();
        mark.age = 19;
        mark.name = "Mark Kram";
        mark.isMale = true;
        mark.relationshipStatus = "Single";
        mark.contactNumber = "90176565612";

        System.out.println(mark.getNameWithPrefix());
        mark.getJob();
    }
}
