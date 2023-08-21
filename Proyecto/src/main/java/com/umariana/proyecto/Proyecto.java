/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.umariana.proyecto;

import java.util.ArrayList;
import java.util.Scanner;
import mundo.Alumno;

/**
 *
 * @author Sistemas
 */
public class Proyecto {

    public static void main(String[] args) {
        
        // funcion que permite leer la opcion del usuario
        Scanner lector = new Scanner(System.in);
        
        //bandera que permite terminar el programa
        boolean activo= true;
         ArrayList<Alumno> misAlumnos = new ArrayList<Alumno>();
        do{
        System.out.println("---------- menu de opciones---------");
        System.out.println("1. Insertar alumno");
         System.out.println("2. Eliminar  alumno");
         System.out.println("3. Modificar alumno");
         System.out.println("4. Consultar  alumno");
         System.out.println("5. Terminr programa");
         System.out.println(".-----------------------");
         
         int opcion = lector.nextInt();
         if(opcion ==1){
             System.out.println("Introduce la cedula del alumno");
             int Cedula = lector.nextInt();
              System.out.println("Introduce el nombre del alumno");
             String Nombre = lector.next();
             System.out.println("Introduce el Apellido del alumno");
             String Apellido = lector.next();
             System.out.println("Introduce el Semetre del alumno");
             int Semestre = lector.nextInt();
             System.out.println("Introduce el Correo del alumno");
             String Correo = lector.next();
             System.out.println("Introduce el Numero de celular del alumno");
             int Celular = lector.nextInt();
             
             // se crea un objeto para guardar la informacion de cada alumno
             Alumno a = new Alumno();
             a.setCedula(Cedula);
             a.setNombre(Nombre);
             a.setApellido(Apellido);
             a.setSemestre(Semestre);
             a.setCorreo(Correo);
             a.setCelular(Celular);
             
             //se agrega el valor del objetp a ListArray
             misAlumnos.add(a);
             
         }else if(opcion==2){
             System.out.println("Opcion dos");
         }else if(opcion == 3){
             System.out.println("Opcion tres");
         }else if (opcion ==4){
             System.out.println("Opcion cuatro");
         }else if (opcion ==5){
             System.out.println("Opcion cinco");
         }else{
             System.out.println("Debe seleccionar una de las opciones del menu");
         }
         
        }while(activo);
    }
}
