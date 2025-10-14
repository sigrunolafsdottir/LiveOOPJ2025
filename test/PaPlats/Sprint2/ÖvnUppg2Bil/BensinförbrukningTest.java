package PaPlats.Sprint2.ÖvnUppg2Bil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BensinförbrukningTest {

    /*
    Skriv ett program som beräknar och skriver ut hur många mil en bil har gått under det senaste året och
    dessutom beräknar bilens genomsnittliga bensinförbrukning. Indata till programmet ska vara dagens mätarställning,
    mätarställningen för ett år sedan samt antal liter bensin som förbrukats under året.
Använd klassen JOptionPane för att läsa in data.

Utskriften ska ske i kommandofönstret och ha format enligt följande:

Antal körda mil: 1487.0
Antal liter bensin:  1235.4
Förbrukning per mil: 0.83

Skriv testerna innan du skriver koden. Du ska minst ha gjort tester för de beräkningar som görs i programmet och för att utskrifterna följer specifikationen ovan.

Beräkna: Hur många mil  : dagens mätarställning - mätarställningen för ett år sen  KLAR
Beräkna: antal liter bensin: inten uträkning                         BEHÖVS EJ
Beräkna: förbrukning per mil: antal liter bensin / (hur många mil)   KLAR


Plan: göra en inlämsningsfunktion
Jag skickar in en prompt (String) som inparameter och min funktion returnerar en double

Plan: utskriftsfunktion
Jag skickar med en prompt och ett värde
funktionen skriver ut (

     */

    Bensinförbrukning b = new Bensinförbrukning();

    @Test
    void hurMångaMiltest() {
        double mätarStällningFÖrEttÅrSen = 1000;
        double mätarStällningNu = 1500;

        double expectedMätarställning = 500;
        double actualMÅtarställning = b.getAntalMilSenasteÅret(mätarStällningFÖrEttÅrSen, mätarStällningNu );
        assertEquals(expectedMätarställning, actualMÅtarställning);
        assertNotEquals(expectedMätarställning, actualMÅtarställning+1);

    }

    @Test
    void förbrukningPerMilTest() {
        double antalMilDettaÅr = 500;
        double antalLiterBensin = 100;

        double expectedFörbrukning = 0.2;
        double actualFörbrukning = b.getBensinFörbrukningSenasteÅret(antalMilDettaÅr, antalLiterBensin );
        assertEquals(expectedFörbrukning, actualFörbrukning);
        assertNotEquals(expectedFörbrukning, actualFörbrukning+1);
    }

    @Test
    void utskriftsTest(){
        String prompt1 = "Antal körda mil: ";
        double antalKördaMil = 500.0;

        String expected = prompt1 + antalKördaMil;
        String actual = b.getUtskriftsText(prompt1, antalKördaMil);
        assertEquals(expected, actual);

    }


}