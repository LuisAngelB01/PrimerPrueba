package Semana1;
/* Apartir de un array multidimensional de 3*2 quiero que me genere la fila y me traiga la columna y luego se genere sucesivamente la fila y la columna */
public class arreglo2 {
    public static void main(String[] args) {
        int [][] m = {{1,2},{3,4},{5,6}};
        int fila, columna;
        for(fila=0; fila<3; fila++){
            System.out.println("La fila es "+(fila+1));
            for(columna=0; columna<2; columna++){                
            System.out.println("El valor contenido en la fila "+(fila+1)+" y columna "+(columna+1)+" es "+m[fila][columna]);
        }
    }
}

}