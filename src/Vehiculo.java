
public class Vehiculo {

    /* 
    atributos:
    - marca
    - velocidad
    - encendido
    metodos:
    - encender
    - apagar
    - acelerar
    - frenar
    - mostrar estado
     */
    static String marca = "Mazda";
    static int velocidad = 15;
    static boolean encendido = false;

    static void encender() {
        if (encendido && velocidad > 0) {
            System.out.println("Encendido");
        } else {
            System.out.println("Apagado");
        }
    }

    static void apagar() {
        if (!encendido) {
            System.out.println("El vehículo ya esta apagado");
        } else if (velocidad > 0) {
            System.out.println("Vehículo en movimiento");
        } else if (velocidad < 0) {
            System.out.println("Valor inválido");
        } else {
            System.out.println("Vehículo apagado correctamente");
        }
    }

    static void acelerar() {
        if (encendido && velocidad > 0) {
            velocidad = velocidad + 10;
        } else {
            velocidad = 0;
        }
        System.out.println("Velocidad: " + velocidad + " kh/h");
    }

    public static void main(String[] args) {
        encender();
        apagar();
        acelerar();
    }
}
