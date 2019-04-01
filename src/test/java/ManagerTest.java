import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Paul", 12345, 24.000, "Sales");
    }

    @Test
    public void hasName() {
        assertEquals("Paul", manager.getName());
    }

    @Test
    public void hasNInumber() {
        assertEquals(12345, manager.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(24.000, manager.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.000);
        assertEquals(25.000, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(0.24, manager.payBonus(), 0.01);
    }

}
