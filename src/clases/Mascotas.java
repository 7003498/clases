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
public abstract class Mascotas {
    String raza;

    public Mascotas(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public abstract void mostrarMascota();

    @Override
    public String toString() {
        return "Mascotas{" + "raza=" + raza + '}';
    }
    
    
    
}
