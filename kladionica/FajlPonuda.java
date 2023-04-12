package kladionica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FajlPonuda implements Ponuda {

    private static final String FILE_PUTANJA = "/Users/igoricelic/Documents/workspace/Teretana/kladionica/uplatna-lista.txt";

    private List<Utakmica> utakmice = new ArrayList<>();

    @Override
    public void ucitajPonudu() {
        try {
            utakmice.clear();
            File fileObj = new File(FILE_PUTANJA);
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
        // select * from utakmice where sifra_utakmice = :sifra
        for(Utakmica utakmica: utakmice) {
            if(utakmica.getSifra().equals(sifraUtakmice)) {
                return utakmica;
            }
        }
        return null;
    }

    @Override
    public void dodajUtakmicu(String text) {
    // treba da se appenduje(doda) na postojeci fajl!
        try {
            FileWriter fileObj = new FileWriter(FILE_PUTANJA, true);
            BufferedWriter b = new BufferedWriter(fileObj);
            b.append(text);
            b.newLine();
            b.close();
            ucitajPonudu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

