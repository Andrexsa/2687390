import java.util.Scanner;

public class Det {
    public static void main(String[] args) throws Exception {
        int num1;
        Scanner lectura=new Scanner(System.in);
        System.out.println(" INGRESA UN NUMERO ");
        num1=lectura.nextInt();
        
        if( num1>0 ){
           
            System.out.println(" tu numero es positivo :");
        }
        else if( num1==0){
            
            System.out.println(" tu numero es neutro : ");
        }
        else{
            
            System.out.println(" tu numero es negativo : ");
        }
lectura.close() ;
    }
}