package PaPlats.Sprint1.ÖvnUppg1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilTest {

    Bil bil = new Bil("ASD123", "Volvo", "gul");

    //return regNr + " " + märke + " " + färg;


    @Test
    void testToString() {
        String expected = bil.getRegNr()+" "+bil.getMärke()+" "+bil.getFärg();
        String actual = bil.toString();
        assertEquals(expected, actual);
    }

    @Test
    void testAddMath(){
        int var = 5;
        int var2 = 7;
        assertEquals(bil.addMath(var, var2), 12);
        assertNotEquals(bil.addMath(var, var2), 17);
    }

}