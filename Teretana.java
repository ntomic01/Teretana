import java.util.List;
import java.util.ArrayList;

public class Teretana {

    private String naziv;
    private String adresa;
    private List<Trener> treneri;
    private List<ClanTeretane> clanovi;

    public Teretana(String naziv,String adresa) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.treneri = new ArrayList<>();
        this.clanovi = new ArrayList<>();
    }

    public void zaposliNovogTrenera(Trener trener){
        this.treneri.add(trener);
    }

    public void uclaniNovogVezbaca(ClanTeretane clanTeretane){
        this.clanovi.add(clanTeretane);
    }

    public String getNaziv() {
        return naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public List<ClanTeretane> getClanovi() {
        return clanovi;
    }

    public List<Trener> getTreneri() {
        return treneri;
    }

    public void ispisiSveDuznike(){
        for(ClanTeretane clanTeretane: clanovi) {
            double trenutniDug = clanTeretane.vratiTrenutniDug();
            if (trenutniDug > 0) {
                System.out.println("Dug od" + trenutniDug + "kod clana" + clanTeretane.getBrojClanskeKartice());
            }
        }
    }


}
