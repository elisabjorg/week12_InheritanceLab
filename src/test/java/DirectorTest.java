import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Hannah", 120187, 24.000, "Marketing", 500);
    }

    @Test
    public void hasBudget() {
        assertEquals(500, director.getBudget(), 0.1);
    }

    @Test
    public void hasName() {
        assertEquals("Hannah", director.getName());
    }

    @Test
    public void hasNInumber() {
        assertEquals(120187, director.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(24.000, director.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.000);
        assertEquals(25.000, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(0.24, director.payBonus(), 0.01);
    }
}
