package WEEK_07.UnitTesting;

/**
 * Created by Bogdan Trif on 22-05-2017 , 12:07 PM.
 */

// This is how you run all the Tests at Once with Test Suite !!!!!!!!

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class,
        ParameterizedSquareTest.class })
public class All_Tests {

}
