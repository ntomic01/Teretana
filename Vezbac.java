import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vezbac extends Osoba implements ClanTeretane{

    private double mesecnaClanarina;
    private String brojClanskeKartice;

    private List<Znacka> znacke;
    private List<UplataClanarine> uplate;

    public Vezbac(String ime, String prezime, String adresa, String jmbg, String brojClanskeKartice, double mesecnaClanarina) {
        super(ime, prezime, adresa, jmbg);
        this.mesecnaClanarina = mesecnaClanarina;
        this.brojClanskeKartice = brojClanskeKartice;
        this.znacke = new ArrayList<>();
        this.uplate = new ArrayList<>();
    }

    @Override
    public double vratiTrenutniDug() {

        if(jeplacenTrenutniMesec()){
            return 0;
        }

        int procenatPopusta = 0;
        for(Znacka znacka: znacke){
            procenatPopusta += znacka.getPopust();
        }
        // formula je: mesecnaClanarina * (100 - procenatPopusta) / 100
        double iznosDuga = mesecnaClanarina * ((double) (100 - procenatPopusta) / 100);
        return mesecnaClanarina;
    }

    @Override
    public void uplati(double iznos) { // iznos za nastalu stetu prilikom koriscenja sprava itd..

        //todo: proveriti da li se uplata vezbaca vrsi pre 5 og(dana) u mesecu, ukoliko se vrsi korisnik dobija znacku redovni platisa, ukolino ne oduzima mu se znacka!

        new Date().getDay();
        if(vratiTrenutniDug()==0){
            System.out.println("Ne postoji dugovanje, nece biti nove uplate!");
        }
        else{
            UplataClanarine uplataClanarine = new UplataClanarine(this, iznos);
            System.out.println("Evidentirana je nova uplata za vezbaca!"+ this.brojClanskeKartice);
            this.uplate.add(uplataClanarine);
            double ukupnoDugovanje = mesecnaClanarina + iznos; // ovde sabiram mesecnu clanarinu i jos neka ostala dugovanja(steta prilikom koriscenja tegova, sprava)..
            System.out.println("Ukupno dugovanje iznosi" + ukupnoDugovanje);
        }

    }

    public boolean jeplacenTrenutniMesec(){

        int trenutniMesec = new Date().getMonth();

        for(UplataClanarine uplataClanarine: uplate){
            uplataClanarine.getDatumUplate().getMonth();

            if(uplataClanarine.getDatumUplate().getMonth() == trenutniMesec){
                System.out.println("Placen je trenutni mesec");
                return true;
            }
        }

        return false;

    }

    public boolean vrsiLiSeUplata(){
        //ako se izvrsi uplata pre 23 eg u mesecu, vezbac dobija neku znacku bilo koju, ukoliko se ne vrsi pre 23 eg, a vec je poseduje(znacku), gubi je!....

        int trenutniDan = new Date().getDay();

        for(UplataClanarine uplataClanarine:uplate){
            uplataClanarine.getDatumUplate().getDay();

            if(trenutniDan<=23){
                System.out.println("Uplata je izvrsena, vezbac dobija" + this.znacke.add(Znacka.redovni_platisa));
                return true;
            }
            else{
                
            }
        }
        return false;
    }

    public double getMesecnaClanarina() {
        return mesecnaClanarina;
    }

    public void setMesecnaClanarina(double mesecnaClanarina) {
        this.mesecnaClanarina = mesecnaClanarina;
    }

    public String getBrojClanskeKartice() {
        return brojClanskeKartice;
    }

    public void setBrojClanskeKartice(String brojClanskeKartice) {
        this.brojClanskeKartice = brojClanskeKartice;
    }

    @Override
    public List<UplataClanarine> listaUplata() {
        return uplate;
    }

    public List<Znacka> getZnacke() {
        return znacke;
    }

    public void dodajNovuZnacku(Znacka znacka){
        this.znacke.add(znacka);
    }

}
