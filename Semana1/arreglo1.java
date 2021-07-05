package Semana1;
/**
 * Array de 1 dimensión , solicitar a usuario el indice del arreglo para mostrarlo
 */
import java.util.Scanner;
    
public class arreglo1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[] a =  { 2,3,4,5 };
        System.out.println("El arreglo A tiene " + a.length + " elementos");
        System.out.println("Digite el número del elemento que desea visualizar : ");
        var indice= sc.nextInt();
        if( indice <= a.length){
            System.out.println("El valor del indice " + indice + " es "+ a[indice]);
        }
        else{
            System.out.println("El indice no existe");
        }
        sc.close();
    }
}
