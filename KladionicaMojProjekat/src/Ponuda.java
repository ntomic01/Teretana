import java.util.List;

public interface Ponuda {

    void ucitajPonudu();

    List<Utakmica> kompletnaPonuda();

    Utakmica pronadjiUtakmicu(Integer sifraUtakmice);

    void dodajUtakmicu(Utakmica utakmica);

}
