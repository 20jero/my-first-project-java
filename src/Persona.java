public class Persona {
    static String nombre_persona = "Jerónimo";
    static String apellidos_persona = "Cardona González";
    static int edad = 17;
    static char genero = 'M';
    static float promedio_semestre=0f;
    static boolean vive_manizales=true;

    static void imprimirNombre(){
         System.out.println("Informacion del estudiante:\nNombre completo: " + nombre_persona + " " + apellidos_persona);
    }
    static void imprimirEdad(){
        System.out.println("Edad: "+ edad);
    }
    static void imprimirPromedio(){
        System.out.println("Promedio del semestre: "+promedio_semestre);    
    }
    static void imprimirCiudad(){
        if (vive_manizales){
            System.out.println("Vive en Manizales");
        }else{
            System.out.println("No vive en Manizales");
        }
    }
    static void imprimirGenero(){
        if(genero=='M'){
            System.out.println("Hombre");
        }else if(genero=='F'){
            System.out.println("Mujer");
        }else{
            System.out.println("Género no definido");
        }
    }
    public static void main(String[] args) {
        imprimirNombre();
        imprimirEdad();
        imprimirPromedio();
        imprimirCiudad();
        imprimirGenero();
    }
}
