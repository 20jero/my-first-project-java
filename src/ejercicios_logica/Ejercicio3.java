package ejercicios_logica;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner entrada = new Scanner(System.in);
    static int digito = 0;
    static int contador = 0;
    static int anterior1 = 0;
    static int anterior2 = 0;
    static int anterior3 = 0;
    static String motivo = "";   
    public static void main(String[] args) {
        while(true){
            contador+=1;
            System.out.println("Escriba el dígito #"+contador+" de su contraseña");
            digito=entrada.nextInt();
            if(digito>10){
                System.out.println("Escriba valores de un solo dígito");
                contador-=1;
                continue;
            }
            anterior3=anterior2;
            anterior2=anterior1;
            anterior1=digito;
            if (anterior1==anterior2 && anterior2==anterior3){
                System.out.println("~~Contraseña insegura~~");
                motivo=("Digito repetido 3 veces consecutivas ("+anterior3+" "+anterior2+" "+anterior1+")");
                break;
            }
            if (anterior3==anterior2-1&&anterior2==anterior1-1&&anterior1==anterior2+1){
                System.out.println("~~Contraseña insegura~~");
                motivo=("Secuencia consecutiva de números ("+anterior3+", "+anterior2+", "+anterior1+")");
                break;
            }
            if (digito<0){
                System.out.println("Contraseña segura");
                System.out.println("("+anterior3+", "+anterior2+", "+anterior1+")");
                break;
            }
        }
        System.out.println(motivo);
    }
}
