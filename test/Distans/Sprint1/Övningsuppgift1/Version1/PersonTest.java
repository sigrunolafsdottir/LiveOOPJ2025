package Distans.Sprint1.Övningsuppgift1.Version1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    String namn = "Mimmi";
    int alder = 98;
    Person person = new Person(namn, alder);

    @Test
    void testToString() {

        String actual = person.toString();
        String expected = "Person{alder=" + alder +", namn='" + namn + "'}";

        assertEquals(expected, actual);
        assertNotEquals(null, actual);

    }
}