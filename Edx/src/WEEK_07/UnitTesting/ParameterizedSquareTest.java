package WEEK_07.UnitTesting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParameterizedSquareTest {

    Calculator calc = null;

    private int param;
    private int result;

    @Parameters
    public static Collection<Object[]> squareNumbers() {
        Object[][] numbers = new Object[][] {{2,4}, {3,9}, {4,17}};
        return Arrays.asList(numbers);
    }

    public ParameterizedSquareTest(int param, int result) {
        this.param = param;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testSquare() {
        calc.square(this.param);
        assertEquals(this.result, calc.getResult(), 0);
    }

}