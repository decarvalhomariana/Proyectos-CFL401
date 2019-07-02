/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decarvalho.test.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Programación
 */
public class DeCarvalhoTestArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    ArrayList elem = new ArrayList();
    int numero;
    boolean bandera = true;
    
    elem.add("Perro");
    elem.add(4);
    elem.add(7);
    
    System.out.println(elem);
    
    ArrayList <Integer> elem2 = new ArrayList();
    
    //MI opción
    while (bandera){
    System.out.print("Ingrese un número: ");
    numero = entrada.nextInt();
    try{
        numero = entrada.nextInt();
    }catch (Exception e){
        System.out.println("Error");
    }
        if (numero>=0){
            elem2.add(numero);
        }else{ 
            bandera = false; 
            System.out.println(elem2);
    }
    }
     
    /*Segunda opción
    numero = entrada.nextInt();
    while (numero>=0){
        elem2.add(numero);
        numero = entrada.nextInt();
    }
    System.out.println(elem2);
    */

    ArrayList animales = new ArrayList();
    
    
    
    }
    
}
