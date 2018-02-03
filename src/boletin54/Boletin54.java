
package boletin54;

import java.util.Scanner;

public class Boletin54 {
    Scanner a= new Scanner(System.in);
    int peso1,peso2;
    public void datos(){
        System.out.println("Insete os kilos da primeira persoa");
        int f=a.nextInt();
        System.out.println("Inserte os kilos da segunda persoa");
        int d=a.nextInt();
        if(f>d){
            System.out.println("a persoa que pesa máis é: "+f);
            System.out.println("a diferencia é: "+(f-d));
        }
        else{
            System.out.println("a persoa que peasa máis é: "+d);
            System.out.println("a digerencia é: "+(d-f));
        }
       
    }
    
}

//Coñecidos o nome e o peso de dúas persoas. 
//queremos escribir os datos da que pesa máis e, a diferenza de peso entre elas. 