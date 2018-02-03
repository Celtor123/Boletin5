
package Boletin55;


public class Numeros {
  
    public void numeros(int a,int b,int c){
          int e = 0;
        if(a>b){
            if(b>c){
                e=a;
            }
            else{
                if(a>c){
                   e=a;
                }
                else{
                    e=c;
                }
                
            }
        }
        else{
            if(b>c){
            e=b;
            }
        }
     System.out.println("o numero máis alto é: "+e);
}
       
       
   
public static void main(String[] args) {
Numeros a= new Numeros();
a.numeros(2, 1, 3);
}
}
//Dados 3 números que se supon distintos , indicar cal é o maior
