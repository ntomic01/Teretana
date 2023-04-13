package kladionica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tiket {

    private static Integer BROJAC_TIKETA = 1;

    private Integer sifraTiketa;

    private Date vremeUplate;

    private double ukupnaKvota;

    private double iznosUplate;

    private double potencijalniDobitak;

    private List<Kombinacija> kombinacije;

    private List<Utakmica> utakmice;

    private Utakmica utakmica;




    public Tiket() {
        this.sifraTiketa = BROJAC_TIKETA;
        BROJAC_TIKETA++; // 2, 3, 4
        this.vremeUplate = new Date(); // trenutni datum i vreme
    }

    public void dodajKombinaciju(Utakmica utakmica, String tip) {
        Kombinacija kombinacija = new Kombinacija(utakmica, tip);
        this.kombinacije.add(kombinacija);
    }

    public void uplati(double iznosUplate) {
        this.iznosUplate = iznosUplate;
        double sumaKvota = 0;
        for(Kombinacija kombinacija: kombinacije) {
            sumaKvota = sumaKvota + kombinacija.getKvota();
        }
        this.ukupnaKvota = sumaKvota;
        this.potencijalniDobitak = iznosUplate * ukupnaKvota;
    }

    public boolean validnaUtakmica(){
        for(Utakmica utakmica: utakmice){
            if(utakmica.getSifra()==1 && utakmica.getSifra()<10){
               return true;
            }
        }
        return false;
    }

    public void ispisiTiket() {
        for(Kombinacija kombinacija: kombinacije){

            if(validnaUtakmica()){
                // ako je utakmica validna, tada na tiket dodajem utakmicu
            }
            else{
                System.out.println("Utakmica nije validna, nece biti dodata na tiket!");
            }

        }
    }


}
