
package boletin57;

import java.util.Scanner;


public class Menu {
    Scanner a = new Scanner(System.in);
    Scanner b = new Scanner(System.in);
    public void menu(){
        int eleccion;
        double resultado;
        
        System.out.println("menu");
        System.out.println("1. cadrado");
        System.out.println("2. triangulo");
        System.out.println("3. circulo");
        System.out.println("Teclee a opción que desexe");
        eleccion=a.nextInt();
        System.out.println("Por favor insertea o valor do ancho da figura");
        int anchura= b.nextInt();
        
        switch(eleccion){
            case 1:
                resultado=anchura*4;
                System.out.println("El perímetro es: "+resultado);
            break;
            
            case 2:
                System.out.println("Por favor insertea o valor da altura da figura");
                int altura=b.nextInt();
                System.out.println("Por favor insertea o valor da hipotenusa da figura");
                int hipotenusa=b.nextInt();
                resultado=anchura+altura+hipotenusa;
                System.out.println("El perímetro es: "+resultado);
            break;
            
            case 3:
                resultado=anchura*(Math.PI);
                System.out.println("El perímetro es: "+resultado);
            break;
               
            default:
                System.out.println("Opcion incorrecta");
            break;
        }
        
    }
    public static void main(String[] args) {
        Menu ar= new Menu();
        ar.menu();
        
    }
}
//Codifica un programa que, utilizando un menú de opcións, calcule a superficie de distintas figuras . 
//O usuario premerá a opción desexada .Según esta o programa pediralle os datos precisos e, 
//utilizando un switch…case visualizará o resultado .
//No caso de premer unha opción que non teña o menú, visualizar unha mensaxe de “ opción incorrecta “.
//1…. Cadrado
//2…. Triangulo
//3…. Circulo