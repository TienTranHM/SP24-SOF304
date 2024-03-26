import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CalculatorAddTest {
    private Calculator cal;
    private int a;
    private int b;
    private int expected;

    public CalculatorAddTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Before
    public void setUp() throws Exception {
        cal = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        cal = null;
    }

    @Test
    public void testAdd() {
        int actual = cal.Add(a,b);
        Assert.assertEquals(expected,actual);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {4,5,9},
                {5,5,10},
                {100,1,101},
                {9,0,9}
        });
    }
}