package PaPlats.Sprint2.ÖvnUppg9;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

 import static org.junit.jupiter.api.Assertions.*;

class ÖvnUppg9Test {

    ÖvnUppg9 övn9 = new ÖvnUppg9();

    //Sune Samuelsson, Xvägen 8, 12345 Ystad
    //38, 98, 175

    @Test
    public void inläsningstest(){

        Path path = Path.of("test/PaPlats/Sprint2/ÖvnUppg9/Personuppgifter.txt");
        List<Person> personLista = övn9.readPersonLista(path);

        IO.println(personLista.size());

        //assert Boolean.parseBoolean(("hej"));

        assertTrue(personLista.size() == 8);
        assertTrue(personLista.getFirst().getName().equalsIgnoreCase("Kalle Nilsson"));


       //läsa data från fil
        //Kolla av att vi får en lista med Person
    }

    @Test
    public void utskriftsTest(){

    }

    @Test
    public void compareLengthTest(){
        int limit = 200;
        Person shortPerson = new Person("Kalle", "DRottninggatan 2", "12345 Stockholm", 45, 98, 189);
        Person tallPerson = new Person("NIsse", "DRottninggatan 2", "12345 Stockholm", 45, 98, 205);

        assertTrue(övn9.isTall(tallPerson, limit));
        assertFalse(övn9.isTall(shortPerson, limit));


    }

}