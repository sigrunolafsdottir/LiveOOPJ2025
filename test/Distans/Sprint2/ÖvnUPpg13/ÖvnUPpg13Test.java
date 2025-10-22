package Distans.Sprint2.ÖvnUPpg13;

import Distans.Sprint2.ExceptionDemo.MyOwnException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ÖvnUPpg13Test {

    ÖvnUPpg13 uppg = new ÖvnUPpg13();

    @Test
    public void operatorAllowedTest() {

        assertTrue(uppg.isOperatorAllowed("+"));
        assertTrue(uppg.isOperatorAllowed("-"));
        assertTrue(uppg.isOperatorAllowed("*"));
        assertTrue(uppg.isOperatorAllowed("/"));

        assertFalse(uppg.isOperatorAllowed("%"));
        assertFalse(uppg.isOperatorAllowed("hej"));
    }

    @Test
    public void calculateTest(){
        assertEquals(uppg.calc(1.5, 1.3, "+"), 2.8 );
        assertEquals(0.2, uppg.calc(1.5, 1.3, "-"), 0.001);
        assertEquals(uppg.calc(4.0, 3.0, "*"), 12 );
        assertEquals(uppg.calc(6.0, 3.0, "/"), 2.0);
        assertEquals(uppg.calc(6.0, 12.0, "/"), 0.5);
        assertEquals(uppg.calc(1.0, 3.0, "/"), 0.33333, 0.001);

        assertNotEquals(uppg.calc(6.0, 12.0, "/"), 0.7);

        Throwable t = assertThrows(IllegalArgumentException.class,
                () -> { uppg.calc(2.0, 3.0, "&"); });

    }


}