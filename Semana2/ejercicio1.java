package Semana2;
/** Ddes teclado usando la clase scanner, hacer la captura d la edad y el nombre de la persona */
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String nombre;
        int edad;
        System.out.print("Por favor ingrese su nombre: ");
        nombre=sc.nextLine();
        System.out.print("Por favor ingrese su edad: ");
        edad=sc.nextInt();
        System.out.println("La informacion ingresada es la siguiente... Nombre: "+nombre+", Edad: "+edad+" años");
        sc.close();
    }   
}
