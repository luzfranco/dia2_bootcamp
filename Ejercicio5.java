import java.util.Scanner;

/*. Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es,
también debemos indicarlo.
*/
public class Ejercicio5 {
    public static void main(String []args){
        Scanner entrada= new Scanner(System.in);
        int nroIngresado;
        System.out.println("Ingrese un nro: ");
        nroIngresado=entrada.nextInt();
        if(nroIngresado%2==0){
            System.out.println("El nro "+nroIngresado+" es divisible entre 2");
        }else {
            System.out.println("El no"+nroIngresado+" no es divisible entre 2");
        }
    }
}
