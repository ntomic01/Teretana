public abstract class Osoba {

    private String ime;
    private String prezime;
    private String adresa;
    private String jmbg;

    public Osoba(String ime, String prezime, String adresa, String jmbg) {
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.jmbg = jmbg;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
}
