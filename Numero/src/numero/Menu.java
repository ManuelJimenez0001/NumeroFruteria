/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero;

import java.util.Scanner;

/**
 *
 * @author ManuJimenez
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        final String añadirCliente= "AC";
        final String atenderCliente="AtC";
        final String eliminarCliente="EC";
        final String avanzar= "AV";
        final String retrasar="RE";
        final String pasarCliente= "PC";
        final String noAtendidos="NA";
        final String atendidos="A";
        final String mayores="M";
        final String salir = "S";
        
        String numero="";
        
        System.out.println("Fruteria");
        System.out.println("==================");
        System.out.println("Boton 1: Añadir Cliente");
        System.out.println("Boton 2: Atender Cliente");
        System.out.println("Boton 3: Eliminar Cliente");
        System.out.println("Boton 4: Avanzar Posicion");
        System.out.println("Boton 5: Retroceder Posicion");
        System.out.println("Boton 6: Dejar Pasar Cliente");
        System.out.println("Boton 7: Clientes No Atendidos");
        System.out.println("Boton 8: Clientes Atendidos");
        System.out.println("Boton 9: Preferencia Mayores");
        System.out.println("Boton 10: Salir");
        
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
        
        
        switch(numero){
            case añadirCliente:
                System.out.println("Cliente añadido");
                break;
                
            case atenderCliente:
                System.out.println("Cliente atendido");
                break;
                
            case eliminarCliente:
                System.out.println("Cliente eliminado");
                break;
                
            case avanzar:
                System.out.println("Cliente avanza una posicion");
                break;
                
            case retrasar:
                System.out.println("Cliente retrasa una posicion");
                break;
                
            case pasarCliente:
                System.out.println("Dejas pasar un cliente");
                break;
                
            case noAtendidos:
                System.out.println("Estos clientes no han sido atendidos");
                break;
                
            case atendidos:
                System.out.println("Estos clientes han sido atendidos");
                break;
                
            case mayores:
                System.out.println("Has sido buen ciudadano y has dejado pasar a una persona mayor");
                break;
                
            case salir:
                break;
        }
      }
        
    }
    

