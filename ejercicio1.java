import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num= sc.nextInt();

        System.out.println("El numero es: "+num);
        System.out.println("El doble del numero es: "+num*2);
        System.out.println("El triple del ssnumero es "+num*3);
        sc.close();
    }
}