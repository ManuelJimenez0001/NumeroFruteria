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

    public Cola() {
        Cola = new ArrayList();

    }

    public void nuevoCliente(Cliente a) {
        Cola.add(a);
    }

    public void despacharCliente() {
        if (Cola.get(0) != null) {
            Cola.remove(0);
        }
    }

    public void adelantarCliente(Cliente a) {

        if (Cola.indexOf(a)!= 0 && Cola.contains(a)) {
            int aux=Cola.indexOf(a);
            Cola.remove(a);
            Cola.add(aux-1, a);
        }
    }
    public void atrasarCliente(Cliente a){
        if (Cola.indexOf(a)!= Cola.size()-1 && Cola.contains(a)) {
            int aux=Cola.indexOf(a);
            Cola.remove(a);
            Cola.add(aux+1, a);
        }
    }

    @Override
    public String toString() {
        return "" + Cola;
    }
}
