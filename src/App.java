import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int age;
        Scanner lectura=new Scanner(System.in);
        System.out.println(" INGRESA LA EDAD ");
        age=lectura.nextInt();
        if( age>=18 ){
            System.out.println(" BIENVENIDO SIGA! ");
        }
        else{
            System.out.println(" PA LA CASA! ");
        }
lectura.close() ;
    }
}
