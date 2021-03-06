
package assign_2;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robbie McDonnell, Alex Zurad
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
                    {v[0], v[1], new Vector(new double[]{1,2,3})}, // tests multiple elements in a vector appended to a single element vector
                    {v[1], v[0], new Vector(new double[]{2,3,1})}, // tests one element vector appended to a multi element vector
                    {v[1], v[2], new Vector(new double[]{2,3,4,5,6})}, // tests a generic multi elements append
                    {v[1], v[3], new Vector(new double[]{2,3,-2,-2,-3,8,66})},// tests appending a large vector
                    {v[3], v[1], new Vector(new double[]{-2,-2,-3,8,66,2,3})},// tests appending to a large vector 
                });
    }

    @Test
    public void testAdd() {

        assertEquals("Appending a vector must return expected results.",
                expectedResult, testVectorA.append(testVectorB));
    }
}