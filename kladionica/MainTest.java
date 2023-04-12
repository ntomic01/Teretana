package kladionica;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class MainTest {


    public static void appendText(String fileName, String fileContents){

        File fileObj = new File("/Users/igoricelic/Documents/workspace/Teretana/kladionica/uplatna-lista.txt");

        String path = System.getProperty("user.dir") + "\\" + fileName;
        System.out.println(path);

        try{
            Files.write(Paths.get(path), fileContents.getBytes(), StandardOpenOption.APPEND);
            System.out.println("File contents saved into" + fileName);
        }

        catch (IOException error){
            error.printStackTrace();

        }

    }



    public static void ispisiMeni() {
        System.out.println("--------------");
        System.out.println("(0) - izlaz");
        System.out.println("(1) - prikaz ponude");
        System.out.println("(2) - pronadji mec");
        System.out.println("(3) - unesi mec");
        System.out.println("---------------");

    }


    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        Ponuda ponuda = new FajlPonuda();

        ponuda.ucitajPonudu();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Unesi ime fajla:");
//        String fileName = sc.nextLine();
//
//        System.out.println("Please enter file contents:");
//        String fileContents = sc.nextLine();


        while(true){

            ispisiMeni();
            System.out.println("Izaberi opciju:");
            int opcija = scanner.nextInt();

            switch(opcija){
                case 0:
                    return;
                case 1:
                    List<Utakmica> utakmice = ponuda.kompletnaPonuda();
                    for(Utakmica utakmica: utakmice){
                        System.out.println(utakmica);
                    }
                    break;
                case 2:
                    System.out.println("Unesi sifru meca:");
                    int sifraMeca = scanner.nextInt();
                    Utakmica utakmica = ponuda.pronadjiUtakmicu(sifraMeca);

                    if(utakmica == null){
                        System.out.println("utakmica nije pronadjena");
                    }else{
                        System.out.println(utakmica);
                    }
                    break;
                case 3:
                    System.out.print("Unesi zapis meca:");
                    scanner.nextLine();
                    String text = scanner.nextLine();
                    ponuda.dodajUtakmicu(text);
                    System.out.println("utakmica uspesno dodata");
                    break;

            }

        }






    }
}