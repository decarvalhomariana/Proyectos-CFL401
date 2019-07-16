/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decarvalho.pkg20190712.testarchivos;

/**
 *
 * @author Programación
 */
public class Testeo {
    
    private static String apellido;//El tatic comparte la información con todos los objetos creados de la clase.
    private String edad;

    public static void setApellido (String a){   
        apellido = a; // si las dos variables se llaman iguales, se usa el this para distinguir la variable de arriba con la del metodo.
    }
    
    public static String getApellido (){//El static en los metodos hace que no sea necesario crear un objeto. Se pregunta y se le asignan cosas directamente a la clase. siempre y cuando sea publico y static
        return apellido;   
        
    }
    
    
    
    
    
}
