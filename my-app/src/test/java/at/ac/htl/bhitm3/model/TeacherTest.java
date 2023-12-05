package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TeacherTest {
    Teacher teacher;

    @Before
    public void setUp() {
        teacher = new Teacher();
    }

    @Test
    public void given_teacher_then_is_instance_of_person() {
        assertTrue(teacher instanceof Person);
    }

    @Test
    public void given_salary_from_teacher_must_be_more_then_zero() {
        teacher.setSalary(2000);
        assertEquals(2000, teacher.getSalary());
    }
}
