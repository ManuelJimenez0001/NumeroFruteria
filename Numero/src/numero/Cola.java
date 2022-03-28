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
    
    public void despacharCliente(){
        Cola.remove(0);
    }
    @Override
    public String toString() {
        return "Cola=" + Cola ;
    }
    
    public static void main(String[] args) {
        Cliente a= new Cliente("Juan luis",24);
        Cliente b= new Cliente("MARISA",56);
        Cola cola= new Cola();
        cola.nuevoCliente(a);
        cola.nuevoCliente(b);
        System.out.println(cola);
        cola.despacharCliente();
        System.out.println(cola);
        cola.despacharCliente();
        System.out.println(cola);
    
    }
}
