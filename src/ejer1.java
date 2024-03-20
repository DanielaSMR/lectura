import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedWriter;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabras; 

        try{//ampliacion
            FileWriter fw = new FileWriter("src/hola.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            do{
            palabras = sc.nextLine();
            if(palabras.equals("99")){
                bw.newLine();
            }else
                bw.write(palabras);
                bw.newLine();
            }while(!palabras.equals("99"));
            bw.close();
            fw.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }   
}
