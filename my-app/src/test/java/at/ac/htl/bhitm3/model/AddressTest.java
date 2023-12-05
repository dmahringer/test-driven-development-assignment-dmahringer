package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AddressTest {

    Address address;

    @Before
    public void setup() {
        address = new Address();
    }

    @Test
    public void testSetAndGetStreet() {
        address.setStreet("Limesstraße");
        assertEquals("Limesstraße", address.getStreet());
    }

    @Test
    public void testSetAndGetHousenumber() {
        address.setHouseNumber(24);
        assertEquals(24, address.getHouseNumber());
    }

    @Test
    public void testSetAndGetPLZ() {
        address.setPLZ(4020);
        assertEquals(4020, address.getPLZ());
    }

    @Test
    public void testSetAndGetCity() {
        address.setCity("Leonding");
        assertEquals("Leonding", address.getCity());
    }
}