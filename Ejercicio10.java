import java.util.Scanner;

/*Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia
laboral o no (“De lunes a viernes consideramos dias laborales”).*/
public class Ejercicio10 {
    public static void  main(String[]args){
        Scanner entrada= new Scanner(System.in);
        String diaIngresado;
        System.out.println("Ingrese un dia de la semana, con la primera letra en mayuscula (Ejemplo: 'Lunes'): ");
       diaIngresado=entrada.nextLine();
       if(diaIngresado.equals("Lunes")){
           System.out.println("Es día laboral");
       }else if(diaIngresado.equals("Martes")){
           System.out.println("Es día laboral");
       }else if(diaIngresado.equals("Miercoles")){
           System.out.println("Es día laboral");
       }else if(diaIngresado.equals("Jueves")){
           System.out.println("Es día laboral");
       }else if(diaIngresado.equals("Viernes")){
           System.out.println("Es día laboral");
       }else if((diaIngresado.equals("Sabado")) ||(diaIngresado.equals("Domingo")) ){
           System.out.println("No es día laboral");
       }else{
           System.out.println("No ingresó correctamente el día de la semana");
       }
    }
}
