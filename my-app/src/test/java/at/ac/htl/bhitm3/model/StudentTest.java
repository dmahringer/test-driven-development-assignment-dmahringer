package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    Student student1;
    Student student2;

    @Before
    public void setup() {
        student1 = new Student();
        student2 = new Student();
    }
    
    @Test
    public void given_Student_then_is_instance_of_person() {
        assertTrue(student1 instanceof Person);
    }

    @Test 
    public void given_studentid_is_not_null(){
        student1.setStudentID("IT29182");
        assertEquals("IT29182", student1.getStudentID());
    }

    @Test
    public void given_students_with_same_id_should_be_equal() {
        student1.setStudentID("IT12345");
        student2.setStudentID("IT12345");

        assertEquals(student1, student2);
    }

    public void given_students_with_different_id_should_not_be_equal() {
        student1.setStudentID("IT98765");
        student2.setStudentID("IT54321");

        assertFalse(student1.equals(student2));
    }
}
