/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign_2;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Alex Zurad
 */
@RunWith(Parameterized.class)
public class VectorOperationsWithVectorsTest {
    private final Vector testVectorA;
    private final Vector testVectorB;
    private final Vector expectedResult;
    private enum Type {ADD, SUB, MULT};
    private Type currentType;
    
    public VectorOperationsWithVectorsTest(Type c, Vector a, Vector b, Vector expected ){
        testVectorA = a;
        testVectorB = b;
        expectedResult = expected;
        currentType = c;
    }
    
    @Parameterized.Parameters
    public static Collection input(){
        
        Vector v[] = { new Vector(new double[] {0,0}),  // v[0]
                new Vector(new double[]{1,2}),          // v[1]
                new Vector(new double[]{3,4}),          // v[2]
                new Vector(new double[]{3}),            // v[3]
                new Vector(new double[]{5,6}),          // v[4]
                new Vector(new double[]{7,8}),          // v[5]
                new Vector(new double[]{-1,1}),         // v[6]
                new Vector(new double[] {3,-2}),        // v[7]
                new Vector(new double[]{4,5,6}),        // v[8]
                new Vector(new double[]{7,8,9}),        // v[9]
                new Vector(new double[]{1,1,1}),        // v[10]
                new Vector(new double[]{-1,0,4,-6}),    // v[11]
                new Vector(new double[]{-2,-2,-3,8,66})};// v[12]
        
        return Arrays.asList(
                new Object[][] {
                    {Type.ADD,  v[1], v[2], new Vector(new double[] {4,6})}, // tests general case
                    {Type.ADD,  v[0], v[4], new Vector(new double[] {5,6})}, // tests first vector as a zero vector
                    {Type.ADD,  v[5], v[0], new Vector(new double[] {7,8})}, //tests second vector as a zero vector
                    {Type.ADD,  v[6], v[7], new Vector(new double[] {2,-1})}, //tests negative values as elements
                    {Type.ADD,  v[1], v[3], new Vector(new double[] {4,2})}, // tests second vecor with smaller size
                    {Type.ADD,  v[3], v[1], new Vector(new double[] {5})}, // tests first vecor with smaller size
                    {Type.ADD,  v[11], v[12], new Vector(new double[] {-3,-2,1,2})}, // tests a complex question with several cases
                    
                    {Type.SUB,  v[2], v[0], new Vector(new double[] {2,2})}, // tests general case
                    {Type.SUB,  v[0], v[4], new Vector(new double[] {-5,-6})},// tests first vector as a zero vector
                    {Type.SUB,  v[5], v[0], new Vector(new double[] {7,8})}, //tests second vector as a zero vector
                    {Type.SUB,  v[6], v[7], new Vector(new double[] {-4,3})},//tests negative values as elements
                    {Type.SUB,  v[1], v[3], new Vector(new double[] {-2})}, // tests second vecor with smaller size
                    {Type.SUB,  v[3], v[1], new Vector(new double[] {2})}, // tests first vecor with smaller size
                    {Type.SUB,  v[11], v[12], new Vector(new double[] {1,2,7,-14})}, // tests a complex question with several cases
                    
                    {Type.MULT, v[1], v[2], new Vector(new double[] {3,8})}, // tests general case
                    {Type.MULT, v[0], v[4], new Vector(new double[] {0,0})}, // tests first vector as a zero vector
                    {Type.MULT, v[5], v[0], new Vector(new double[] {0,0})}, //tests second vector as a zero vector
                    {Type.MULT, v[6], v[7], new Vector(new double[] {-3,-2})}, //tests negative values as elements
                    {Type.MULT, v[1], v[3], new Vector(new double[] {3,2})}, // tests second vecor with smaller size
                    {Type.MULT, v[3], v[1], new Vector(new double[] {3})}, // tests first vecor with smaller size
                    {Type.MULT, v[8], v[10], v[8]},                         //tests second vector with all elements equaling 1
                    {Type.MULT, v[10], v[9], v[9]},                        //tests first vector with all elements equaling 1
                    {Type.MULT, v[11], v[12], new Vector(new double[] {2,0,-12,-48})} // tests a complex question with several cases
                    
                });
    }
    
    @Test
    public void testAdd() {
        
        Assume.assumeTrue(currentType == Type.ADD);
        assertEquals("add must return expected results.", 
                expectedResult, testVectorA.add(testVectorB));
    }
    
    @Test
    public void testSub() {
        
        Assume.assumeTrue(currentType == Type.SUB);
        assertEquals("sub must return expected results.", 
                expectedResult, testVectorA.sub(testVectorB));
    }
    @Test
    public void testMult() {
        
        Assume.assumeTrue(currentType == Type.MULT);
        assertEquals("mult must return expected results.", 
                expectedResult, testVectorA.mult(testVectorB));
    }
    
}
