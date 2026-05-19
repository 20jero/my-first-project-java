package ejercicios_logica;

import java.util.Scanner;

public class Ejercicio1 {

    static Scanner entrada = new Scanner(System.in);
    static float peso = 0;
    static int contador = 0;
    static int totalDulces=0;
    static int dulcesAprobados = 0;
    static int dulcesDefectuosos=0;
    static float porcentajeDefectuososo = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Ingrese el peso del dulce");
            peso = entrada.nextFloat();
            totalDulces+=1;
            if((peso<8||peso>12)&& peso>0){
                contador+=1;
                dulcesDefectuosos+=1;
                System.out.println("~~Dulce defectuoso detectado~~");
            }else if(peso==0){
                System.out.println("-----Fin del análisis-----");
                totalDulces-=1;
                break;
            }else if(peso<0){
                System.out.println("~~Peso inválido~~");
                totalDulces-=1;
                continue;
            }else{
                contador=0;
                dulcesAprobados+=1;
                System.out.println("~~Dulce aprobado~~");
                continue;
            }
            if(contador==3){
                System.out.println("-----Detención de Emeregencia-----");
                break;
            }
        }
        porcentajeDefectuososo=((100*dulcesDefectuosos)/totalDulces);
        System.out.println("Dulces analizados: "+totalDulces+"\nDulces aprobados: "+dulcesAprobados+"\nDulces defectuosos: "+dulcesDefectuosos+"\nPorcentaje de dulces defectuosos: "+porcentajeDefectuososo+"%");
    }
}
