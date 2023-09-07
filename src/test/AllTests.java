
/**
 * @author brody - bjboell
 * CIS175 - Fall 2023
 * Sep 6, 2023
 */
package test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ PlayerTest.class, PlayerTest2.class })
public class AllTests {

}
