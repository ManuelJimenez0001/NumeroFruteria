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

    ArrayList<Cliente>Cola;
    ArrayList<Cliente> atendidos;

    public Cola() {
        Cola = new ArrayList<Cliente>();
        
    }
    //se genera un cliente en la lisa de los no atendidos, si la persona es mayor de 65 año ocupara la primera posicion automaticamente
    public void nuevoCliente(Cliente a) {
        
        if(a.getEdad()>=65){
            Cola.add(0, a);
        }else{
            Cola.add(a);
        }
    }
    //elimina el cliente de la lista de clientes no atendidos y lo mete en la lista de los clientes atendidos
    public void despacharCliente(){
        if(!Cola.isEmpty()){
            atendidos.add(Cola.get(0));
            Cola.remove(0); 
        }
    }
    //le pasa un cliente por argumento y lo mueve una posicion hacia delante en la cola
    public void adelantarCliente(Cliente a) {

        if (Cola.indexOf(a)!= 0 && Cola.contains(a)) {
            int aux=Cola.indexOf(a);
            Cola.remove(a);
            Cola.add(aux-1, a);
        }
    }
    //le pasa un cliente por argumento y lo mueve una posicion atras en la cola
    public void atrasarCliente(Cliente a){
        if (Cola.indexOf(a)!= Cola.size()-1 && Cola.contains(a)) {
            int aux=Cola.indexOf(a);
            Cola.remove(a);
            Cola.add(aux+1, a);
        }
    }
    //le pasa una posicion por argumento y si esta en la cola ese cliente se va de la cola
    public void abandonar(int a){
            if(a<Cola.size()&& a>=0){
                Cola.remove(a);
                System.out.println("Cliente eliminado");
            }else{
                System.out.println("No existe esa posicion en la cola");
            }
    }
    //siguienteCliente() cambia la primera posicion por la segunda 
    public void siguienteCliente(){
        Cliente a= Cola.get(0);
        Cola.remove(0);
        Cola.add(1, a);  
    }
    @Override
    public String toString() {
        return "" + Cola;
    }
}
