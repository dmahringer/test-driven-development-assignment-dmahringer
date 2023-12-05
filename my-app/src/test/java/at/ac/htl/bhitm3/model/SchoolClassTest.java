package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class SchoolClassTest {
    
    SchoolClass schoolClass;
    Student student;

    @Before
    public void setup() {
        schoolClass = new SchoolClass();
        student = new Student();
        System.out.println(schoolClass);
    }

    @Test
    public void given_schoolClass_when_counting_students_then_result_is_0() {
        assertEquals(0, schoolClass.getStudents().size());
    }

    @Test
    public void test_Set_And_Get_Student() {
        student.setStudentID("IT12234");
        schoolClass.addStudent(student, "IT12234");
        assertEquals("IT12234", schoolClass.getStudents().get(0));
    }

    @Test
    public void test_get_Student() {
    Student student = new Student();
    student.setStudentID("IT12234");

    schoolClass.addStudent(student, "IT12234");

    // Ensure that the returned Student object is not null
    assertNotNull(schoolClass.getStudent(student));

    // Ensure that the student IDs match
    assertEquals("IT12234", schoolClass.getStudent(student).getStudentID());

    // You can also directly compare the objects
    assertEquals(student, schoolClass.getStudent(student));
}

    @Test
    public void test_remove_Student() {
        schoolClass.removeStudent(student);
        assertEquals(null, schoolClass.getStudent(student));
    }

}
