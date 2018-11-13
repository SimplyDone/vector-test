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
public class VectorGetValueTests {
    private final Vector testVector;
    private final int testValue;
    private final double expectedResult;
    
    public VectorGetValueTests(Vector a, int val, double expected ){
        testVector = a;
        testValue = val;
        expectedResult = expected;
    }
    
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(
                new Object[][] {
                    {new Vector(new double[] {1,2,3}), 0, 1},
                    {new Vector(new double[] {1,2,3}), 1, 2},
                    {new Vector(new double[] {1,2,3}), 2, 3}
                });
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueOOBExceptionUnder() {
        
        Vector a = new Vector(new double[] {1,2,3});
        a.getValue(-1);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueOOBExceptionOver() {
        
        Vector a = new Vector(new double[] {1,2,3});
        a.getValue(3);
    }
    
    @Test
    public void testGetValue() {
        assertEquals("getValue must return expected results.",
                testVector.getValue(testValue), expectedResult, 0);
        
     
    }
    
}
