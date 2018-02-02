
package boletin53;

import java.util.Scanner;

public class Boletin53 {
    Scanner fad= new Scanner(System.in);
    byte a;
    public void operacion(){
    a= fad.nextByte();
    if(a>0){
        System.out.println("+");
    }
    
    else {
        if(a<0){
            System.out.println("-");
        }
        else{
            System.out.println("0");
        }
        
     
    }
    
}
     public static void main(String[] args) {
         Boletin53 objeto= new Boletin53();
         objeto.operacion();
     }
    
    
}


//Teclear un número e sacar por consola o signo “ + “ se o nº é positivo,
//o signo “ –“ se é negativo e “ 0 “ se é cero .
