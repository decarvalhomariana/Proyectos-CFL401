/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decarvalho.test.arraylist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Programación
 */
public class DeCarvalhoTestArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {/*
        
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
    //Conviene usar el nextLine y agregar adelante el valueOf o el parseInt.
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
        System.out.println("El nombre de su mascota es "+ mascota.getNombre()+ " la edad " + mascota.getEdad() + " y la cantidad de patas que tiene son "+ mascota.getPatas()+ ".");
    }
    
    //Creacion de objetos.
    Persona per1 = new Persona("José Luís", 45);
    Persona per2 = new Persona ("Marta", 53);
    
    Mascotas perro = new Mascotas ("Boby", 7, 4);
    Mascotas gato = new Mascotas ("Sultán", 2, 4);
    Mascotas loro = new Mascotas ("Pepe", 10, 2);
    
    per1.agregarMascota(perro);
    per2.agregarMascota(gato);
    per1.agregarMascota(loro);
    
    //Forma resumida.
    gato.setEdad(gato.getEdad()+1);
    //Forma extendida.
    //int edad = gato.getEdad();
    //edad++; //edad = edad+1; //edad+=1;
    //gato.setEdad(edad);
    System.out.println("El gato " + gato.getNombre()+ " cumplió " + gato.getEdad() + " años.");
    
    System.out.println(per2.cuantasMascotasTenes());
    System.out.println(per1.cuantasMascotasTenes());
*/
    
    //FileWriter, es la clase que me permite comunicarme con un ARCHIVO
    //FileWriter file(nombre variable) = new FileWriter(ruta al archivo, si se sobre escrive o no)
    
    FileWriter file = new FileWriter ("texto.txt", false); //el false hace que se sobre escriba, el true hace que se sigan creando archivos. Si no esta el archivo lo genera.
    PrintWriter escritor = new PrintWriter (file);//Manejador. Maneja las interaccionas. poniendo el punto se accede a las acciones que se pueden hacer.
    escritor.println("¿Cómo estás?");
    escritor.print("Edad: ");
    //escritor.print(JOptionPane.showInputDialog(null, "Escribi algo"));//lo que escriba el usuario queda guardado en el archivo.
    
    //antes del close se hace un flush, las partes que quedan en el buffer que corresponder al arcivos las manda al archivo.
    escritor.flush();
    escritor.close();// así se cierra el archivo.
   
    //para leer el archivo. Generamos el link al archivo.
    FileReader fileR = new FileReader ("texto.txt");
    BufferedReader lector = new BufferedReader (fileR);//el que me permite utilizar el link.
    
    //Para leer entradas de texto
    String textoEntrada = lector.readLine();//lee por líneas. Guarda en la variable textoEntrada lo que lee.
    //Cuando quiera leer algo y no hay nada va a llenar la variable con el valor null.
    
    while (textoEntrada != null){
        System.out.println(textoEntrada);
        textoEntrada = lector.readLine();//para que lea la siguiente línea, sino va a seguir leyendo la primer linea del archivo infinitamente.
        
    }
    
    lector.close();
    
    
    FileWriter conver = new FileWriter ("Conver.txt", true);
    PrintWriter escritor2 = new PrintWriter (conver);
    escritor2.println("Tomás: Hola");
    escritor2.println("Franco: Hola");
    escritor2.println("Franco: Todo bien?");
    escritor2.println("Tomás: Me confundí");
    escritor2.println("Tomás: Chau");
    
    escritor2.flush();
    escritor2.close();
    
    FileReader fileRR = new FileReader ("conver.txt");
    BufferedReader lector2 = new BufferedReader (fileRR);
    textoEntrada = lector2.readLine();
    //Para separar cosas en Java tenemos el split.
    
    while (textoEntrada != null){
    String[] tP = textoEntrada.split(":");//Transformamos la primer fila de la conversacion en un array para poder separar
    System.out.println(tP [0]);
    System.out.println(tP [1]+ "\n");
    //System.out.println("");
    //System.out.println("\n" + tP[0] + "\n" + tP[1] );
    textoEntrada = lector2.readLine();
    
    
    //La documentación java generalmente se hace antes de cada método
    /**Imprime el documento en la impresora seleccionada y necesita
     * por paramétro un documento. (@param documento)
     * @param documento
     * @param nombreVariable si hay más parámetro en el metódo.
     * @return valor de si imprimió o no
     */
    
    //alt+shift+f acomoda el codigo.
    
    
    
    
    
    }
    
    
    
    
    }
    
}







