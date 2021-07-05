package Semana2;
/**Apatir de la lectura de datos de teclado nos brinde dos numeros, en la salida indicara el doble del primero mas el segundo*/
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese los dos numeros");
        num1= sc.nextInt();
        num2= sc.nextInt();
        System.out.println("Los numeros ingresados son: "+num1+", "+num2);
        System.out.println("EL doable del primero mas el segundo es: "+(num1*2+num2));
        sc.close();
    }
}
