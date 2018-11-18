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
 * @author MAGIKARP11
 */

public class VectorAppendDoubleTest {
    private final Vector testVector;
    private final double testValue;
    private final Vector expectedResult;

    public VectorAppendDoubleTest( Vector a, double b, Vector expected) {
        testVector = a;
        testValue = b;
        expectedResult = expected;
    }
    
    // check if append result is not null
    // compare append base case -> appended cases
    // append somehting <-> null 
    // different sized vectors
    // compare appending both ways
    // compare equivalent appends (intArrary and double Array)
    
    @Parameterized.Parameters
    public static Collection input() {

        Vector v[] = {new Vector(new double[]{1}),  // v[0]
            new Vector(new double[]{2,3}),          // v[1]
            new Vector(new double[]{-2, -2, -3, 8, 66})};// v[2]

        return Arrays.asList(
                new Object[][]{
                    {v[0], 1.5, new Vector(new double[]{1,1.5})}, 
                    {v[1], -1.5, new Vector(new double[]{2,3,-1.5})}, 
                    {v[2], -100, new Vector(new double[]{-2,-2,-3,8,66,-100})},
                  });
    }

    @Test
    public void testAdd() {

        assertEquals("appending a double must return expected results.",
                expectedResult, testVector.append(testValue));
    }
}