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
    private final Vector testVector;
    private final int testValue;
    private final double expectedResult;
    private enum Type {ADD, SUB, MULT};
    private Type currentType;
    
    public VectorOperationsWithVectorsTest(Type c, Vector a, int val, double expected ){
        testVector = a;
        testValue = val;
        expectedResult = expected;
        currentType = c;
    }
    
    @Parameterized.Parameters
    public static Collection input(){
        
        Vector v[] = { new Vector(new double[] {0,0}),
                new Vector(new double[]{1,2}),
                new Vector(new double[]{3,4}),
                new Vector(new double[]{5,6}),
                new Vector(new double[]{3,4}),
                new Vector(new double[]{3,4}),
                new Vector(new double[]{3,4}),
                new Vector(new double[] {3,4}),
                new Vector(new double[]{3,4})
                };
        
        
        
        return Arrays.asList(
                new Object[][] {
                    
                    {Type.ADD, v[1], v[2], new Vector(new double[] {4,6})}, // tests general case
                    {Type.ADD, v[0], new Vector(new double[] {5,6}), new Vector(new double[] {5,6})}, // tests first vector as a zero vector
                    {Type.ADD, new Vector(new double[] {7,8}), v[0], new Vector(new double[] {7,8})}, //tests second vector as a zero vector
                    {Type.ADD, new Vector(new double[] {-1,1}), new Vector(new double[] {3,-2}), new Vector(new double[] {2,-1})}, //tests negative values as elements
                    {Type.ADD, new Vector(new double[] {1,2}), new Vector(new double[] {3}), new Vector(new double[] {4,2})}, // tests second vecor with smaller size
                    {Type.ADD, new Vector(new double[] {3}), new Vector(new double[] {2,1}), new Vector(new double[] {5})}, // tests first vecor with smaller size
                    {Type.ADD, new Vector(new double[] {-1,0,4,-6}), new Vector(new double[] {-2,-2,-3,8,66}), new Vector(new double[] {-3,-2,1,2})}, // tests a complex question with several cases
                    
                    {Type.SUB, v[2],v[0], new Vector(new double[] {2,2})}, // tests general case
                    {Type.SUB, v[0], new Vector(new double[] {5,6}), new Vector(new double[] {-5,-6})},// tests first vector as a zero vector
                    {Type.SUB, new Vector(new double[] {7,8}), v[0], new Vector(new double[] {7,8})}, //tests second vector as a zero vector
                    {Type.SUB, new Vector(new double[] {-1,1}), new Vector(new double[] {3,-2}), new Vector(new double[] {-4,3})},//tests negative values as elements
                    {Type.SUB, v[1], new Vector(new double[] {3}), new Vector(new double[] {-2})}, // tests second vecor with smaller size
                    {Type.SUB, new Vector(new double[] {3}), v[1], new Vector(new double[] {2})}, // tests first vecor with smaller size
                    {Type.SUB, new Vector(new double[] {-1,0,4,-6}), new Vector(new double[] {-2,-2,-3,8,66}), new Vector(new double[] {1,2,7,-14})}, // tests a complex question with several cases
                    
                    {Type.MULT, v[1], v[2], new Vector(new double[] {3,8})}, // tests general case
                    {Type.MULT, v[0], new Vector(new double[] {5,6}), new Vector(new double[] {0,0})}, // tests first vector as a zero vector
                    {Type.MULT, new Vector(new double[] {7,8}), v[0], new Vector(new double[] {0,0})}, //tests second vector as a zero vector
                    {Type.MULT, v[1], new Vector(new double[] {3}), new Vector(new double[] {3,2})}, // tests second vecor with smaller size
                    {Type.MULT, new Vector(new double[] {3}), v[1], new Vector(new double[] {3})}, // tests first vecor with smaller size
                    {Type.MULT, new Vector(new double[] {4,5,6}), new Vector(new double[] {1,1,1}), new Vector(new double[] {4,5,6})}, //tests second vector with all elements equaling 1
                    {Type.MULT, new Vector(new double[] {1,1,1}), new Vector(new double[] {7,8,9}), new Vector(new double[] {7,8,9})}, //tests first vector with all elements equaling 1
                    {Type.MULT, new Vector(new double[] {-1,0,4,-6}), new Vector(new double[] {-2,-2,-3,8,66}), new Vector(new double[] {2,0,-12,-48})} // tests a complex question with several cases
                    
                });
    }
    
    @Test
    public void testGetValue() {
        assertEquals("getValue must return expected results.",
                 expectedResult, testVector.getValue(testValue), 0);
        
    }
    
}
