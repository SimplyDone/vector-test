package assign_2;

import static java.lang.Math.sqrt;
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
public class VectorNormalizeTest {

    private final Vector testVector;
    private final Vector expectedResult;

    public VectorNormalizeTest(Vector a, Vector expected) {
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
            new Vector(new double[]{1/sqrt(30), -2/sqrt(30), 3/sqrt(30), -4/sqrt(30)})
        };

        return Arrays.asList(
                new Object[][]{
                    //zero vector normalization
                    {testVectors[0],expectedVectors[0]},
                    //general vector with no negative elements normalization
                    {testVectors[1],expectedVectors[1]},
                    //general vector with all negative elements normalization
                    {testVectors[2],expectedVectors[2]}, 
                    //general vector with negative and positve values normalization
                    {testVectors[3],expectedVectors[3]} 
                });
    }
    
    @Test
    public void testNormalization() {
        assertEquals("Normalization must return expected results.",
                expectedResult, testVector.Normalize());
    }

}
