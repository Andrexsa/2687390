import java.util.Scanner;
public class reto5 {
    public static void main(String[] args) throws Exception {
        Scanner lectura= new Scanner (System.in) ;
        String nombre, apellido ;
        

        System.out.println(" ingrese su nombre  ");
        nombre=lectura.nextLine();
        System.out.println(" ingrese su apellido ");
        apellido=lectura.nextLine();

        int nombreLength= nombre.length();
        int apellidoLength= apellido.length();

        String sSubname =nombre.substring(0,2);
        System.out.println("su nombre contiene:"+nombreLength+ "carecteres. mientras que su apellido contiene: "+apellidoLength+"caracteres");
        System.out.println("su correo de diereccion sera el siguiente :"+sSubname.toLowerCase()+ apellido.toLowerCase() + "@gmail.com");
        lectura.close();
    }
}


