package ejercicios_logica;

import java.util.Scanner;

public class Ejercicio4 {

    static Scanner teclado = new Scanner(System.in);
    static int saldo = 0;
    static int opcionAnterior = 0;
    static int opcionMenu = 0;
    static String menu = ("\n-----Menú Principal-----\n1. Viaje Autobús\n2. Viaje Metro\n3. Viaje Transbordo\n4. Recargar Saldo\n0. Salir");
    static String opcionValida = "-----Opción Inválida-----\nSeleccione una opción del menú";
    static String tipoViaje = "";
    static boolean bloqueo = false;

    public static void main(String[] args) {
        System.out.println("-----Iniciando sistema-----\nDigite su saldo:");
        saldo = teclado.nextInt();
        while (true) {
            System.out.println(menu + "\n~~Saldo actual: $" + saldo + "~~");
            opcionMenu = teclado.nextInt();
            if (opcionMenu >= 0 && opcionMenu < 5) {
                if (opcionMenu == 1 && !bloqueo) {
                    tipoViaje = "Autobús";
                    saldo -= 2500;
                    System.out.println("\nViaje elegido: " + tipoViaje + "\nSaldo restante: $" + saldo);
                } else if (opcionMenu == 2 && !bloqueo) {
                    tipoViaje = "Metro";
                    if (opcionAnterior == 2) {
                        System.out.println("\nTienes un descuento ya que hiciste 2 viajes en Metro consecutivos");
                        saldo -= 1600;
                    } else {
                        saldo -= 3200;
                    }
                    System.out.println("\nViaje elegido: " + tipoViaje + "\nSaldo restante: $" + saldo);
                } else if (opcionMenu == 3 && !bloqueo) {
                    tipoViaje = "Transbordo";
                    saldo -= 1000;
                    System.out.println("\nViaje elegido: " + tipoViaje + "\nSaldo restante: $" + saldo);
                } else if (opcionMenu == 4) {
                    System.out.println("\nSaldo actual: $" + saldo);
                    System.out.println("Digite el valor que quiere agregar al saldo: ");
                    saldo += teclado.nextInt();
                    System.out.println("Nuevo saldo: $" + saldo);
                    bloqueo = false;
                } else if (opcionMenu == 0) {
                    System.out.println("¡Gracias por preferirnos!");
                    break;
                }
                if (saldo < 0 && saldo > -4000) {
                    System.out.println("\n¡Precaución! Saldo negativo, tiene un limite de $-4000, recargue la tarjeta o no podrá realizar mas viajes");
                } else if (saldo < -4000) {
                    System.out.println("\n~~Sistema bloqueado~~\nSaldo insuficiente, por favor recarga la tarjeta");
                    bloqueo = true;
                }
            } else {
                System.out.println(opcionValida);
                continue;
            }
            opcionAnterior = opcionMenu;
        }
    }
}
