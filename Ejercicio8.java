import java.util.Scanner;

/*Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si
no lo es lo volverá a pedir (do while), después muestra ese número por consola.
*/
public class Ejercicio8 {
    public static void main(String []args){
        int nroIngresado;
        Scanner entrada = new Scanner(System.in);
       do{
           System.out.println("Favor ingrese un nro mayor a 0: ");
           nroIngresado=entrada.nextInt();
       }while(nroIngresado<0);
        System.out.println("El número que Usted ingresó es: "+nroIngresado);
    }
}
