import java.io.FilterOutputStream;
import java.util.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class FajlPonuda implements Ponuda {

    private List<Utakmica> utakmice = new ArrayList<>();

    @Override
    public void ucitajPonudu() {
        try {
            File fileObj = new File("C:\\Users\\Nikola\\IdeaProjects\\KladionicaMojProjekat\\src\\uplatna-lista.txt");
            Scanner readFile = new Scanner(fileObj);

            while (readFile.hasNextLine()) {
                String utakmicaText = readFile.nextLine();
                //niz polja utakmica je niz koji je podeljen zarezima i to sad cepamo na tokene, delimo ih u sledecoj liniji koda:
                String[] nizPoljaUtakmica = utakmicaText.split(",");
                Integer sifraUtakmice = Integer.parseInt(nizPoljaUtakmica[0]); // ovo je 1
                String domacin = nizPoljaUtakmica[1]; // ovo je zvezda
                String gost = nizPoljaUtakmica[2]; // ovo je partizan
                Map<String,Double> kvote = new HashMap<>();

                kvote.put("1", Double.parseDouble(nizPoljaUtakmica[3]));
                kvote.put("x", Double.parseDouble(nizPoljaUtakmica[4]));
                kvote.put("2", Double.parseDouble(nizPoljaUtakmica[5]));

               Utakmica utakmica = new Utakmica(sifraUtakmice, domacin, gost, kvote);
                utakmice.add(utakmica);

                System.out.println(utakmicaText);

            }
            readFile.close();
        }

        catch (FileNotFoundException e){
            System.out.println("Fajl ne postoji, niste lepo ocitali pathname!");
        }

    }

    @Override
    public List<Utakmica> kompletnaPonuda() {
        return utakmice;
    }

    @Override
    public Utakmica pronadjiUtakmicu(Integer sifraUtakmice) {

        while(true){
            for(Utakmica utakmica: utakmice){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Unesi sifru meca:");
                int sifraMeca = scanner.nextInt();
                if(sifraMeca == 1){



                }

            }
        }



    }

    @Override
    public void dodajUtakmicu(Utakmica utakmica) {
    // treba da se appenduje(doda) na postojeci fajl!


    }
}

