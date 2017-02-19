/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendiendo;

import java.util.Scanner;






/**
 *
 * @author Edgar Alarcon
 */
public class Aprendiendo {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, definitiva;
        System.out.println("Introdusca la Nota 1");
        n1 = entrada.nextDouble();
        System.out.println("Introdusca la Nota 2");
        n2 = entrada.nextDouble();
        System.out.println("Introdusca la Nota 3");
        n3 = entrada.nextDouble();
        definitiva = (n1*0.35) + (n2*0.35) + (n3*0.30);
        System.out.println("Nota 1: "+ n1);
        System.out.println("Nota 2: "+ n2);
        System.out.println("Nota 3: "+ n3);
        System.out.println("Nota Definitiva: "+ definitiva);
        // TODO code application logic here
    }
    
}
