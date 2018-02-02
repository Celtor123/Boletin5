
package boletin52;

import java.util.Scanner;


public class Boletin52 {
    Scanner e= new Scanner(System.in);
    short a,b;
    public void calculo(){
        System.out.println("Poña o primeiro numero");
        a=e.nextShort();
        System.out.println("Poña o segundo numero");
        b=e.nextShort();
    System.out.println(a+b);
        
    if(a>=b){
    System.out.println(a-b);
}
    }
     public static void main(String[] args) {
         Boletin52 r= new Boletin52();
         r.calculo();
     }
    
}
//Implementa un programa no que se tecleen dous números de tipo short . 
//Se o primeiro é maior ou igual que o segundo,visualizaremos a resta .
//En calquera caso visualizaremos a suma .
