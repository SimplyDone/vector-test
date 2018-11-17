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
public class VectorSubVectorTests {
    private final Vector testVector;
    private final Vector expectedResult;
    private final int r;
    private final int l;

    public VectorSubVectorTests(Vector v, int a, int b, Vector expected) {
        testVector = v;
        r = a;
        l = b;
        expectedResult = expected;
    }

    @Parameterized.Parameters
    public static Collection input() {

        Vector v[] = {new Vector(new double[]{11}), // v[0]
            new Vector(new double[]{0, 1, 2, 3, 4}), // v[1]
            new Vector(new double[]{-2, -1, 0, 1, 2})};// v[2]
        

        return Arrays.asList(
                new Object[][]{
                    {v[1],0,4, v[1]}, // tests a full vector
                    {v[1],4,0, v[1]}, // tests the integers swapped equal the previous test
                    {v[1],3,1, new Vector(new double[]{1,2,3})}, //tests a generic case
                    {v[2],3,3, new Vector(new double[]{1})}, //tests where r == l
                    {v[0],0,0, new Vector(new double[]{11})}, // tests where the vector only has one element
                });
    }

    @Test
    public void testSubV() {

        assertEquals("subV must return expected vector.",
                expectedResult, testVector.subV(r,l));
    }
}
