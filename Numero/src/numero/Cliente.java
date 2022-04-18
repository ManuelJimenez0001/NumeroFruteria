/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private String nombre;
    private int edad;
    Boolean atendido = true;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return   nombre +" "
                 + edad
                ;
    }

    
    
    
    
    
}
