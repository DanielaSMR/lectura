import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class ejer6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        /*System.out.println("Introduce un coche\nEscribe la matricula");
        String matricula = sc.nextLine();
        System.out.println("Escribe la marca");
        String marca = sc.nextLine();
        System.out.println("Escribe el modelo");
        String modelo = sc.nextLine();
        System.out.println("Escribe el tamaño del desposito");
        Double tamaño = sc.nextDouble();*/
        System.out.println("Introduce un coche\nEscribe la matricula");
        String matricula = "MATRIfasdf";
        System.out.println("Escribe la marca");
        String marca = "MARCA";
        System.out.println("Escribe el modelo");
        String modelo = "MODELO";
        System.out.println("Escribe el tamaño del desposito");
        Double tamaño = 35.0;

        try{
           
            FileOutputStream fos = new FileOutputStream("src/ejer3-1/ejer6.bin", true);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF("\nEl vehículo tiene una matrícula " + matricula);
            dos.writeUTF("Su marca es " + marca);
            dos.writeUTF("Su modelo es " + modelo);
            dos.writeUTF("El tamaño del deposito es "+ tamaño);
            dos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("src/ejer3-1/ejer6.bin");
            DataInputStream dis = new DataInputStream(fis);
            int i;
            System.out.println(dis.readUTF());
            /*while((i=dis.read()) !=-1){
               System.out.print(dis.readUTF());
            }*/
            
            dis.close();
            fis.close();


        }catch(Exception ex){
            System.out.println("El error es: " + ex.getMessage());
        }



    }
}