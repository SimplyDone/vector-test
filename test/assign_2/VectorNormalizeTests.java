package assign_2;

import static java.lang.Math.sqrt;
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
public class VectorNormalizeTests {

    private final Vector testVector;
    private final Vector expectedResult;

    public VectorNormalizeTests(Vector a, Vector expected) {
        testVector = a;
        expectedResult = expected;
    }

    @Parameterized.Parameters
    public static Collection input() {
        

        Vector[] testVectors = {
            new Vector(new double[]{0}),
            new Vector(new double[]{1, 2, 3}),
            new Vector(new double[]{-1, -2, -3}),
            new Vector(new double[]{1, -2, 3, -4})};

        Vector[] expectedVectors = {
            new Vector(new double[]{0}),
            new Vector(new double[]{1/sqrt(14), 2/sqrt(14), 3/sqrt(14)}),
            new Vector(new double[]{-1/sqrt(14), -2/sqrt(14), -3/sqrt(14)}),
            new Vector(new double[]{1/sqrt(30), -2/sqrt(30),
                3/sqrt(30), -4/sqrt(30)})
        };

        return Arrays.asList(
                new Object[][]{
                    {testVectors[0],expectedVectors[0]}, //zero vector
                    {testVectors[1],expectedVectors[1]}, //general vector with no negative elements
                    {testVectors[2],expectedVectors[2]}, //general vector with all negative elements
                    {testVectors[3],expectedVectors[3]} //general vector with negative and positve values
                });
    }
    
    @Test
    public void testNormalization() {
        assertEquals("normalization must return expected results.",
                expectedResult, testVector.Normalize());
    }

}
