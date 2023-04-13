package kladionica;

public interface TicketStore {

    void sacuvaj(Tiket tiket);

    Tiket pronadjiTiket(Integer sifraTiketa);

    void stampajTiket(Integer sifraTiketa);

}
