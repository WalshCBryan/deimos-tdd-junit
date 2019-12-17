import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {


    @Test
    public void addStudentAndGetStudentsWorks(){
        Cohort cohortWithOneStudent = new Cohort();
        cohortWithOneStudent.addStudent(new Student(1,"bryan"));
        assertEquals(1, cohortWithOneStudent.getStudents().size());
        assertEquals(1, cohortWithOneStudent.getStudents().get(0).getId());
        assertEquals("bryan", cohortWithOneStudent.getStudents().get(0).getName());
    }

    @Test
    public void testIfCohortAverageIsCorrect(){
        Cohort cohortWithManyStudents = new Cohort();
        Student bryan = new Student(1,"bryan");
        bryan.addGrade(90);
        bryan.addGrade(100); //95
        Student roger = new Student(1,"roger");
        roger.addGrade(85);
        roger.addGrade(95); //90
        Student ethan = new Student(1,"ethan");
        ethan.addGrade(80);
        ethan.addGrade(90); //85
        cohortWithManyStudents.addStudent(bryan);
        cohortWithManyStudents.addStudent(roger);
        cohortWithManyStudents.addStudent(ethan);
        assertEquals(90, cohortWithManyStudents.getCohortAverage(), 0);


    }
}
