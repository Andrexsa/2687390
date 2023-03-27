import java.util.Scanner;

public class presupuesto {
    public static void main(String[] args) throws Exception {
        int spent,budget,totals,op,count;
        Scanner lectura=new Scanner(System.in);
op= 1;
spent= 0;
budget=100000;
totals= 0;
count = 0;
        while(op==1){ 
        System.out.println(" ingrese el gasto: ");
        spent= lectura.nextInt();
        budget=budget-spent;
        totals=totals+ spent ;
        count =count +1;

        switch(count){
            case 3:
            System.out.println(" ha llegado al limite de gastos que se pueden registrar. ");
            op = 2;

            break;

            default:
            if(spent>=100000){
                System.out.println(" ha llegado o superado el presupuesto disponible. ");
                op= 2;
            }

            else{
                System.out.println(" desea registrar otro gasto 1.si 2.no: ");
                op=lectura.nextInt();
            }
            break;
        }
    



      
        

        System.out.println(" sus gatos totales son de : $" +totals);
        System.out.println(" usted cuenta con un presupuesto de: $" +budget);

        }
        lectura.close();
    }
}