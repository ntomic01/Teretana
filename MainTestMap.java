import java.security.KeyStore;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MainTestMap {
    public static void main(String[] args) {


        Map<String,Double> sifarnikKvota = new HashMap<>();
        sifarnikKvota.put("1", 7.5);
        sifarnikKvota.put("x", 3.0);
        sifarnikKvota.put("2", 1.65);

    //    System.out.println(sifarnikKvota.get(3));



        Map<String,String> sifraUtakmice = new HashMap<>();
        sifraUtakmice.put("111", "Crvena zvezda - Partizan");
        sifraUtakmice.put("112", "Bajern Minhen - Borusija Dortmund");
        sifraUtakmice.put("113", "Mladost Lucani - Napredak Krusevac");

     //   System.out.println(sifraUtakmice.get("111"));

        for(Map.Entry pairEntry: sifraUtakmice.entrySet()){
           // System.out.println(pairEntry.getKey() + ":" + pairEntry.getValue() + sifarnikKvota.get(111));
        }

        try {
            File fileObj = new File("ponuda.txt");
            Scanner readFile = new Scanner(fileObj);

            while(readFile.hasNextLine()){
                System.out.println(readFile.nextLine());
            }
            readFile.close();
        }

        catch(FileNotFoundException e){
            System.out.println("Fajl ne postoji!");
        }

        finally {
            System.out.println("Izaberite utakmicu koju hocete da odigrate:");
            Scanner scanner = new Scanner(System.in);
            int sumaKvota = 0;



        }




    }
}
