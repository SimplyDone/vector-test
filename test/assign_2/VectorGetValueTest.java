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
public class VectorGetValueTest {
    private final Vector testVector;
    private final int testValue;
    private final double expectedResult;
    
    public VectorGetValueTest(Vector a, int val, double expected ){
        testVector = a;
        testValue = val;
        expectedResult = expected;
    }
    
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(
                new Object[][] {
                    {new Vector(new double[] {1,2,3}), 0, 1}, //tests first element of array
                    {new Vector(new double[] {1,2.2,2,2.6,3}), 2, 2}, // tests an arbitrary middle elment of the array
                    {new Vector(new double[] {1,2,3}), 2, 3} //tests the last element of the array
                });
    }
    
    @Test
    public void testGetValue() {
        assertEquals("getValue must return expected results.",
                 expectedResult, testVector.getValue(testValue), 0);
        
     
    }
    
}
