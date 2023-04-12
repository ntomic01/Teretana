package kladionica;

import java.util.Date;
import java.util.List;

public class Tiket {

    private static Integer BROJAC_TIKETA = 1;

    private Integer sifraTiketa;

    private Date vremeUplate;

    private double ukupnaKvota;

    private double suma;

    private double potencijalniDobitak;

    private List<Kombinacija> kobinacije;

    public Tiket() {
        this.sifraTiketa = BROJAC_TIKETA;
        BROJAC_TIKETA++; // 2, 3, 4
        this.vremeUplate = new Date(); // trenutni datum i vreme
    }

    public void dodajKombinaciju(Utakmica utakmica, String tip) {
        Kombinacija kombinacija = new Kombinacija(utakmica, tip);
        this.kobinacije.add(kombinacija);
    }

    public void uplati(double suma) {
        this.suma = suma;
        double sumaKvota = 0;
        for(Kombinacija kombinacija: kobinacije) {
            sumaKvota = sumaKvota + kombinacija.getKvota();
        }
        this.ukupnaKvota = sumaKvota;
        this.potencijalniDobitak = suma * ukupnaKvota;
    }

    public void ispisiTiket() {
        // todo:
    }

}
