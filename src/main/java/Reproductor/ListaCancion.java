/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reproductor;

import java.util.Scanner;

/**
 *
 * @author edyfa
 */
public class ListaCancion {
    public Cancion primero;
    
    public ListaCancion(){
        primero = null;
    }
    
    private int leerCancion(){
        System.out.println("Ingrese el nomnre de la cancion ");
        return leerCancion;
    }
    public ListaCancion crearLista(){
        String x ="";
        primero=null;
        do{
            x=leerCancion();
            if (x!= -1){
                primero= new Cancion(x, primero);
                
            }
        }
            while(x!= -1);
              return this;  
            
        }
}
