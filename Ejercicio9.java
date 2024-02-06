/*Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá
mas la contraseña y mostrara un mensaje diciendo “Correcto!”. Piensa bien en la
condición de salida (3 intentos y si acierta sale, aunque le queden intentos, si no acierta
en los 3 intentos mostrar el mensaje “Fallaste jaja!!”).*/
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String [] args){
        String contraFijado="12345";
        String contraIngresado;
        int intento=0;
        Scanner entrada=new Scanner(System.in);
       do {
           System.out.println("Favor ingrese su contraseña: ");
           contraIngresado = entrada.nextLine();
           if(contraFijado.equals(contraIngresado)){
               System.out.println("Correcto");
               System.exit(0);
           }
           intento+=1;
       } while(intento<3);
        System.out.println("Fallaste jaja!!");
    }
}
