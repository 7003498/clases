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
public class perro extends Mascotas{

    public perro(String raza) {
        super(raza);
    }

    
    public void mostrarMascota() {
        System.out.println("Soy un perro");
    }

    @Override
    public String toString() {
        return "soy un perrro de raza " + getRaza() ;
    }

    
    
    
}
