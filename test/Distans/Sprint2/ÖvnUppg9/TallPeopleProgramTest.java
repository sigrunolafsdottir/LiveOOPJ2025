package Distans.Sprint2.ÖvnUppg9;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//Målbild:

//Läsa från fil: bygga metod som tar en path som inparamter   --klar
//och returnerar en LIsta av Person

//Processa data: en metod som tar en lista av Person, går igenom listan
//returnerar ny lista med bara de långa människorna

//Metod som tar en Lista av Personer, och en path och skriver ut alla personerna i listan

//Metod som tar en sträng och konverterar till int ---klar

class TallPeopleProgramTest {

    TallPeopleProgram tp = new TallPeopleProgram();

    @Test
    public void testString2IntConverterTest(){
        String n1 = "45";
        String n2 = "45 ";
        String n3 = "hej";
        int expected = 45;
        int actual = tp.convertString2Int(n1);

        assertEquals(actual, expected);
        assertEquals(tp.convertString2Int(n2), expected);
        assertNotEquals(actual, expected+1);

    }

    @Test
    public void testReadFromFile(){

        Path path = Path.of("test/Distans/Sprint2/ÖvnUppg9/Personuppgifter.txt");
       // String s = "test/Distans/Sprint2/ÖvnUppg9/Personuppgifter.txt";
        List<Person> allaPersoner = tp.readPersons(path);

        assertTrue(allaPersoner.size() == 8);
        assertTrue(allaPersoner.getFirst().getName().equals("Kalle Nilsson"));

    }

}