/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ángel.García
 */
public class Cola {

    ArrayList<Cliente> Cola;
    ArrayList<Cliente> atendidos;

    public Cola() {
        Cola = new ArrayList<Cliente>();
        atendidos = new ArrayList<Cliente>();
    }

    //se genera un cliente en la lisa de los no atendidos, si la persona es mayor de 65 año ocupara la primera posicion automaticamente
    public void nuevoCliente(Cliente a) {

        if (a.getEdad() >= 65) {
            Cola.add(0, a);
        } else {
            Cola.add(a);
        }
    }

    //elimina el cliente de la lista de clientes no atendidos y lo mete en la lista de los clientes atendidos
    public void despacharCliente() {
        if (!Cola.isEmpty()) {
            atendidos.add(Cola.get(0));
            Cola.remove(0);
        }
    }

    //le pasa un cliente por argumento y lo mueve una posicion hacia delante en la cola
    public void adelantarCliente(int a) {

        if (a < Cola.size() && a > 0) {
            Cliente aux = Cola.get(a);
            Cola.remove(a);
            Cola.add(a - 1, aux);
        }
    }

    //le pasa un cliente por argumento y lo mueve una posicion atras en la cola
    public void atrasarCliente(int a) {
        if (a+1 >= Cola.size()) {
            
        }else if(a>=0&&a<Cola.size()){
            Cliente aux = Cola.get(a);
            Cola.remove(a);
            Cola.add(a + 1, aux);
        }
    }

    //le pasa una posicion por argumento y si esta en la cola ese cliente se va de la cola
    public void abandonar(int a) {
        if (a < Cola.size() && a >= 0) {
            Cola.remove(a);
            System.out.println("Cliente eliminado");
        } else {
            System.out.println("No existe esa posicion en la cola");
        }
    }

    //siguienteCliente() cambia la primera posicion por la segunda 
    public void siguienteCliente() {
        if (Cola.size() >= 2) {
            Cliente a = Cola.get(0);
            Cola.remove(0);
            Cola.add(1, a);
        }
    }
    //Muestra la cola de los clientes que ya han sido atendidos

    public ArrayList<Cliente> MostrarNoAtendidos() {
        return Cola;
    }

    //Muestra la cola de los clientes que no han sido atendidos
    public ArrayList<Cliente> MostrarAtendidos() {
        return atendidos;
    }

    @Override
    public String toString() {
        return "" + Cola;
    }
}
