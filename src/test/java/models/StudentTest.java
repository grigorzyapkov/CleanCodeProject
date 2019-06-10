package models;

import com.fmi.zyapkov.models.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
public class StudentTest {

    private static final String FIRST_NAME = "Anna";
    private static final String LAST_NAME = "Dimitrova";
    private static final int AGE = 12;
    private static final int GRADE = 1;
    private static final int FACULTY_NUMBER = 14513;

    @Test
    public void whenIncrementGradeThenGradeShouldBeIncrementedByOne(){

        Student student = new Student(FIRST_NAME, LAST_NAME, AGE, GRADE, FACULTY_NUMBER);
        student.incrementGrade();

        assertEquals(GRADE + 1, student.getGrade());
    }

}
