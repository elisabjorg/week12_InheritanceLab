import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Sarah", 98765, 26.000);
    }

    @Test
    public void hasName() {
        assertEquals("Sarah", developer.getName());
    }

    @Test
    public void hasNInumber() {
        assertEquals(98765, developer.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(26.000, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1.000);
        assertEquals(27.000, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(0.26, developer.payBonus(), 0.01);
    }

}
