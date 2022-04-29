/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numero;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sami
 */
public class ClienteTest {
    
    public ClienteTest() {
    }
    
    @Test
    /* Se asegura que el objeto no es nulo*/
    public  void testClienteNoNulo() {
        Cliente SeyorPrueba = new Cliente ("Ramiro",14);
        assertNull( SeyorPrueba);
    }
    
    @Test 
    /* Para asegurarse de que dos objetos no apunten al mismo trozo de memoria*/
    public  void testClienteNoSeCreanEnLaMismaMemoria() {
        Cliente SeyorPrueba = new Cliente ("Ramiro",14);
        Cliente SeyorPrueba2 = new Cliente ("Paco",14);
        SeyorPrueba = SeyorPrueba2;
        assertNotSame( SeyorPrueba,SeyorPrueba2);
    }
    
}
