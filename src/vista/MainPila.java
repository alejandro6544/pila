/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import modelo.OperacionesPila;
import modelo.Pila;

/**
 *
 * @author pc
 */
public class MainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila<Productos> pilaP=new Pila<>();
        pilaP.apilar(new Productos("arroz", 2, 5000));
        pilaP.apilar(new Productos("Panalhuevos", 1, 14000));
        pilaP.apilar(new Productos("carne", 2, 15000));
        pilaP.apilar(new Productos("panela", 2, 8000));
        
        
        System.out.println("Pila Original\n"+pilaP.toString());
        
//        pilaP.desapilar();
//        System.out.println("Pila \n"+pilaP.toString());
        
        Pila<Productos> pd=OperacionesPila.pilaDuplicada(pilaP);
           System.out.println("Pila Duplicada\n"+ pd.toString());     
        
    }
    
}
