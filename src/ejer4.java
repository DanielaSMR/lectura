import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
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

        File ficheroCopiado = new File(fichero1);
        File ficheroDestino = new File(fichero2);

        try{
            FileInputStream fis = new FileInputStream(ficheroCopiado);
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream(ficheroDestino);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            //crea el array de bytes
            byte[] buffer = new byte[(int) ficheroCopiado.length()]; 
            
            int leerBytes = bis.read(buffer);

            //Escribe el contenido del array al fichero destino
            bos.write(buffer, 0,leerBytes);

        }catch(Exception ex){
                System.out.println("Error al copiar el fichero" + ex.getMessage());
            }

    
    
    }


}