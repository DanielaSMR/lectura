import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class ejer5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Escribe el fichero con la ruta donde guardaras los numeros");
        String fichero = sc.nextLine();
        System.out.println("Cuantos numeros quieres escribir?");
        int contador = sc.nextInt();

        try{
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);
            int num = 0;
            for(int i = 0;i < contador;i++){
                System.out.println("Escribe un numero entre 0 y 100");
                num = sc.nextInt();
                if(num > 100 || num < 0){
                    System.out.println("No es valido");
                }else{
                    dos.writeInt(num);
                }
            }
            dos.close();
            fos.close();
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);

            System.out.println(dis.readInt());
            System.out.println("Escribiste: " + contador + " numeros");
            dis.close();
            fis.close();
        }catch(Exception ex){
            ex.addSuppressed(ex);
        }


    }
}