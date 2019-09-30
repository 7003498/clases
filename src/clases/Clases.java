/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Estudiante
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascotas dog = new perro("perro");
        Mascotas cat = new gato("gato");
        dog.mostrarMascota();
        cat.mostrarMascota();
        ArrayList<Mascotas> mascotitas = new ArrayList<>();
        mascotitas.add(new perro("perri"));
        mascotitas.add(new perro("loco"));
        mascotitas.add(new perro("solo"));
        mascotitas.add(new perro("peris"));
        mascotitas.add(new perro("perrixs"));
        
        mascotitas.forEach((n) -> System.out.println(n));
    }

    
}
