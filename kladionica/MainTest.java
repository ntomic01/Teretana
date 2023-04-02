package kladionica;

import java.util.List;
import java.util.Scanner;

public class MainTest {

    public static void ispisiMeni() {
        System.out.println("=======================");
        System.out.println("(0) - izlaz");
        System.out.println("(1) - prikaz ponude");
        System.out.println("(2) - pronadji mec");
        System.out.println("=======================");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ponuda ponuda = new FajlPonuda();

        ponuda.ucitajPonudu();

        while (true) {
            ispisiMeni();
            System.out.print("Izaberi opciju: ");
            int opcija = scanner.nextInt();
            switch (opcija) {
                case 0:
                    return;
                case 1:
                    List<Utakmica> utakmice = ponuda.kompletnaPonuda();
                    for(Utakmica utakmica: utakmice) {
                        System.out.println(utakmica);
                    }
                    break;
                case 2:
                    System.out.print("Unesi sifru meca: ");
                    int sifraMeca = scanner.nextInt();
                    Utakmica utakmica = ponuda.pronadjiUtakmicu(sifraMeca);
                    if(utakmica == null) {
                        System.out.println("Utakmica nije pronadjena");
                    } else {
                        System.out.println(utakmica);
                    }
                    break;
            }
        }


    }

}
