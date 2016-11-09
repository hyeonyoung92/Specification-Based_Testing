package hyeonyoung.SpecificationBasedTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ WageExceptionTest.class, WageTest.class })
public class AllTests {

}
