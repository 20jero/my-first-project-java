package ejerciciosPracticos;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner var_teclado = new Scanner(System.in);
    static int contador_consecutivo=0;
    static double temperatura=0.0;
    public static void main(String[] args) {
        System.out.println("---------Iniciando sistema---------");
        while(true){
            System.out.println("Ingrese la temperatura: ");
            temperatura=var_teclado.nextDouble();
            System.out.println("T: "+temperatura+"°C");
            if(temperatura>100){
                contador_consecutivo+=1;
                System.out.println("Precaución, temperatura mayor a 100°C");
            }else{
                contador_consecutivo=0;
            }
            if(contador_consecutivo==3){
                System.out.println("Alerta General \nLa temperatura ha superado los 100°C tres veces");
                break;
            }    
        }
        var_teclado.close();
    }
}
