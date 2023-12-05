package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SchoolTest {

    School school;

    @Before
    public void setup() {
        school = new School();
    }

    @Test
    public void given_nothing_ensure_school_exists() {
        assertNotNull(school);
    }

    @Test
    public void given_new_school_when_counting_classes_result_is_0() {
        assertEquals(0, school.getSchoolClasses().size());
    }

    @Test
    public void given_new_school_when_adding_class_then_result_is_added_class() {
        var schoolClass = school.createSchoolClass();
        school.addSchooolClass(schoolClass);
        assertEquals(1, school.getSchoolClasses().size());
    }

    @Test
    public void given_new_school_when_adding_teacher_then_result_is_added_teacher() {
        var newTeacher = school.createTeacher();
        school.addTeacher(newTeacher);
        assertEquals(1, school.getTeacher().size());
    }

}
