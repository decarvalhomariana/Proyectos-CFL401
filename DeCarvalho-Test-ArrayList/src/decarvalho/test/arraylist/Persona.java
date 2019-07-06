package decarvalho.test.arraylist;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Programación
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private ArrayList <Mascotas> mascotas;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        mascotas = new ArrayList();
        
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }

    public int agregarMascota(Mascotas mascota){
        mascotas.add(mascota);
        return mascotas.size();   
    }
       
    public int cuantasMascotasTenes (){
        
        return
    }

    }
    
    
    
    
    
       

