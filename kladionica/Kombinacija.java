package kladionica;

public class Kombinacija {

    private Utakmica utakmica;

    private String tip;

    private double kvota;

    public Kombinacija(Utakmica utakmica, String tip) {
        this.utakmica = utakmica;
        this.tip = tip;
        this.kvota = this.utakmica.getKvote().get(tip);
    }

    public Utakmica getUtakmica() {
        return utakmica;
    }

    public void setUtakmica(Utakmica utakmica) {
        this.utakmica = utakmica;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public double getKvota() {
        return kvota;
    }

    public void setKvota(double kvota) {
        this.kvota = kvota;
    }

}
