/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Estudiante
 */
public class gato extends Mascotas{

    public gato(String raza) {
        super(raza);
    }
    
    public void mostrarMascota() {
        System.out.println("Soy un gato miu");
    }

    @Override
    public String toString() {
        return "soy un gato de raza " + getRaza() ;
    }
    
    
}
