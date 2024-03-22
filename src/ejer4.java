import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.ByteArrayOutputStream;

public class ejer4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Que fichero quieres copiar?\tEscribe la ruta del fichero");
        String fichero1 = sc.nextLine();
        File ficherof1 = new File(fichero1);
        System.out.println("Donde quieres copiarlo?\tEscribe la ruta donde situaras el fichero");
        String fichero2 = sc.nextLine();
    
        try{
            byte[] bit = {74, 65, 86, 65};
            ByteArrayOutputStream baos = new ByteArrayOutputStream(bit);
            int i = 0;
            while((i = baos.read()) != -1){

            }
            

        }catch(Exception ex){
            ex.printStackTrace();
        }

    
    
    }


}