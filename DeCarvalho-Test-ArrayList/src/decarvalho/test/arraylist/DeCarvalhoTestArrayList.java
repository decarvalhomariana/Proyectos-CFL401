/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decarvalho.test.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
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
        
    /*Scanner entrada = new Scanner(System.in);
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

    ArrayList <Mascotas> animales = new ArrayList();
    Mascotas perro1 = new Mascotas("Tory", 22, 4);
    animales.add(perro1);
    Mascotas gato1 = new Mascotas ("Mishi", 10, 3);
    Mascotas loro1 = new Mascotas ("Poli", 2, 25);
    animales.add(gato1);
    animales.add(loro1);
    //para no tener que estar agregando variables.
    animales.add(new Mascotas("Tory", 22, 4));
    animales.add(new Mascotas("Mishi", 10, 3));
    animales.add(new Mascotas("Poli", 2, 25));
    
    
    Scanner entrada = new Scanner (System.in);
    String nombre;
    int edad, patas;
    
    System.out.print("Ingrese el nombre de la mascota y si quiere salir escriba la palabra Salir: ");
    nombre = entrada.nextLine();
    //while (!nombre.equals("Salir")||!nombre.equals("SALIR")||!nombre.equals("salir")){
    //PARA TRANSFORMAR LO QUE INGRESA EL USUARIO PONE TODO EN MAYUSCULA O MINUSCULA
    while (!nombre.toUpperCase().equals("salir".toUpperCase())){  
    System.out.print("Ingrese la edad de la mascota: ");
    edad = entrada.nextInt();
    System.out.print("Ingrese la cantidad de patas que posee su mascota: ");
    patas = entrada.nextInt();
    
    animales.add(new Mascotas(nombre, edad, patas));
    entrada.nextLine();//Se puso solo porque hay un error en el buffer.
    System.out.print("Ingrese el nombre de la mascota y si quiere salir escriba la palabra Salir: ");
    nombre = entrada.nextLine();
    
    }
    
    //System.out.println(animales);
    //Para recorrer las listas, existe el iterador o iterator, Toma el control de la lista, 
    //Me dice si tengo un elemento para mostrar o no, te muestra en que posición, y si hay otros
    //elementos mas adelante(osea el último)
    //it es de iterador
    Iterator it = animales.iterator();
    //it.hasNext();//Se le pregunta al iterador si hay un próximo elemento, devuelve un true o un false.
    //it.next();//Sirve para obtener el próximo elemento.
    //primero se le pregunta si hay un proximo elemento y despues obtenemos el elementro, primero
    //se usa el hasNext y despues next.
    //Para recorrer listas se usa el while.
    
    while(it.hasNext()){
        Mascotas mascota = (Mascotas) it.next();//creamos una variable provisoria para que guarde los datos de la clase
        //System.out.println(((Mascotas) it.next()).getNombre());
        System.out.println("El nombre de su mascota es "+ mascota.getNombre() + " la edad " + mascota.getEdad() + " y la cantidad de patas que tiene son "+ mascota.getPatas()+ ".");
    }
    
   
    
    
    
    
    
    }
    
}
