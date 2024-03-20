import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.*;
import java.lang.*;


public class ejer2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Que archivo quieres modificar?(añade la extension)");
        String archivo = sc.nextLine();
        System.out.println("Escribe el texto");
        String texto = sc.nextLine();

        char[] caracter = texto.toCharArray();
            for(int i = 0;i < caracter.length;i++){
                if(Character.isUpperCase(caracter[i])){
                    System.out.print(Character.toLowerCase(caracter[i]));
                }if(Character.isLowerCase(caracter[i])){
                    System.out.print(Character.toUpperCase(caracter[i]));
                }
            }

        try{
            FileWriter fw = new FileWriter("src/" + archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(caracter); 
            bw.close();
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
