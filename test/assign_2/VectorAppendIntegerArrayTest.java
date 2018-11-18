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

public class VectorAppendIntegerArrayTest {
    private final Vector testVector;
    private final int[] testValues;
    private final Vector expectedResult;

    public VectorAppendIntegerArrayTest( Vector a, int[] b, Vector expected) {
        testVector = a;
        testValues = b;
        expectedResult = expected;
    }
    
    @Parameterized.Parameters
    public static Collection input() {

        Vector v[] = {new Vector(new double[]{1}),  // v[0]
            new Vector(new double[]{2,3}),          // v[1]
            new Vector(new double[]{4,5,6}),        // v[2]
            new Vector(new double[]{-2, -2, -3, 8, 66})};// v[3]
        
        int i[][] = {{1},            //d[0]
            {2,3},                      //d[1]
            {4,5,6},                    //d[2]
            {-2,-2,-3,8,66}};           //d[3]


        return Arrays.asList(
                new Object[][]{
                    {v[0], i[1], new Vector(new double[]{1,2,3})},
                    {v[1], i[0], new Vector(new double[]{2,3,1})}, 
                    {v[1], i[2], new Vector(new double[]{2,3,4,5,6})}, 
                    {v[1], i[3], new Vector(new double[]{2,3,-2,-2,-3,8,66})}, 
                    {v[3], i[1], new Vector(new double[]{-2,-2,-3,8,66,2,3})},
                });
    }

    @Test
    public void testAdd() {

        assertEquals("appending an array of integers must return expected results.",
                expectedResult, testVector.append(testValues));
    }
}