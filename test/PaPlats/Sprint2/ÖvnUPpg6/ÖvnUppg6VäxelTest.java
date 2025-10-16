package PaPlats.Sprint2.ÖvnUPpg6;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ÖvnUppg6VäxelTest {

    //läsa in kostnad
    //läsa in totalt pris
    //räkna ut växel  KLAR
    // skapa lista med alla valörer  KLAR
    //räkna ut resten KLAR
    // metod där inparameter är växel och utparameter är lista med valörer i växeln KLAR
    //inparameter: listan, utparam sträng

    ÖvnUppg6Växel v = new ÖvnUppg6Växel();


    //inläsningsfunktion
    //inparameter: prompt, testvariabel
    //utparameter antingen det vi läsar från consolen ELLER testparam
    @Test
    public void readingTest(){
        v.test = true;
        int matningsdata = 345;
        assertEquals(v.readData("Prompt", matningsdata), matningsdata);

    }

    @Test
    public void växelTest(){
        int kostnad = 345;
        int betaltBelopp = 500;
        int expected = 155;
        int actual = v.getVäxel(kostnad, betaltBelopp);
        assertEquals(expected, actual);
    }

    @Test
    public void valörPresentTest(){
        // 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1
        assertTrue(v.getValörer().getFirst() == 1000);
        assertTrue(v.getValörer().get(1) == 500);
        assertTrue(v.getValörer().get(2) == 200);
        assertTrue(v.getValörer().get(3) == 100);
        assertTrue(v.getValörer().get(4) == 50);
        assertTrue(v.getValörer().get(5) == 20);
        assertTrue(v.getValörer().get(6) == 10);
        assertTrue(v.getValörer().get(7) == 5);
        assertTrue(v.getValörer().get(8) == 2);
        assertTrue(v.getValörer().getLast() == 1);
    }

    @Test
    public void howManyValörTest(){
        int valör = 100;
        int växel = 130;
        int expected = 1;

        int valör2 = 500;
        int växel2 = 2300;
        int expected2 = 4;

        assertEquals(expected, v.getAmountOfValör(valör, växel));
        assertEquals(expected2, v.getAmountOfValör(valör2, växel2));
    }

    @Test
    public void getRestTest(){
        int växel = 130;
        int valör = 100;
        int antalValör = 1;
        int expectedRest = 30;

        int växel2 = 5;
        int valör2 = 2;
        int antalValör2 = 2;
        int expectedRest2 = 1;

        assertEquals(expectedRest, v.getRest(växel, valör, antalValör));
        assertEquals(expectedRest2, v.getRest(växel2, valör2, antalValör2));
    }

    @Test
    public void getRestModuluTest(){
        int växel = 130;
        int valör = 100;
        int expectedRest = 30;

        int växel2 = 5;
        int valör2 = 2;
        int expectedRest2 = 1;

        assertEquals(expectedRest, v.getRestModulu(växel, valör));
        assertEquals(expectedRest2, v.getRestModulu(växel2, valör2));
    }


    @Test
    public void getVäxelListTest(){
        int växel = 2793;
        List<Integer> expected = List.of(2, 1, 1,0, 1, 2, 0, 0, 1, 1);
        assertEquals(expected, v.getVäxelList(växel));
        assertNotEquals(expected, v.getVäxelList(växel+1));
    }

    @Test
    public void getKronorLappar(){
        String kronor = "kronor";
        String lappar = "lappar";
        assertEquals(kronor, v.getPengatyp(1));
        assertEquals(kronor, v.getPengatyp(2));
        assertEquals(kronor, v.getPengatyp(5));
        assertEquals(kronor, v.getPengatyp(10));
        assertEquals(lappar, v.getPengatyp(20));
        assertEquals(lappar, v.getPengatyp(50));
        assertEquals(lappar, v.getPengatyp(100));
        assertEquals(lappar, v.getPengatyp(200));
        assertEquals(lappar, v.getPengatyp(500));
        assertEquals(lappar, v.getPengatyp(1000));
    }

    @Test
    public void getUtskrift(){
        int växel = 2793;
        List<Integer> expected = List.of(2, 1, 1,0, 1, 2, 0, 0, 1, 1);
        String expected1 = "Antal 1-kronor: 1";
        String expected2 = "Antal 2-kronor: 1";
        String expected3 = "Antal 5-kronor: 0";
        String expected4 = "Antal 10-kronor: 0";
        String expected5 = "Antal 20-lappar: 2";
        String expected6 = "Antal 50-lappar: 1";
        String expected7 = "Antal 100-lappar: 0";
        String expected8 = "Antal 200-lappar: 1";
        String expected9 = "Antal 500-lappar: 1";
        String expected10 = "Antal 1000-lappar: 2";
        //valör, antal
        assertEquals(expected1, v.getUtskrift(1, 1));
        assertEquals(expected2, v.getUtskrift(2, 1));

        assertEquals(expected3, v.getUtskrift(5, 0));
        assertEquals(expected4, v.getUtskrift(10, 0));
        assertEquals(expected5, v.getUtskrift(20, 2));
        assertEquals(expected6, v.getUtskrift(50, 1));
        assertEquals(expected7, v.getUtskrift(100, 0));
        assertEquals(expected8, v.getUtskrift(200, 1));
        assertEquals(expected9, v.getUtskrift(500, 1));
        assertEquals(expected10, v.getUtskrift(1000, 2));


    }

}
