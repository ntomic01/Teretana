import java.util.List;

public interface ClanTeretane {

    public abstract boolean vrsiLiSeUplata();
    String getBrojClanskeKartice();
    public abstract double vratiTrenutniDug();
    public abstract void uplati(double iznos);
    List<UplataClanarine> listaUplata();


}
