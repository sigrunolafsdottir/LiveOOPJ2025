package Distans.Sprint1.Övningsuppgift1.Version1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilTest {


    Bilägare kalle = new Bilägare("Kalle", 34, "B");
    Bilägare anna = new Bilägare("Anna", 34, "B");
    Bil b = new Bil("ABC123", "Röd", "Volvo", kalle);


    @Test
    void sellCarTo() {
        assertEquals(b.getBilägare(), kalle);
        b.sellCarTo(anna);
        assertEquals(b.getBilägare(), anna);
    }
}