package PaPlats.Sprint2.ÖvnUppg13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ÖnvUppg13Test {

    ÖnvUppg13 calc = new ÖnvUppg13();

    // Indata: två siffror, en operator (string)
    //Utdata: en siffra (double)

    @Test
    public void calculationTest() throws IllegalOperatorException {

        assertTrue(calc.calc(1.0, 2.0, "+") == 3.0);
        assertTrue(calc.calc(6.0, 2.0, "-") == 4.0);
        assertTrue(calc.calc(1.0, 2.0, "*") == 2.0);
        assertTrue(calc.calc(1.0, 2.0, "/") == 0.5);

        assertFalse(calc.calc(1.0, 2.0, "+") == 4.0);

        Throwable ex = assertThrows(IllegalOperatorException.class, () -> {
            calc.calc(1.0, 2.0, "%");
        });
    }

    @Test
    public void operatorTest(){
        assertTrue(calc.checkValidOperator("+") == true);
        assertTrue(calc.checkValidOperator("-") == true);
        assertTrue(calc.checkValidOperator("*") == true);
        assertTrue(calc.checkValidOperator("/"));
        assertFalse(calc.checkValidOperator("%"));
        assertFalse(calc.checkValidOperator("hej"));

    }


}