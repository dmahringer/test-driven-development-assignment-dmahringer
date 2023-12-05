package at.ac.htl.bhitm3.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    Person person;
    Address address;

    @Before
    public void setup() {
        person = new Person();
        address = new Address();
    }
    
    @Test
    public void given_person_when_name_is_John() {
        person.setName("John");
        assertEquals("John", person.getName());
    }
    @Test
    public void given_when_surname_is_Doe() {
        person.setSurname("Doe");
        assertEquals("Doe", person.getSurname());
    }

    @Test
    public void given_person_when_address_is_address1() {
        address.setStreet("Limesstraße");
        address.setHouseNumber(14);
        address.setPLZ(4060);
        address.setCity("Leonding");
        assertEquals("Limesstraße", address.getStreet());
        assertEquals(14, address.getHouseNumber());
        assertEquals(4060, address.getPLZ());
        assertEquals("Leonding", address.getCity());
    }
}
