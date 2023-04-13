package kladionica;

import java.io.File;

public class FileTicketStore implements TicketStore {

    @Override
    public void sacuvaj(Tiket tiket) {
        // 1.txt, 2.txt, 3.txt ...
        File file = new File(tiket.getSifraTiketa()+".txt");
        // todo: sacuvati sadrzaj
    }

    @Override
    public Tiket pronadjiTiket(Integer sifraTiketa) {
        return null;
    }

    @Override
    public void stampajTiket(Integer sifraTiketa) {

    }

}
