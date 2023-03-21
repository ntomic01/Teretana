public enum Znacka {

    ucenik(10, "Ova kategorija se vezuje za ucenike osnovnih i srednjih skola"),
    student(5, "Ova kategorija se vezuje za studente"),
    dugogodisnji_clan(13,"bla-bla"),
    redovni_platisa(3, "bla-bla");

    private final int popust;
    private final String opis;

    Znacka(int popust,String opis) {
        this.popust = popust;
        this.opis = opis;
    }

    public int getPopust() {
        return popust;
    }

    public String getOpis() {
        return opis;
    }
}
