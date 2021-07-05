package Semana2;
/** Por teclado solicitar la media de tres numeros */
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double num1,num2,num3,media;
        System.out.println("Introduzca tres numeros");
        num1= sc.nextDouble();
        num2= sc.nextDouble();
        num3= sc.nextDouble();
        media = (num1+num2+num3)/3;
        System.out.println("La media de los tres numeros es "+media);
        sc.close();
    }
}
