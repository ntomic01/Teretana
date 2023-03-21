import java.util.Date;

public class UplataClanarine {

    private Vezbac vezbac;
    private double iznos;
    private Date datumUplate;

    public UplataClanarine(Vezbac vezbac, double iznos) {
        this.vezbac = vezbac;
        this.iznos = iznos;
        this.datumUplate = new Date();
    }

    public Vezbac getVezbac() {
        return vezbac;
    }

    public void setVezbac(Vezbac vezbac) {
        this.vezbac = vezbac;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public Date getDatumUplate() {
        return datumUplate;
    }

    public void setDatumUplate(Date datumUplate) {
        this.datumUplate = datumUplate;
    }
}
