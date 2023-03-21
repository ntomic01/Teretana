import java.sql.SQLOutput;
import java.util.Date;
public class MainTest {
    public static void main(String[] args) {

        Vezbac vezbac1 = new Vezbac("Nikola", "Tomic", "Radnicka12,Sabac", "1703001772028", "123-UrbanGym", 3000);
        vezbac1.dodajNovuZnacku(Znacka.student);

        Vezbac vezbac2 = new Vezbac("Igor", "Icelic", "Mokranjceva 18,Beograd", "34124324234", "111- Konan", 3000);
        vezbac2.dodajNovuZnacku(Znacka.redovni_platisa);
        System.out.println("Iznos duga za" + vezbac1.getIme()+ ":" + vezbac1.vratiTrenutniDug());
        System.out.println("Iznos duga za" + vezbac2.getIme()+ ":" + vezbac2.vratiTrenutniDug());


        Teretana teretana1 = new Teretana("Konan","Sabac");
        Teretana teretana2 = new Teretana("Ahilej", "Novi Beograd");

        teretana1.uclaniNovogVezbaca(vezbac1);
        teretana2.uclaniNovogVezbaca(vezbac2);

        teretana1.ispisiSveDuznike();
        teretana2.ispisiSveDuznike();

        System.out.println(vezbac1.vrsiLiSeUplata());




    }
}
