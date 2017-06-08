/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoV2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class ContaTest {
    
    public ContaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sacar method, of class Conta.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        double valor = 0.0;
        Conta instance = null;
        instance.sacar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of depositar method, of class Conta.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        double valor = 0.0;
        Conta instance = null;
        instance.depositar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTarifa method, of class Conta.
     */
    @Test
    public void testCalcularTarifa() {
        System.out.println("calcularTarifa");
        Conta instance = null;
        double expResult = 0.0;
        double result = instance.calcularTarifa();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ContaImpl extends Conta {

        public ContaImpl() {
            super(0, 0.0, null);
        }

        public double calcularTarifa() {
            return 0.0;
        }
    }
    
}
