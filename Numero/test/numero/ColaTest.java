/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numero;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Ángel.García
 */
public class ColaTest {
    Cliente manolo;
    Cliente pepe ;
    Cliente alberto;
    Cliente a;
    Cliente b;
    Cliente c;
    Cola cola;

    public ColaTest() {
        a = new Cliente("manolo", 23);
        b = new Cliente("pedro", 15);
        c = new Cliente("sami", 19);
        
        manolo = new Cliente("manolo", 74);
        pepe = new Cliente("pepe", 26);
        alberto = new Cliente("alberto", 32);
        
        cola = new Cola();
    }

    /**
     * Test of nuevoCliente method, of class Cola.
     */
    @Test
    public void testNuevoCliente() {
        assertEquals(0,cola.Cola.size());
        cola.nuevoCliente(a);
        cola.nuevoCliente(b);
        assertEquals(2,cola.Cola.size());
    }

    /**
     * Test of despacharCliente method, of class Cola.
     */
    @Test
    public void testDespacharCliente() {
        
        cola.nuevoCliente(a);
        cola.despacharCliente();
        assertTrue(cola.Cola.size()==0);
        
    }

    /**
     * Test of adelantarCliente method, of class Cola.
     */
    @Test
    public void testAdelantarCliente() {
        cola.nuevoCliente(a);
        cola.nuevoCliente(b);
        cola.adelantarCliente(1);

        //comprobamos que el cliente que se encuentra en la primera posicion es
        // el que hemos adelantado
        assertSame(cola.Cola.get(0), b);
    }

    @Test
    public void testAtrasarCliente() {
        cola.nuevoCliente(a);
        cola.nuevoCliente(b);
        cola.nuevoCliente(c); 
        cola.atrasarCliente(1);

        //comprobamos que el cliente que se encuentra en la primera posicion es
        // el que hemos atrasado
        assertSame(cola.Cola.get(2), b);
    }

    @Test
    public void testAbandonar() {

        
        
        cola.nuevoCliente(manolo);
        cola.nuevoCliente(pepe);
        cola.nuevoCliente(alberto);
        cola.abandonar(0);
        assertSame(cola.Cola.get(0),pepe);
        
        
    }

    /**
     * Test of siguienteCliente method, of class Cola.
     */
    @Test
    public void siguienteCliente() {
        cola.nuevoCliente(manolo);
        cola.nuevoCliente(pepe);
        cola.nuevoCliente(alberto);
        cola.siguienteCliente();
        assertSame(cola.Cola.get(1),manolo);
        
        
    }

    @Test
    public void testMostrarNoAtendidos(){
    }

    @Test
    public void testMostrarAtendidos(){
    }

    @Test
    public void testToString() {
    }

}
