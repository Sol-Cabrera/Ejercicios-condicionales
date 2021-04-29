/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividaddesarrollo5;
import java.util.Scanner;
/**
 *
 * @author pc13
 */
public class ActividadDesarrollo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero y le mostrará los múltiplos de 5 de dicho numero");
        int num=teclado.nextInt();
        int a=0;
        do {
            if(a%5==0)
            System.out.println(a);
            a++;}
        while(a<=num);
   
    }
    
}
