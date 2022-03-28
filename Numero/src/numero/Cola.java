/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero;

import java.util.ArrayList;

/**
 *
 * @author Ángel.García
 */
public class Cola {
    ArrayList Cola;
    
    public Cola(){
        Cola= new ArrayList();
        
    }
    public void nuevoCliente(Cliente a){
        Cola.add(a);
    }

    @Override
    public String toString() {
        return "Cola=" + Cola ;
    }
}
