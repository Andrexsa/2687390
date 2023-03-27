import java.util.Scanner;
public class reto9 {
    public static void main(String[] args) throws Exception {
        int stamp,dato,repetir,apuesta,acumulador,valg,contador;
                Scanner lectura = new Scanner(System.in);
                acumulador=0; contador=0;
         System.out.println("el valor global es de 2000 agregue un valor mayor de el valor global ");
        do{
            System.out.println("ingrese el valor de su apuesta");
            apuesta=lectura.nextInt();
            stamp=(int)(Math.random()*2+1);
            System.out.println("elija cara o sello, donde 2 es cara y 1 es sello");
         dato=lectura.nextInt();
        
        if (stamp==dato) {
            System.out.println("ganó" );
            acumulador=acumulador+apuesta;
            valg=2000+apuesta;
        }

        else
        {
            System.out.println( "perdio");
             valg=2000-apuesta;
        }
            System.out.println("desea repetir el juego 1 es si 2 es no");
           repetir=lectura.nextInt();
         contador=contador+1;
        }while(repetir==1);
         System.out.println("la cantidad de veces que usted jugo son de "+contador);
         System.out.println(" el dinero que acumulo es de "+acumulador);
         lectura.close();
         }
         
        }