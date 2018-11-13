/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign_2;

import static java.lang.Math.sqrt;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.*;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/** 
 *
 * @author Alex Zurad
 */
@RunWith(Suite.class)
@SuiteClasses({VectorGetValueTests.class, VectorExceptionTests.class})
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

//    @Test
//    public void testDefaultConstructor() {
//        
//        testVectors[0] = new Vector();
//        testVectors[1] = new Vector();
//        
//        // vectors should be equal
//        assertEquals("The vectors should be equal.", true, testVectors[0].equals(testVectors[1]));
//       
//    }
//    
//    // check if append result is not null
//    // compare append base case -> appended cases
//    // append somehting <-> null
//    // different sized vectors
//    // append 0 -> 0
//    // append something <-> 0
//    // compare appending both ways
//    // compare equivalent appends (intArrary and double Array)
//    
//    @Test
//    public void testAppendDoubleArray(){
//        double aDouble[] = {1.1, 2.5};
//        double bDouble[] = {1.3, 2.4, 3.0};
//        double nDouble[] = null;
//        
//        testVectors[0] = new Vector(aDouble);
//        testVectors[1] = new Vector();
//        
//        testVectors[1].append(aDouble);
//        
//        assertEquals("Appending a double to a vector must equal a vector constructed with the same double", 
//                true, testVectors[0].equals(testVectors[1]));
//        
//        assertEquals("A vector constructed with a double must equal an Appended double to a vector", 
//                true, testVectors[1].equals(testVectors[0]));
//        
//        
//        testVectors[2] = new Vector();
//        testVectors[3] = new Vector(nDouble);
//        
//        testVectors[2].append(0.0);
//        
//        assertEquals("A vector constructed with a double must equal an Appended double to a vector", 
//                true, testVectors[1].equals(testVectors[2]));
//    }
//    
//    
//    @Test
//    public void testAppendIntegerArray(){
//        
//    }
//    
//    @Test
//    public void testAppendVector(){
//        
//    }
//    
//    @Test
//    public void testAppendDouble(){
//        
//    
//    }
//    
//    
//   /* append to 0 vector
//    
//
//    */
//    
//    @Test
//    public void testEquals() {
//        
//        testVectors[0] = new Vector(4, 2);
//        testVectors[1] = new Vector(4, 2);
//        testVectors[2] = new Vector(4, 2);
//        testVectors[3] = new Vector(3, 3);
//        
//        // if a = b then b = a
//        assertEquals("Vector 0 must be equal to Vector 1", true, testVectors[0].equals(testVectors[1]) );
//        assertEquals("Vector 1 must be equal to Vector 0", true, testVectors[1].equals(testVectors[0]) );
//        
//        //if a = b and b = c then c = a
//        assertEquals("Vector 0 must be equal to Vector 1", true, testVectors[0].equals(testVectors[1]) );
//        assertEquals("Vector 1 must be equal to Vector 0", true, testVectors[1].equals(testVectors[0]) );
//        
//        
//        // if a/= b then b=/ a
//        assertNotEquals("Vector 0 must be equal to Vector 1", true, testVectors[0].equals(testVectors[3]) );
//        assertNotEquals("Vector 1 must be equal to Vector 0", true, testVectors[3].equals(testVectors[0]) );
//
//    }
//    
//    @Test
//    public void testClone() {
//        
//        testVectors[0] = new Vector(4, 2);
//        testVectors[1] = new Vector(4, 2);
//        testVectors[2] = new Vector(4, 2);
//        testVectors[3] = new Vector(3, 3);
//        
//
//    }
//    
//
//    
//    @Test
//    public void testNormalize() {
//        
//        double[][] initalValues = {{0}, {0,0}, {1}, {2}, {1,1}, {-1,-1}, {1,2,3}};
//        double[][] expectedValues = {{0}, {0,0}, {1}, {1}, {1/sqrt(2), 1/sqrt(2)}, {-1/sqrt(2), -1/sqrt(2)}, {1/sqrt(14),2/sqrt(14),3/sqrt(14)}};
//        
//       
//        Vector[] initalVectors = new Vector[initalValues.length];
//        Vector[] normalizedVectors = new Vector[initalValues.length];
//        Vector[] expectedVectors = new Vector[initalValues.length];
//        
//        for(int i = 0; i< initalVectors.length; i++){
//            initalVectors[i] = new Vector(initalValues[i]);
//            normalizedVectors[i] = initalVectors[i].Normalize();
//            expectedVectors[i] = new Vector(expectedValues[i]);
//            
//            assertEquals("Vector" + i + " must equal the expected result.", normalizedVectors[i], expectedVectors[i]);
//        }   
//    }
//    
//    
//    @Test
//    public void testVectorLength() {
//        
//        double[][] initalValues = {{0}, {0,0}, {1}, {1,2}, {1,2,3,4}};
//        int[] expectedValues = {1, 2, 1, 2, 4};
//        int[] calculatedValues = new int[initalValues.length];
//        
//         Vector[] initalVectors = new Vector[initalValues.length];
//        
//        for(int i = 0; i< initalValues.length; i++){
//            
//             initalVectors[i] = new Vector(initalValues[i]);
//             calculatedValues[i] = initalVectors[i].getLength();
//             
//             assertEquals("Length of vector" + i + " must equal expected value.", expectedValues[i], calculatedValues[i]);
//        }
//        
//    }
//    
//   
//    @Test 
//    public void testAddVector(){
//        // exception for different sized vectors?
//        testVectors[0] = new Vector();
//        testVectors[1] = new Vector();
//    }
//
//
//    @Test 
//    public void testAddDouble(){
//        
//    }
}
