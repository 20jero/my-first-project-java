public class CiclosConBreak {
//revisar archivos y salir del ciclo una vez se encuentre el archivo maliciosos
    public static void main(String[] args) {
        System.out.println("-------Iniciando escaneo de seguridad-------");
        for(int archivo =1; archivo<=10; archivo++){
            if (archivo==4){
                System.out.println("Alerta\nEl archivo #"+archivo+" esta corrupto");
                break;
            }
            System.out.println("Archivo #"+archivo+" analizado");
        }
        System.out.println("-------Escaneo finalizado-------");
    }
}
