/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elvele.archivos.crear;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author Elvele
 */
public class CrearTxt {
public static void main(String []args)
{

//Un texto cualquiera guardado en una variable
String nombres,apellidos ;
nombres=JOptionPane.showInputDialog("Introduce El Nombre Completo: ");
apellidos=JOptionPane.showInputDialog("Introduce el apellido: ");

try
{
//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
File archivo;
    archivo = new File("C:\\Users\\Elvele\\Documents\\archivoGenerado101.txt");

//Escribimos en el archivo con el metodo write
    try 
(//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
  FileWriter escribir = new FileWriter(archivo,true)) {
//Escribimos en el archivo con el metodo write 
escribir.write(nombres+"\r\n");

escribir.write(apellidos);
//Cerramos la conexion
    }
}

//Si existe un problema al escribir cae aqui
catch(IOException e)
{
System.out.println("Error al escribir");
}
}
}
