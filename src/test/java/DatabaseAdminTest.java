import TechStaff.DataBaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before() {
        dataBaseAdmin = new DataBaseAdmin("Harry", 220388, 24.000);
    }

    @Test
    public void hasName() {
        assertEquals("Harry", dataBaseAdmin.getName());
    }

    @Test
    public void hasNInumber() {
        assertEquals(220388, dataBaseAdmin.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(24.000, dataBaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        dataBaseAdmin.raiseSalary(1.000);
        assertEquals(25.000, dataBaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus() {
        assertEquals(0.24, dataBaseAdmin.payBonus(), 0.01);
    }


}
