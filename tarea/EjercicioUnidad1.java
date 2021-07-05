package tarea;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;


public class EjercicioUnidad1 {
    /**1. Realizar la suma, la resta, la división y la multiplicación de dos números
    leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
    y <número 2> es igual a <resultado> ”.*/
    public static void OperacionMate(){
        Scanner sc= new Scanner(System.in);
        double num1,num2;
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextFloat();
        System.out.println();
        System.out.println("La operación suma de "+num1+" y "+num2+" es igual a "+(num1+num2));
        System.out.println("La operación resta de "+num1+" y "+num2+" es igual a "+(num1-num2));
        System.out.println("La operación divison de "+num1+" y "+num2+" es igual a "+(num1/num2));
        System.out.println("La operacion rmultiplicacion de "+num1+" y "+num2+" es igual a "+(num1*num2));
        sc.close();
    }

    /**2. Realizar un programa que realice el promedio de las notas de un alumno,
    para ello el programa va a tener que solicitar el nombre del alumno y las
    notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
    3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
    “Reprobado” . Requisitos: Las notas que se ingresan pueden tener
    decimales.*/
    public static void PromedioNotas(){
        Scanner a= new Scanner(System.in);
        float nota,sum=0,prom;
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre=a.nextLine();
        for(int i=1;i<=3;i++){
            System.out.print("Ingrese la nota "+i+": ");
            nota=a.nextFloat();
            sum+=nota;
        }
        prom=sum/3;
        String promedio= new DecimalFormat("#.##").format(prom);
        System.out.println("Alumno: "+nombre);
        System.out.println("Promedio de notas: "+promedio);
        System.out.println((prom>=3)?"Estado: Aprobado":"Estado: Reprobado");
        a.close();
    }

    /**3. Realizar un programa que calcule el sueldo de un trabajador, el programa
    solicita el número de horas que has trabajado en un mes, las horas se
    pagan a $30.000.*/
    public static void SueldoPorHoras(){
        Scanner a=new Scanner(System.in);
        int ValorHora=30000, salario;
        System.out.print("Ingrese el numero de horas del trabajador: ");
        byte hora= a.nextByte();
        salario= ValorHora*hora;
        String salary= new DecimalFormat("$#,###.###").format(salario);
        System.out.println("El sueldo del trabajo es de "+salary);
        a.close();
    }

    /**4. Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
    número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
    tabla y mostrar los datos.*/
    public static void TablaDeMultiplicar(){
        int num,prod;
        Scanner e= new Scanner(System.in);
        System.out.print("Ingrese el numero de la tabla de multiplicar: ");
        num= e.nextInt();
        for(int i=0; i<=10; i++){
            prod=num*i;
            System.out.println(num+" x "+i+" = "+prod);
        }
        e.close();
    }

    /**5. Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
    adivinar introduciendo el número por teclado. En el caso que el número a
    adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
    mayor”, de lo contrario, “El número que busca es menor”. El programa
    finalizará cuando se introduzca el número correcto. Nota: usar la clase
    Random para generar el número aleatorio. */
    public static void AdivinarElNum(){
        Scanner a= new Scanner(System.in);
        int numAle= new Random().nextInt(100), num;
        boolean Q= true;
        while(Q){
            System.out.print("Ingrese un numero: ");
            num=a.nextInt();
            if(numAle>num){
                System.out.println("El numero secreto es mayor");
            }
            else if (numAle<num){
                System.out.println("El numero secreto es menor");
            }
            else{
                System.out.println("Adivinaste el numero, felicidades.");
                Q=false;
            }
        }
        a.close();
    }

    /**6. Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
    que calcule el peso ideal.
    ○ peso ideal mujeres = altura - 120
    ○ peso ideal hombres = altura - 110*/
    public static void PesoIdeal(){
        Scanner a=new Scanner(System.in);
        String Sex;
        int altura;
        System.out.print("Ingrese el sexo (H/M): ");
        Sex=a.nextLine().toUpperCase();
        System.out.print("Ingrese la altura (cm): ");
        altura=a.nextInt();
        if (Sex.equals("H")){
            System.out.println("El peso ideal hombre: "+(altura-110));
        } else if (Sex.equals("M")){
            System.out.println("El peso idel mujer: "+(altura-120));
        }
        else{
            System.out.println("Ingreso una letra incorrecta");
        }
        a.close();
    }

