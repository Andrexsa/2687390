 import java.util.Scanner;

public class reto8{
    
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner(System.in);
        int price,finalprecio=0 ,op , tikeck, sale=0,pay,change,participate;
        tikeck=(int)(Math.random()*10+1);
        

        do{  
        System.out.println(" INGRESA EL PRECIO DEL PRODUCTO ");
        price=lectura.nextInt();
        finalprecio = finalprecio + price;
        System.out.println(" desea agregar otro registro de precio (1)si, (2)no ");
        op = lectura.nextInt();

        if (op!=1){
            break;
        }
        }while (op == 1);

        if (finalprecio>=50000){
            participate = 1;
            switch(tikeck){
        


        case 1:
        sale = finalprecio-((finalprecio * 10) / 100 );
           
           System.out.println(" salio una bolita roja, su compra tiene un descuento de 10%. el valor total es de: $ "+sale);
        break;

        case 2:
        sale = finalprecio-((finalprecio * 30) /100 );
           
           System.out.println(" salio una bolita azul, su compra tiene un descuento de 30%. el valor total es de: $ "+sale);
        break;

        case 3:
        sale = finalprecio-((finalprecio * 30) /100 );
           
           System.out.println(" salio una bolita azul, su compra tiene un descuento de 30%. el valor total es de: $ "+sale);
        break;

        case 4:
        sale = finalprecio-((finalprecio * 30) /100 );
           
           System.out.println(" salio una bolita azul, su compra tiene un descuento de 30%. el valor total es de: $ "+sale);
        break;

        case 5:
        sale = finalprecio-((finalprecio * 50) /100 );
           
           System.out.println(" salio una bolita amarilla, su compra tiene un descuento de 50%. el valor total es de: $ "+sale);
        break;

        case 6:
        sale = finalprecio-((finalprecio * 50) /100 );
           
           System.out.println(" salio una bolita amarilla, su compra tiene un descuento de 50%. el valor total es de: $ "+sale);
        break;

        case 7:
        sale = finalprecio-((finalprecio * 50) /100 );
           
           System.out.println(" salio una bolita amarilla, su compra tiene un descuento de 50%. el valor total es de: $ "+sale);
        break;

        case 8:
        sale = finalprecio-((finalprecio * 50) /100 );
           
           System.out.println(" salio una bolita amarilla, su compra tiene un descuento de 50%. el valor total es de: $ "+sale);
        break;

        case 9:
        sale = finalprecio-((finalprecio * 50) /100 );
           
           System.out.println(" salio una bolita amarilla, su compra tiene un descuento de 50%. el valor total es de: $ "+sale);
        break;

        case 10:
           
           System.out.println(" salio una bolita blanca. felicidades, su compra es gratis ");
        break; 
            }
        }

        else{
            System.out.println(" el precio final de la compra no es suficiente para participar. deben ser $50.000 como minimo ");
        }

        participate = 2;
        System.out.println(" ingrese el valor con el que pagara  ");
        pay = lectura.nextInt();

        if(participate==1){
            change = pay - sale;
            System.out.println(" su cambio es de: "+ change);
        }
        else if(participate==2){
            change = pay - finalprecio;
            System.out.println(" su cambio es de: "+ change);
        
        }

        else {
            System.out.println(" gracias por su compra, vuelva pronto");
        }
        



lectura.close();

    }
} 

    

