package ejerciciosPracticos;

public class Ejercicio2 {
    static int S3=0;
    static int S5=0;
    static int SAmbos=0;
    public static void main(String[] args) {
        for(int i=1; i<=50; i++){
            if(i%3==0 && i%5==0){
                SAmbos+=1;
            }else if(i%3==0 && !(i%5==0)){
                S3+=1;
            }else if(i%5==0 && !(i%3==0)){
                S5+=1;
            }
        }
        System.out.println("Cantidad de numeros divisibles por 3 = "+S3);
        System.out.println("Cantidad de numeros divisibles por 5 = "+S5);
        System.out.println("Cantidad de numeros divisibles por 3 y por 5 = "+SAmbos);
    }
}
