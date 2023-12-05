package at.ac.htl.bhitm3.model;

public class Teacher extends Person {
    int salary;
   
    public void setSalary(int salary) {
        this.salary = salary;
    }   

    public Object getSalary() {
        return this.salary;
    }
}