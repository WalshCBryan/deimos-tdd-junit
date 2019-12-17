import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {
    Cohort emptyCohort;
    Cohort cohortWithOneStudent;
    Cohort cohortWithManyStudents;

    @Before
    public void setup() {
        emptyCohort = new Cohort();
        cohortWithOneStudent = new Cohort();
        cohortWithManyStudents = new Cohort();

        Student fer = new Student(0, "fer");
        cohortWithOneStudent.addStudent(fer);
        fer.addGrade(100);
        Student bryan = new Student(1, "bryan");
        bryan.addGrade(90);
        bryan.addGrade(100); //95
        Student roger = new Student(1, "roger");
        roger.addGrade(85);
        roger.addGrade(95); //90
        Student ethan = new Student(1, "ethan");
        ethan.addGrade(80);
        ethan.addGrade(90); //85
        cohortWithManyStudents.addStudent(bryan);
        cohortWithManyStudents.addStudent(roger);
        cohortWithManyStudents.addStudent(ethan);
    }


    @Test
    public void addStudentAndGetStudentsWorks() {
        assertEquals(0, emptyCohort.getStudents().size(), 0);
        assertEquals(1, cohortWithOneStudent.getStudents().size(), 0);
        assertEquals(0, cohortWithOneStudent.getStudents().get(0).getId());
        assertEquals("fer", cohortWithOneStudent.getStudents().get(0).getName());
    }

    @Test
    public void testIfCohortAverageIsCorrect() {
        assertEquals(100, cohortWithOneStudent.getCohortAverage(), 0);
        assertEquals(90, cohortWithManyStudents.getCohortAverage(), 0);


    }
}
