package models;

import com.fmi.zyapkov.models.University;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
public class UniversityTest {

    public static final String NAME = "Sofia Universtity";

    @Test
    public void whenGetUniversityNameThenReturnCorrectUniversityName(){

        University university = new University(NAME);
        assertEquals(NAME, university.getName());
    }

    @Test
    public void whenSetUniversityNameThenUpdateUniversityName(){

        University university = new University(NAME);
        assertEquals(NAME, university.getName());

        String newName = "Plovdiv University";
        university.setName(newName);
        assertEquals(newName, university.getName());
    }

}
