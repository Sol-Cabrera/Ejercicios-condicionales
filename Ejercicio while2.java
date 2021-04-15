/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol4;
import java.util.Scanner;
/**
 *
 * @author pc13
 */
public class Sol4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero maximo");
        int a=teclado.nextInt();
        int i=1;
        while(i<=a) {
            System.out.println(i);
            i++;
        }
    
    
    }
    
}