    /**7. Pedir un número, comprobar si es primo y preguntar si quiere introducir más
    (S/N) y volver a pensar.*/
    public static void NumeroPrimo(){
        Scanner sc=new Scanner(System.in);
        int num;
        boolean Q=true;
        while(Q){
            int contador=2;
            System.out.print("Ingrese un numero: ");
            num=sc.nextInt();
            
            boolean primo=true;
            while((primo) && (contador!=num)){
                if(num % contador == 0){
                    primo=false;
                }
                contador++;
            }
            System.out.println((primo==Boolean.TRUE)?"El numero ingresado es primo":"El numero ingresado no es primo");
            System.out.print("Desea ingresar otro numero: ");
            sc.nextLine();
            Q=(sc.nextLine().toUpperCase().equals("S")?Boolean.TRUE:Boolean.FALSE);
        }
        sc.close();
    }

    /**8. Realizar un programa que permita controlar el juego de piedra, papel, tijera
    introduciendo P para piedra, L para papel y T para tijera por cada jugador.
    El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
    de cada ronda preguntar si desea volver a jugar. */
    public static void JuegoDePI_PA_TI(){
        Scanner a= new Scanner(System.in);
        String j1,j2;
        boolean Q=true;
        while(Q){
            System.out.println("P-Piedra\t L-Papel\t T-Tijera");
            System.out.print("Ingrese la opcion del jugador 1: ");
            j1=a.nextLine().toUpperCase();
            System.out.print("Ingrese la opcion del jugador 2: ");
            j2=a.nextLine().toUpperCase();
            if (j1.equals("P") && j2.equals("T") || j1.equals("L") && j2.equals("P") || j1.equals("T") && j2.equals("L") ){
                System.out.println("El jugador 1 es el ganador!");
            } 
            else if (j2.equals("P") && j1.equals("T") || j2.equals("L") && j1.equals("P") || j2.equals("T") && j1.equals("L") ){
                System.out.println("El jugador 2 es el ganador!");
            }
            else{
                System.out.println("Es un empate!");
            }
            System.out.print("Desea volver a jugar (S/N): ");
            Q=(a.nextLine().toUpperCase().equals("S")?Boolean.TRUE:Boolean.FALSE);
        }
        a.close();
    }

    /**9. Pide por teclado el nombre, edad y salario y muestra el salario
    ○ Si es menor de 16 no tiene edad para trabajar
    ○ Entre 19 y 50 años el salario es un 5 por ciento más
    ○ Entre 51 y 60 años el salario es un 10 por ciento más
    ○ Si es mayor de 60 el salario es un 15 por ciento más */
    public static void SalarioPorEdad(){
        Scanner sc=new Scanner(System.in);
        String name;
        Byte edad;
        double salario,salary=0;
        System.out.print("Ingrese el nombre: ");
        name=sc.nextLine();
        System.out.print("Ingrese la edad: ");
        edad=sc.nextByte();
        System.out.print("Ingrese el salario: ");
        salario=sc.nextDouble();
        System.out.println("Nombre: "+name);
        if (edad < 16){
            System.out.println("No tiene edad suficiente para trabajar");
        } else if (edad >=19 && edad <= 50){
            System.out.println("El aumento del salario es del 5%");
            salary=salario+(salario*0.05);
        } else if (edad >=51 && edad <=60){
            System.out.println("El aumento del salario es del 10%");
            salary=salario+(salario*0.1);
        } else if (edad>60){
            System.out.println("El aumento del salario es del 15%");
            salary=salario+(salario*0.15);
        } else{
            System.out.println("Edad invalida");
        }
        String sal= new DecimalFormat("$#,###.###").format(salary);
        System.out.println("Salario: "+sal);
        sc.close();
    }

    /**10. Muestra la serie de fibonacci hasta un número pedido por teclado. Por
    ejemplo, si el número ingresado es el 100, debe imprimir los números 0, 1,
    1, 2, 3, 5, 8, 13, 21, 34, 55, 89 */
    public static void SerieFibonacci(){
        Scanner sc= new Scanner(System.in);
        int a=0, b=1, c, n;
        System.out.print("Ingrese el limite para la serie fibonacci: ");
        n=sc.nextInt();
        while(a<n){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
        sc.close();
    }
    public static void main(String[] args) {
        //OperacionMate();
        //PromedioNotas();
        //SueldoPorHoras();
        //TablaDeMultiplicar();
        //AdivinarElNum();
        //PesoIdeal();
        //NumeroPrimo();
        //JuegoDePI_PA_TI();
        //SalarioPorEdad();
        SerieFibonacci();
    }
}
