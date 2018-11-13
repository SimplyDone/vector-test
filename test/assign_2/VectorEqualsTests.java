/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign_2;

import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Alex Zurad
 */
@RunWith(Parameterized.class)
public class VectorEqualsTests {

    private final Vector testVectorA;
    private final Vector testVectorB;
    private final boolean expectedResult;

    public VectorEqualsTests(Vector a, Vector b, boolean expected) {
        testVectorA = a;
        testVectorB = b;
        expectedResult = expected;
    }

    @Parameterized.Parameters
    public static Collection input() {

        Vector a = new Vector(new double[]{1, 2, 3});

        Vector[] testVectors = {
            new Vector(new double[]{1, 2, 3}),
            new Vector(new double[]{1, 2, 3}),
            new Vector(new double[]{7, 8, 9, 10}),
            a};

        Vector[] expectedVectors = {
            new Vector(new double[]{1, 2, 3}),
            new Vector(new double[]{4, 5, 6}),
            null,
            a.clone()};

        return Arrays.asList(
                new Object[][]{
                    {testVectors[0], expectedVectors[0], true}, //zero vector
                    {testVectors[1], expectedVectors[1], false}, //general vector with no negative elements
                    {testVectors[2], expectedVectors[2], false}, //general vector with all negative elements
                    {testVectors[3], expectedVectors[3], true},
                });
    }

    @Test
    public void testEquals() {

        assertEquals("equals must return expected results.", expectedResult, testVectorA.equals(testVectorB));

    }

}
