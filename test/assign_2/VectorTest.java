/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign_2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Zurad
 */
public class VectorTest {

    private Vector v1;

    public VectorTest() {
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

    @Test
    public void testDefaultConstruction() {
        
        v1 = new Vector();
        
        assertEquals("Size is 0", 0, v1.getLength());
    }
    
    @Test
    public void testSizeAndDefaultValueConstruction() {
        
        int size = 0;
        double initValue = 0;
        
        v1 = new Vector(size, initValue);
        assertEquals("Size is equal to defined value", size, v1.getLength());
    }
    
    @Test
    public void testDoubleArrayConstruction() {
        
        double[] values = null;
        v1 = new Vector(values);
        
        assertEquals("Null values provided equals 0", 0, v1.getLength());
    }
    
    @Test
    public void testIntegerArrayConstruction() {
        
        int[] values = null;
        v1 = new Vector(values);
        
        assertEquals("Null values provided equals 0", 0, v1.getLength());
    }

}
