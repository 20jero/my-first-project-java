

public class App {
    static String nombre_estudiante = "Jerónimo";
    static int edad = 16;
    static float peso = 79.5f;
    static boolean estudiante_activo=false;
    static String texto_estudiante_activo = "";
    public static void main(String[] args) {
        if(estudiante_activo){
            texto_estudiante_activo="Estudiante activo";
        }else{
            texto_estudiante_activo="Estudiante no activo";
        }
        System.out.println(texto_estudiante_activo+"\n\n"+"Mi nombre es: "+nombre_estudiante+"\n"+"Mi edad es: "+edad+"\n"+"Peso: "+peso);
    }
}
