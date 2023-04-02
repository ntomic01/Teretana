package kladionica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FajlPonuda implements Ponuda {

    private List<Utakmica> utakmice = new ArrayList<>();

    @Override
    public void ucitajPonudu() {
        try {
            File fileObj = new File("/Users/igoricelic/Documents/workspace/Teretana/kladionica/uplatna-lista.txt");
            Scanner readFile = new Scanner(fileObj);

            while(readFile.hasNextLine()){
                String utakmicaText = readFile.nextLine();
                // "1", "Zvezda", "Partizan", "1.8", "3.45", "4.7"
                String[] nizPoljaUtakmica = utakmicaText.split(",");
                Integer sifraUtakmice = Integer.parseInt(nizPoljaUtakmica[0]); // "1"
                String domacin = nizPoljaUtakmica[1]; // "Zvezda"
                String gost = nizPoljaUtakmica[2]; // "Partizan"
                Map<String, Double> kvote = new HashMap<>();
                kvote.put("1", Double.parseDouble(nizPoljaUtakmica[3]));
                kvote.put("X", Double.parseDouble(nizPoljaUtakmica[4]));
                kvote.put("2", Double.parseDouble(nizPoljaUtakmica[5]));
                Utakmica utakmica = new Utakmica(sifraUtakmice, domacin, gost, kvote);
                utakmice.add(utakmica);
            }
            readFile.close();
        } catch(FileNotFoundException e){
            System.out.println("Fajl ne postoji!");
        }

    }

    @Override
    public List<Utakmica> kompletnaPonuda() {
        return utakmice;
    }

    @Override
    public Utakmica pronadjiUtakmicu(Integer sifraUtakmice) {
        // for kroz utakmice i ako se pornadje vrati se nazad
        return null;
    }

    @Override
    public void dodajUtakmicu(Utakmica utakmica) {
        // treba da se appentuje na postojeci fajl
    }
}
