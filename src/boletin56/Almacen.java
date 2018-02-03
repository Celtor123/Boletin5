
package boletin56;

import java.util.Scanner;


public class Almacen {
    Scanner a = new Scanner(System.in);
    short productos;
    public void vendas(){
        System.out.println("Por favor inserte cantos productos do artigo se vendeu o ano dado: ");
        productos=a.nextShort();
        if (productos<=100){
            System.out.println("Este producto é de tipo baixo");
        }
        else if (productos<=500){ 
            System.out.println("Este producto é de tipo medio");
        }
        else if (productos<=1000){
            System.out.println("Este producto é de tipo alto");            
        }
        else if (productos>1000){
            System.out.println("Este producto é de primeira necesidade");            
        }
    }
    
    public static void main(String[] args) {
        Almacen qwe= new Almacen();
        qwe.vendas();
                
    }
        
}

//Un almacen clasifica os seus productos según a seguinte táboa  de vendas anuais :
//Vendas anuais			artigo de consumo 
//< = 100 productos				baixo
// >100 e < = 500				medio
//> 500 e < = 100 				alto
//> 1000 					primeira necesidade
//    Coñecido o nome do artigo e as vendas anuais . Indicar de que tipo é