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
<<<<<<< HEAD
     */ 

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int numero;
        boolean estado = true;

        do {
            System.out.println("Menu fruteria");
            System.out.println("_______________");
            System.out.println("1. Nuevo cliente");
            System.out.println("2. Siguiente");
            System.out.println("3. Salir de la cola");
            System.out.println("4. Dejar pasar 1 posicion");
            System.out.println("5. Adelantar 1 puesto");
            System.out.println("6. Ver lista");
            System.out.println("7. Salir");
            System.out.println("");
            System.out.print("Opcion = ");
            numero = scan.nextInt();

            switch (numero) {
                case 1:

                    System.out.println("");
                    break;
                case 2:

                    System.out.println("");
                    break;
                case 3:

                    System.out.println("");
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
