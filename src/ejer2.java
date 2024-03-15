import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class ejer2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Que archivo quieres modificar?(añade la extension)");
        String archivo = sc.nextLine();
        System.out.println("Escribe el texto");
        String texto = sc.nextLine();

        try{
            FileWriter fw = new FileWriter("src/" + archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto); 
            bw.close();
            fw.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
