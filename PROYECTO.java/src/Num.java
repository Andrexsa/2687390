import java.util.Scanner;

public class Num {
    public static void main(String[] args) throws Exception {
        int num1,num2,resultado;
        Scanner lectura=new Scanner(System.in);
        System.out.println(" INGRESA UN NUMERO ");
        num1=lectura.nextInt();
        System.out.println(" INGRESA EL SEGUNDO NUMERO ");
        num2=lectura.nextInt();
        if( num1>num2 ){
            resultado=num1+num2;
            System.out.println(" tu suma es :"+resultado);
        }
        else{
            resultado=num1-num2;
            System.out.println(" tu resta es : "+resultado);
        }
lectura.close() ;
    }
}