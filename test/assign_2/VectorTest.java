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

    private Vector[] testVectors;

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
        testVectors = new Vector[4];

    }

    @After
    public void tearDown() {
        testVectors = null;
    }

    @Test
    public void testDefaultConstructor() {
        
        testVectors[0] = new Vector();
        testVectors[1] = new Vector();
        
        // vectors should be equal
        assertEquals("The vectors should be equal.", true, testVectors[0].equals(testVectors[1]));
       
    }
   
    
    @Test
    public void testEquals() {
        
        testVectors[0] = new Vector(4, 2);
        testVectors[1] = new Vector(4, 2);
        testVectors[2] = new Vector(4, 2);
        testVectors[3] = new Vector(3, 3);
        
        // if a = b then b = a
        assertEquals("Vector 0 must be equal to Vector 1", true, testVectors[0].equals(testVectors[1]) );
        assertEquals("Vector 1 must be equal to Vector 0", true, testVectors[1].equals(testVectors[0]) );
        
        //if a = b and b = c then c = a
        assertEquals("Vector 0 must be equal to Vector 1", true, testVectors[0].equals(testVectors[1]) );
        assertEquals("Vector 1 must be equal to Vector 0", true, testVectors[1].equals(testVectors[0]) );
        
        
        // if a/= b then b=/ a
        assertNotEquals("Vector 0 must be equal to Vector 1", true, testVectors[0].equals(testVectors[3]) );
        assertNotEquals("Vector 1 must be equal to Vector 0", true, testVectors[3].equals(testVectors[0]) );

    }
    
    @Test
    public void testClone() {
        
        testVectors[0] = new Vector(4, 2);
        testVectors[1] = new Vector(4, 2);
        testVectors[2] = new Vector(4, 2);
        testVectors[3] = new Vector(3, 3);
        

    }
    
    @Test
    public void testNormalize() {
        
        double[] orig3 = {1,2};
        
        Vector[] orig = new Vector[5];
        Vector[] norm = new Vector[5];
        Vector[] expected = new Vector[5];
        
        
        orig[0] = new Vector(); //empty vector
        orig[1] = new Vector(1, 1); //1d vector of length 1
        orig[2] = new Vector(1, 2); //1d vector of length 2
        orig[3] = new Vector(orig3);
        orig[4] = new Vector(0,0);
        
        for(int i = 0; i< orig.length; i++){
            norm[i] = orig[i].Normalize();
        }
       
        //prob shouldnt loop this
        for(Vector vector: testVectors){
            assertNotNull("Normalized vector should not be null.", vector);
        }
        

    }
    

}
