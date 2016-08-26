import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(JUnitParamsRunner.class)
public class PersonTest {


    @Test
    @Parameters(method = "adultValues")
    public void personIsAdult(int age, boolean valid) throws Exception {
        assertEquals(valid, new Person(age).isAdult());
    }

    private Object[] adultValues() {
        return new Object[]{
                new Object[]{13, false},
                new Object[]{17, false},
                new Object[]{18, true},
                new Object[]{22, true}
        };
    }
//
//    @Test
//    @Parameters
//    public void isAdult(Person person, boolean valid) throws Exception {
//        assertThat(person.isAdult(), is(valid));
//    }
//
//    private Object[] parametersForIsAdult() {
//        return new Object[]{
//                new Object[]{new Person(13), false},
//                new Object[]{new Person(17), false},
//                new Object[]{new Person(18), true},
//                new Object[]{new Person(22), true}
//        };
//    }
}