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
public class AppendVectorTest {
    private final Vector testVectorA;
    private final Vector testVectorB;
    private final Vector expectedResult;

    public AppendVectorTest( Vector a, Vector b, Vector expected) {
        testVectorA = a;
        testVectorB = b;
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

        Vector v[] = {new Vector(new double[]{1}), // v[0]
            new Vector(new double[]{2,3}), // v[1]
            new Vector(new double[]{4,5,6}), // v[2]
            new Vector(new double[]{-2, -2, -3, 8, 66})};// v[3]

        return Arrays.asList(
                new Object[][]{
                    {v[0], v[1], new Vector(new double[]{1,2,3})}, // tests general case
                    {v[1], v[0], new Vector(new double[]{2,3,1})}, // tests first vector as a zero vector
                    {v[1], v[2], new Vector(new double[]{2,3,4,5,6})}, //tests second vector as a zero vector
                    {v[1], v[3], new Vector(new double[]{2,3,-2,-2,-3,8,66})}, // tests second vecor with smaller size
                    {v[3], v[1], new Vector(new double[]{-2,-2,-3,8,66,2,3})}, // tests first vecor with smaller size
                });
    }

    @Test
    public void testAdd() {

        assertEquals("appending a vector must return expected results.",
                expectedResult, testVectorA.append(testVectorB));
    }
}