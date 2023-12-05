package at.ac.htl.bhitm3.model;

import java.util.LinkedList;
import java.util.List;

public class School {

    List<SchoolClass> classes = new LinkedList<>();
    List <Teacher> teachers = new LinkedList<>();

    public List<SchoolClass> getSchoolClasses() {
        return classes;
    }

    public static SchoolClass createSchoolClass() {
        return new SchoolClass();
    }

    public void addSchooolClass(SchoolClass schoolClass) {
        this.classes.add(schoolClass);
    }

    public List<Teacher> getTeacher() {
        return teachers;
    }

    public static Teacher createTeacher() {
        return new Teacher();
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

}
