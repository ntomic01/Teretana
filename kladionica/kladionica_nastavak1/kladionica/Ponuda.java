package kladionica;

import java.util.List;

public interface Ponuda {

    void ucitajPonudu();

    List<Utakmica> kompletnaPonuda();

    Utakmica pronadjiUtakmicu(Integer sifraUtakmice);

    void dodajUtakmicu(String text);

}
