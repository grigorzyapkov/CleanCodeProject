package models;

import com.fmi.zyapkov.models.Category;
import com.fmi.zyapkov.models.Course;
import com.fmi.zyapkov.models.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void whenAddCompletedCourseToStudentThenStudentCompletedCoursesShouldBeWithOneMore(){

        Student student = new Student(FIRST_NAME, LAST_NAME, AGE, GRADE, FACULTY_NUMBER);

        assertTrue(student.getCompletedCourses().isEmpty());

        Course expectedCourse = new Course("Mathematics", 10, Category.MATEMATHICS);
        student.addCompletedCourse(expectedCourse);

        List<Course> completedCourses = student.getCompletedCourses();
        assertEquals(1, completedCourses.size());

        Course actualCourse = completedCourses.get(0);

        assertEquals(expectedCourse.getName(), actualCourse.getName());
        assertEquals(expectedCourse.getCredits(), actualCourse.getCredits());
        assertEquals(expectedCourse.getCategory().toString(), actualCourse.getCategory().toString());
    }

    @Test
    public void whenGetStudentFirstNameThenReturnCorrectStudentFirstName(){

        Student student = new Student(FIRST_NAME, LAST_NAME, AGE, GRADE, FACULTY_NUMBER);
        assertEquals(FIRST_NAME, student.getFirstName());
    }

    @Test
    public void whenGetStudentLastNameThenReturnCorrectStudentLastName(){

        Student student = new Student(FIRST_NAME, LAST_NAME, AGE, GRADE, FACULTY_NUMBER);
        assertEquals(LAST_NAME, student.getLastName());
    }

    @Test
    public void whenGetStudentAgeThenReturnCorrectStudentAge(){

        Student student = new Student(FIRST_NAME, LAST_NAME, AGE, GRADE, FACULTY_NUMBER);
        assertEquals(AGE, student.getAge());
    }

    @Test
    public void whenGetStudentGradeThenReturnCorrectStudentGrade(){

        Student student = new Student(FIRST_NAME, LAST_NAME, AGE, GRADE, FACULTY_NUMBER);
        assertEquals(GRADE, student.getGrade());
    }

    @Test
    public void whenGetStudentFacultyNumberThenReturnCorrectStudentFacultyNumber(){

        Student student = new Student(FIRST_NAME, LAST_NAME, AGE, GRADE, FACULTY_NUMBER);
        assertEquals(FACULTY_NUMBER, student.getFacultyNumber());
    }
}
