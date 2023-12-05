package at.ac.htl.bhitm3.model;

import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private Date birthday;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

}
