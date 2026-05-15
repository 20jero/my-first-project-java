public class CiclosConContinue {
    public static void main(String[] args) {
        System.out.println("-------Envio material clase-------");
        for(int estudiante=1;estudiante<=16;estudiante++){
            System.out.println("Estudiante #"+estudiante);
            if (estudiante==11){
                System.out.println("Estudiante perdió por inasistencia");
                continue;
            }
            System.out.println("Enviando material...");
        }
        System.out.println("Envio finalizado");
    }
}
