package kladionica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;




public class AppendTest {

    public static void main(String[] args) throws IOException {

       //FileWriter fileObj = new FileWriter("C:\\Users\\Nikola\\IdeaProjects\\KladionicaMojProjekat\\src\\uplatna-lista.txt"); // ovako sam probao al onda mi brise ovih 5 utakmica
        FileWriter fileObj = new FileWriter("mojFajl.txt");
        BufferedWriter b = new BufferedWriter(fileObj);
        b.write("Dobrodosli\n");
        b.write(" 6. Borusija-Minhhen 1.67 3.4 5.6 ");
        b.newLine();
        b.close();


    }

}
