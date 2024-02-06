import java.util.Scanner;

/*Lee un número por teclado que pida el precio de un producto (puede tener
decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del
10%.*/
public class Ejercicio6 {
    public static void main(String []args){
        Scanner entrada= new Scanner(System.in);
        double precio,precioIva;
        final double IVA=10;
        System.out.println("Ingrese el precio que tiene el producto:");
        precio=entrada.nextDouble();
        precioIva=precio+((precio/IVA)*100);
        System.out.println("Total con IVA incluido: "+precioIva);
    }
}
