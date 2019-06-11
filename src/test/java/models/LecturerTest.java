package models;

import com.fmi.zyapkov.models.Lecturer;
import com.fmi.zyapkov.models.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
public class LecturerTest {

    private static final String LECTURER_FIRST_NAME = "Anna";
    private static final String LECTURER_LAST_NAME = "Dimitrova";
    private static final int LECTURER_AGE = 42;

    private static final String STUDENT_FIRST_NAME = "George";
    private static final String STUDENT_LAST_NAME = "Smith";
    private static final int STUDENT_AGE = 22;
    private static final int STUDENT_GRADE = 1;
    private static final int STUDENT_FACULTY_NUMBER = 14513;

    @Test
    public void whenAddStudentThenStudentsListShouldBeIncrementedByOne(){

        Lecturer lecturer = new Lecturer(LECTURER_FIRST_NAME, LECTURER_LAST_NAME, LECTURER_AGE, new ArrayList<>());
        assertTrue(lecturer.getStudents().isEmpty());

        lecturer.addStudent(
                new Student(STUDENT_FIRST_NAME, STUDENT_LAST_NAME, STUDENT_AGE, STUDENT_GRADE, STUDENT_FACULTY_NUMBER)
        );

        assertEquals(1, lecturer.getStudents().size());
    }

    @Test
    public void whenGetLecturerFirstNameThenReturnCorrectLecturerFirstName(){

        Lecturer lecturer = new Lecturer(LECTURER_FIRST_NAME, LECTURER_LAST_NAME, LECTURER_AGE, Collections.emptyList());
        assertEquals(LECTURER_FIRST_NAME, lecturer.getFirstName());
    }

    @Test
    public void whenGetLecturerLastNameThenReturnCorrectLecturerLastName(){

        Lecturer lecturer = new Lecturer(LECTURER_FIRST_NAME, LECTURER_LAST_NAME, LECTURER_AGE, Collections.emptyList());
        assertEquals(LECTURER_LAST_NAME, lecturer.getLastName());
    }

    @Test
    public void whenGetLecturerAgeThenReturnCorrectLecturerAge(){

        Lecturer lecturer = new Lecturer(LECTURER_FIRST_NAME, LECTURER_LAST_NAME, LECTURER_AGE, Collections.emptyList());
        assertEquals(LECTURER_AGE, lecturer.getAge());
    }
}
