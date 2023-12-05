package at.ac.htl.bhitm3.model;

import java.util.Objects;

public class Student extends Person {
    String studentID;

    public void setStudentID(String id) {
        this.studentID = id;
    }

    public Object getStudentID() {

        return this.studentID;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return Objects.equals(studentID, student.studentID);
    }

}
