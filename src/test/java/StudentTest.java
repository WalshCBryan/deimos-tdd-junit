import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student fer;
Student nullStudent;
    Student studentWithManyGrades;

    @Before
    public void init(){
        Student nullStudent = null;
        fer = new Student(1L, "fer");
        fer.addGrade(80);
        studentWithManyGrades= new Student(2L, "trant");
        studentWithManyGrades.addGrade(80);
        studentWithManyGrades.addGrade(90);
        studentWithManyGrades.addGrade(100);
    }


    @Test
    public void testCreateStudent(){
        assertNull(nullStudent);
        assertNotNull(fer);
        assertEquals("fer", fer.getName());
        assertEquals(1, fer.getId());
    }

    @Test
    public void testStudentFields(){
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(1, fer.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        assertSame(80, fer.getGrades().get(0));
        assertEquals(1,fer.getGrades().size(),0);
        assertSame(90, studentWithManyGrades.getGrades().get(1));
        assertEquals(3,studentWithManyGrades.getGrades().size(),0);
    }

    @Test
    public void testAverageGrade(){
        assertEquals(80, fer.getGradeAverage(), 0);
        assertEquals(90, studentWithManyGrades.getGradeAverage(), 0);
    }
}