/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba_19_de_febrero;

import java.util.Scanner;

/**
 *
 * @author Elvele
 */
public class Vele {
    public static void main(String[] args) {
    // declaramos las variables
    
        float area_triangulo ;
        double base;
        double altura;
        
      Scanner inputNumScanner = new Scanner(System.in);
       
       //ingresamos la base
       System.out.println("Ingrese La base ");       
        base = inputNumScanner.nextDouble();
       //ingresamos la altura
       System.out.println("Ingrese La altura ");
       altura = inputNumScanner.nextDouble();
        //se calculan el area del triangulo
        area_triangulo = (float)(base*altura)/2;
       //imprimimos los datos digitados
        System.out.println("Base = " +base);
        System.out.println("Altura= " +altura);
       //imprimimos el resultado 
        System.out.println("Area Del Triangulo " + area_triangulo);
    }
}

