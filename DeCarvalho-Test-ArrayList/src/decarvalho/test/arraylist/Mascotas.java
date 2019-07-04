package decarvalho.test.arraylist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Programación
 */
public class Mascotas {
    
    public String nombre;
    public int edad;
    public int patas;
    
    
    //Constructor 
    public Mascotas(String nombre, int edad, int patas) {
        this.nombre = nombre;
        this.edad = edad;
        this.patas = patas;
    }

    /**
     *
     * El metodo getNombre es para conseguir el nombre del objeto.  
     * @return retorna el nombre
     * @param nombre 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
}
