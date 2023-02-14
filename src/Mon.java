import java.util.Scanner;

public class Mon {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int cara,sello;
        cara = (int)( Math.random()*2+1);
        System.out.println(" elija un numero que corresponde a (1)cara , o el (2) sello. ");
        sello=lectura.nextInt();
        
        if( cara==sello ){
           
            System.out.println(" gano :");
        }
        
        else{
            
            System.out.println(" perdio : ");
        }
lectura.close() ;
    }
}
