import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ejer3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Escribe la ruta del primer fichero");
        String fichero1 = sc.nextLine();
        File ficherof1 = new File(fichero1);
        System.out.println("Escribe la ruta del segundo fichero");
        String fichero2 = sc.nextLine();
        File ficherof2 = new File(fichero2);
        System.out.println("Escribe la ruta del fichero final");
        String ruta = sc.nextLine();

        String NomFichero1 = ficherof1.getName();
        String NomFinal = NomFichero1.substring(0,NomFichero1.lastIndexOf("."));
        String ficheroFinal = NomFinal + "_" + ficherof2.getName();
        
        System.out.println(ficheroFinal);
        try{
            FileReader fr = new FileReader(fichero1);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(ruta + ficheroFinal);
            BufferedWriter bw = new BufferedWriter(fw);
            String linea1;
            while((linea1 = br.readLine())!=null){
                bw.write(linea1);
            }

            fr = new FileReader(fichero2);
            br = new BufferedReader(fr);

            while((linea1 = br.readLine())!=null){
                bw.write(linea1);
            }
            bw.close();
            fw.close();
            br.close();
            fr.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}