
package assign_2;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Alex Zurad, Robbie McDonnell
 */
@RunWith(Parameterized.class)
public class VectorEqualsTest {

    private final Vector testVectorA;
    private final Vector testVectorB;
    private final boolean expectedResult;

    public VectorEqualsTest(Vector a, Vector b, boolean expected) {
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
                    //Tests if two generic vectors are equal
                    {testVectors[0], expectedVectors[0], true},
                    //Tests if two generic vectors are not equal
                    {testVectors[1], expectedVectors[1], false},
                    //Tests if a vector is equal to null
                    {testVectors[2], expectedVectors[2], false}, 
                    //Tests if a vector is equal to its clone
                    {testVectors[3], expectedVectors[3], true},
                });
    }

    @Test
    public void testEquals() {

        assertEquals("Equals must return expected results.", expectedResult, testVectorA.equals(testVectorB));

    }

}
