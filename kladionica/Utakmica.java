package kladionica;

import java.util.Map;

public class Utakmica {

    private Integer sifra;

    private String domacin;

    private String gost;

    // 1 - 1.5 (X - 3.5) 2 - 4.2
    private Map<String, Double> kvote;

    public Utakmica(Integer sifra, String domacin, String gost, Map<String, Double> kvote) {
        this.sifra = sifra;
        this.domacin = domacin;
        this.gost = gost;
        this.kvote = kvote;
    }

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
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

    public Map<String, Double> getKvote() {
        return kvote;
    }

    public void setKvote(Map<String, Double> kvote) {
        this.kvote = kvote;
    }

    @Override
    public String toString() {
        return "Utakmica{" +
                "sifra=" + sifra +
                ", domacin='" + domacin + '\'' +
                ", gost='" + gost + '\'' +
                ", kvote=" + kvote +
                '}';
    }
}
