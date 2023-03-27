import java.util.concurrent.ExecutionException;

public class reto6 {
    public static void main(String[] args) throws ExecutionException {
        System.out.println(" Craps. apuesta a un solo tiro de este juego se lanza dis dados , se gana si se obtiene un lanzamiento con:  ");
        System.out.println(" un par de unos en los dados  ");
        System.out.println(" un total de tres en los dados  ");
        System.out.println(" un total de once en los dados   ");
        System.out.println(" si se obtiene dos o doce en los dados   ");
        System.out.println(" un total de siete en los dados  ");

        int cubeOne, cubetwo ,cubeplus;

            cubeOne = (int)(Math.random()*6+1);
            cubetwo = (int)(Math.random()*6+1);
            cubeplus= cubeOne+cubetwo;

            if(cubeplus==2) {
                System.out.println ("gano, obtuvo un par de unos en los dados ");
            }
            else if(cubeplus==3){
                System.out.println ("gano , obtuvo un total de tres en los dados ");

            }
            else if(cubeplus==11){
                System.out.println ("gano , obtuvo un total de once en los dados ");

            }
            else if(cubeplus==12 || cubeplus==2){
                System.out.println ("gano , obtuvo un total de 12 o 2 en los dados ");

            }
            else if(cubeplus==7){
                System.out.println ("gano , obtuvo un total de siete en los dados ");

            }
            else{
                System.out.println ("perdio, no obtuvo ninguna condicion para ganar ");
            }


    }
}
