package EDX_UC3Mx_Part_II.WEEK_07.UnitTesting.Fuel_Tank_Complete;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FuelTankTest.class,
        FillParameterizedTest.class,
        ConsumeParameterizedTest.class})

public class AllTests {

}