package at.ac.htl.bhitm3.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SchoolClass {

    private HashMap<Student, String> students = new HashMap<>();

    public void addStudent(Student student, String studentId) {
        students.put(student, studentId);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    // public Student getStudent(Student student) {
    //     students.get(student);
    //     if (student != null && students.get(student) != null && students.get(student).equals(student.getStudentID())) {
    //         return student;
    //     }
    //     return null;
    // }

    public Student getStudent(Student student) {
    for (Map.Entry<Student, String> entry : students.entrySet()) {
        if (entry.getKey().equals(student)) {
            return entry.getKey();
        }
    }
    return null;
}

    public List<String> getStudents() {
        return new LinkedList<>(students.values());
    }

}
