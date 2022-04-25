package numero;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        //herramientas para el uso del programa
        Scanner scan = new Scanner(System.in);

        //variables necesarias
        int numeroCola,edad,eliminar;
        boolean estado = true;
        String nombre;

        //necesitamos generar una cola para nuestro progama
        Cola fruteria = new Cola();

        //hacemos un bucle el cual nos permite elegir opciones hasta que le demos a salir, podriamos
        //realizar un control de fallos por si el usuario se equivoca, lo cual haremos si nos da tiempo

        do {
        //este es el menu que nos permite facilitar al usuario las opciones que tiene
            System.out.println("Menu fruteria");
            System.out.println("_______________");
            System.out.println("1. Nuevo cliente");//nuevoCliente() ok
            System.out.println("2. Atender");//despacharCliente() ok
            System.out.println("3. Salir de la cola");//abandonar() ok 
            System.out.println("4. Dejar pasar 1 posicion");//atrasarCliente()
            System.out.println("5. Adelantar 1 puesto");//adelantarCliente()
            System.out.println("6. Siguiente");//siguenteCliente()
            System.out.println("7. Ver lista");//toString
            System.out.println("8. Salir\n");
            System.out.print("Opcion = ");
            numeroCola = scan.nextInt();

            //comentamos el codigo para facilitar la incorporacion del codigo 
            switch (numeroCola) {
                case 1:
                    //Añadimos un nuevo cliente a la lista
                    System.out.println("Esta opcion añade clientes");

                    //pedimos los datos del cliente
                    //nombre
                    System.out.println("Nombre del cliente: ");
                    nombre = scan.next();
                    //edad
                    System.out.println("Edad del cliente: ");
                    edad = scan.nextInt();
                    
                    //generamos un nuevo cliente en la lista segun los datos recogidos
                    fruteria.nuevoCliente(new Cliente(nombre, edad));
                    
                    break;
                    
                case 2:
                    //Atendemos al cliente que se encuentre en el primer lugar de la lista
                    //y lo pasa a la lista de atendidos 
                    System.out.println("Atiende al primer cliente de la lista");
                    
                    //invocamos al metodo aplicado a nuestra cola
                    fruteria.despacharCliente();
                    
                    break;
                    
                case 3:
                    //metodo que elimina al cliente seleccionado de la cola 
                    System.out.println("Saca de la cola al cliente");
                    //pedimos el cliente a eliminar
                    System.out.println("Que numero de cliente desea eliminar: ");
                    eliminar = scan.nextInt();
                    
                    //ejecutamos el metodo abandonar
                    fruteria.abandonar(eliminar);
                    
                    break;
                    
                case 4:

                    System.out.println("");
                    break;
                    
                case 5:

                    System.out.println("");
                    break;
                    
                case 6:

                    System.out.println("");
                    break;
                    
                case 7:
                    //sale del programa
                    estado = false;
                    break;
                    
                default:
                    System.out.println("Debe de introducir un numero del 1 al 7, muchas gracias.");
                    System.out.println("");
                    break;

            }
        } while (estado != false);
    }

}
