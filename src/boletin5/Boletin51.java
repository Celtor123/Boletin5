
package boletin5;

import java.util.Scanner;


public class Boletin51 {
    Scanner e = new Scanner(System.in);
    public void positivo(){
    int num;
    System.out.println("Poña o número correspondente ");
    num= e.nextInt();
if(num>=0){
    System.out.println("é positivo");
}

    }
    
    public static void main(String[] args) {
        Boletin51 a= new Boletin51();
        a.positivo();
        
    }
    
}
//Codifica un programa que saque, por consola,
//un número tecleado, sempre que sexa positivo,xunto coa mensaxe “ e positivo “ .