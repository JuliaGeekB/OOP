package Controllers;

import StudentDomen.Person;

public interface iPersonController<T extends Person> {
    void create(String firstName, int age);    
}