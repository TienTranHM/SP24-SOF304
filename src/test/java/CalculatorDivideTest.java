import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorDivideTest {
    private Calculator cal;

    @Before
    public void setUp() throws Exception {
        cal = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        cal = null;
    }

    @Test(expected = ArithmeticException.class)
    public void TestDivideException() {
        cal.Divide(5,0);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testDivideMessageExcetion(){
        exception.expect(ArithmeticException.class);
        exception.expectMessage("Cannot be divided by 0");
        cal.Divide(10,0);
    }
}