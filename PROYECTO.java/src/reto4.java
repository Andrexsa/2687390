import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) throws Exception {
        Scanner lectura= new Scanner (System.in) ;
        int rolSistem, rolPlayer;
        rolSistem =(int)(Math.random()*3+1);

        System.out.println(" elija una opcion: (1)piedra, (2)papel, o (3)tijeras ");
        rolPlayer=lectura.nextInt();
//empate
        if(rolSistem==rolPlayer) {
            System.out.println(" empate. el sitema elijio la misma opcion ");
//perdedor
        }
        else if (rolSistem==3 && rolPlayer==2){
            System.out.println("perdio el sistema elijio 'tijeras' ");
        }
        else if (rolSistem==2 && rolPlayer==1){
            System.out.println(" perdio el sistema elijio 'papel' ");
        }
        else if (rolSistem==1 && rolPlayer==3){
            System.out.println(" perdio el sistema elijio 'piedra' ");
        }
//ganador
        else if (rolSistem==1 && rolPlayer==2){
        System.out.println(" gano el sistema elijio 'piedra' ");
        }
        else if (rolSistem==2 && rolPlayer==3){
        System.out.println(" gano sistema elijio 'papel' ");
        }
        else if (rolSistem==3 && rolPlayer==1){
         System.out.println(" gano el sistema elijio 'tijeras' ");
        }

        else{
                    System.out.println("algo salio mal.seguramente escribio una opcion no valida"); 
                }

    lectura.close();
}
 }