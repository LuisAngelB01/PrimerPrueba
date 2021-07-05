package Semana1;
/**
 * Ejercicio que pida hora por teclado y que muestre (b-mañana, tardes, noches) segun la hora 
 * que se esté digitando. 
 * mañana : 6 - 12
 * tarde : 13 - 20
 * noche : 21 - 5
 */
import java.util.Scanner;
public class horamilitar {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Intoduzca una hora en formato 24 horas : ");
        var hora= sc.nextInt();
        if( (hora >= 6) && (hora <= 12) ){
            System.out.println("Buenos días");
        }
        else if((hora >= 13) && (hora <= 20)){
            System.out.println("Buenas Tardes");
        }
        else if((hora >= 21 && hora <=24) || (hora >= 1 && hora <= 5)){
            System.out.println("Buenas Noches");
        }
        else{
            System.out.println("Debes digitar una hora en formato 24");
        }
        sc.close();
    }

}
