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

    Cliente a;
    Cliente b;
    Cliente c;
    Cola cola;

    public ColaTest() {
        a = new Cliente("manolo", 23);
        b = new Cliente("pedro", 15);
        c = new Cliente("sami", 19);
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
    }

    @Test
    public void testSiguienteCliente() {
    }

    @Test
    public void testMostrarNoAtendidos(){
        cola.nuevoCliente(a);
        cola.nuevoCliente(b);
        cola.nuevoCliente(c);
        cola.MostrarNoAtendidos();
    }

    @Test
    public void testMostrarAtendidos(){
        cola.nuevoCliente(a);
        cola.nuevoCliente(b);
        cola.nuevoCliente(c);
        cola.MostrarAtendidos();
    }

    @Test
    public void testToString() {
    }

}
