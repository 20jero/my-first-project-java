package ejercicios_logica;

import java.util.Scanner;

public class Ejercicio2 {

    static Scanner entrada = new Scanner(System.in);
    static float peso = 0;
    static float sumaPeso = 0;
    static int totalPersonas = 0;

    public static void main(String[] args) {
        System.out.println("-----Bienvenidos al ascensor-----");
        for (int capacidadMax = 1; capacidadMax <= 8; capacidadMax++) {
            System.out.println("Ingrese y escriba su peso:");
            peso=entrada.nextFloat();
            sumaPeso+=peso;
            totalPersonas+=1;
            if(capacidadMax==8){
                System.out.println("Capacidad de personas máxima alcanzada");
            }else if(sumaPeso>=1000){
                System.out.println("Capacidad de peso máxima superada, por favor bajese del ascensor");
                totalPersonas-=1;
                sumaPeso-=peso;
                break;
            }else if(peso==-1){
                System.out.println("No hay más personas en la fila");
                totalPersonas-=1;
                break;
            }
        }
        System.out.println("-----Cerrando Puertas-----");
        System.out.println("Personas en el ascensor: "+totalPersonas+"\nPeso total: "+sumaPeso);
    }
}
