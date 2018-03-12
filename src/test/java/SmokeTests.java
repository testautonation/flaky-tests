package test.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SmokeTests {

    public int random_number = (int) (Math.random() * 10);

    @Before
    public void setUp() {
        System.out.println("Random Number: " + this.random_number);
    }

    @Test
    public void lessThanThreeTest() {
        assertTrue("Random number >= 3", this.random_number < 3);
    }

    @Test
    public void lessThanFiveTest() {
        assertTrue("Random number >= 5", this.random_number < 5);
    }

    @Test
    public void lessThanSevenTest() {
        assertTrue("Random number >= 7", this.random_number < 7);
    }

    @Test
    public void lessThanNineTest() {
        assertTrue("Random number >= 9", this.random_number < 9);
    }

    @Test
    public void lessThanTenTest() {
        assertTrue("Random number >= 10", this.random_number < 10);
    }

    @Test
    public void moreThanOneTest() {
        assertTrue("Random number <= 1", this.random_number > 1);
    }
}
