package aed;

import java.util.Scanner;
import java.io.PrintStream;

class Archivos {
    float[] leerVector(Scanner entrada, int largo) {

        float[] res = new float[largo];

        for (int i = 0; i < res.length; i++){
            res[i] = entrada.nextFloat();
        }
        
        return res;
    }   

    float[][] leerMatriz(Scanner entrada, int filas, int columnas) {
        float[][] res = new float[filas][columnas];
        
        for (int i = 0; i < columnas; i++){
            for (int j = 0; j < filas; i++){
                res[i][j] = entrada.nextFloat();
            }
        }

        return res;
    }

    void imprimirPiramide(PrintStream salida, int alto) {
        float alto-1 + * + alto-1
        
    }
}
