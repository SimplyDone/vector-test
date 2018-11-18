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

@RunWith(Parameterized.class)
public class VectorAppendVectorTest {
    private final Vector testVectorA;
    private final Vector testVectorB;
    private final Vector expectedResult;

    public VectorAppendVectorTest( Vector a, Vector b, Vector expected) {
        testVectorA = a;
        testVectorB = b;
        expectedResult = expected;
    }
    
    @Parameterized.Parameters
    public static Collection input() {

        Vector v[] = {new Vector(new double[]{1}), // v[0]
            new Vector(new double[]{2,3}), // v[1]
            new Vector(new double[]{4,5,6}), // v[2]
            new Vector(new double[]{-2, -2, -3, 8, 66})};// v[3]

        return Arrays.asList(
                new Object[][]{
                    {v[0], v[1], new Vector(new double[]{1,2,3})},
                    {v[1], v[0], new Vector(new double[]{2,3,1})}, 
                    {v[1], v[2], new Vector(new double[]{2,3,4,5,6})}, 
                    {v[1], v[3], new Vector(new double[]{2,3,-2,-2,-3,8,66})},
                    {v[3], v[1], new Vector(new double[]{-2,-2,-3,8,66,2,3})}, 
                });
    }

    @Test
    public void testAdd() {

        assertEquals("appending a vector must return expected results.",
                expectedResult, testVectorA.append(testVectorB));
    }
}