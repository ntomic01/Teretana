package kladionica;

import java.util.Scanner;

public class MainMeni {

    static Scanner scanner = new Scanner(System.in);
    static Ponuda ponuda;

    static void meniPonuda() {
        while (true) {
            System.out.println("========== PONUDA ==============");
            System.out.println("(1) - prikazi ponudu");
            System.out.println("(2) - pronadji mec");
            System.out.println("(3) - dodaj mec");
            System.out.println("(0) - nazad");
            System.out.println("================================");
            System.out.print("Unesi komandu: ");
            int komanda = scanner.nextInt();
            switch (komanda) {
                case 0:
                    return;
            }
        }
    }

    static void meniTiket() {
        while (true) {
            System.out.println("========== TIKETI ==============");
            System.out.println("(1) - uplati tiket");
            System.out.println("(2) - pronadji tiket");
            System.out.println("(3) - stampa tiketa");
            System.out.println("(0) - nazad");
            System.out.println("================================");
            System.out.print("Unesi komandu: ");
            int komanda = scanner.nextInt();
            switch (komanda) {
                case 0:
                    return;
                case 1:
                    uplatiTiket();
                    break;
            }
        }
    }

    static void uplatiTiket() {
        Tiket tiket = new Tiket();
        while (true) {
            System.out.println("========== UPLATA TIKETA ==============");
            System.out.println("(1) - dodaj mec");
            System.out.println("(2) - pregled tiketa");
            System.out.println("(3) - uplata");
            System.out.println("=======================================");
            System.out.print("Unesi komandu: ");
            int komanda = scanner.nextInt();
            switch (komanda) {
                case 1:
                    System.out.print("Unesi sifru meca: ");
                    int sifra = scanner.nextInt();
                    System.out.println("Unesi tip: ");
                    int tip = scanner.nextInt();
                    Utakmica utakmica = ponuda.pronadjiUtakmicu(sifra);
                    tiket.dodajKombinaciju(utakmica, String.valueOf(tip));
                    break;
                case 2:
                    tiket.ispisiTiket();
                    break;
                case 3:
                    System.out.print("Unesi iznos: ");
                    double iznos = scanner.nextDouble();
                    tiket.uplati(iznos);
                    // todo: sacuvaj tiket
                    System.out.println("Tiket uspesno uplacen, potencijalni dobitak je: "+tiket.getPotencijalniDobitak());
                    return;
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("========== GLAVNI MENI ==============");
            System.out.println("(1) - ponuda");
            System.out.println("(2) - tiketi");
            System.out.println("(0) - izlaz");
            System.out.println("=====================================");
            System.out.print("Unesi komandu: ");
            int komanda = scanner.nextInt();
            switch (komanda) {
                case 0:
                    return;
                case 1:
                    meniPonuda();
                    break;
                case 2:
                    meniTiket();
                    break;
                default:
                    System.out.println("Pogresan unos!");
                    break;
            }
        }


    }

}
