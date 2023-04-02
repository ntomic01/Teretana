import java.util.Date;
import java.util.Map;


public class Utakmica {

    private String sifra;
    private String domacin;
    private String gost;
    private Date datumIVreme;
    private Map<String,Double> sifarnikKvota;
    private Map<String, String> sifraKvote;

    public Utakmica(String sifra, String domacin, String gost, Date datumIVreme, Map<String, Double> sifarnikKvota, Map<String, String> sifraKvote) {
        this.sifra = sifra;
        this.domacin = domacin;
        this.gost = gost;
        this.datumIVreme = datumIVreme;
        this.sifarnikKvota = sifarnikKvota;
        this.sifraKvote = sifraKvote;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getDomacin() {
        return domacin;
    }

    public void setDomacin(String domacin) {
        this.domacin = domacin;
    }

    public String getGost() {
        return gost;
    }

    public void setGost(String gost) {
        this.gost = gost;
    }

    public Date getDatumIVreme() {
        return datumIVreme;
    }

    public void setDatumIVreme(Date datumIVreme) {
        this.datumIVreme = datumIVreme;
    }

    public Map<String, Double> getSifarnikKvota() {
        return sifarnikKvota;
    }

    public void setSifarnikKvota(Map<String, Double> sifarnikKvota) {
        this.sifarnikKvota = sifarnikKvota;
    }

    public Map<String, String> getSifraKvote() {
        return sifraKvote;
    }

    public void setSifraKvote(Map<String, String> sifraKvote) {
        this.sifraKvote = sifraKvote;
    }
}
