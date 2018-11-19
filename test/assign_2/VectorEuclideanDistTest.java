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
public class VectorEuclideanDistTest {

    private final Vector testVectorA;
    private final Vector testVectorB;
    private final double expectedResult;

    public VectorEuclideanDistTest(Vector a, Vector b, double expected) {
        testVectorA = a;
        testVectorB = b;
        expectedResult = expected;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(
                new Object[][]{
                    //zero vector to zero vector
                    {new Vector(new double[]{0}), new Vector(new double[]{0}), 0},
                    //zero vector to non-zero vector
                    {new Vector(new double[]{0, 0}), new Vector(new double[]{1, 1}), Math.sqrt(2)},
                    //non-zero vector to non-zero vector
                    {new Vector(new double[]{1, 2, -1}), new Vector(new double[]{1, 1, 2}), Math.sqrt(10)},
                    //A vector to itself
                    {new Vector(new double[]{1, 2, 3}), new Vector(new double[]{1, 2, 3}), 0},
                    //larger vector to a smaller vector
                    {new Vector(new double[]{1, 2, -1}), new Vector(new double[]{1, 1}), Math.sqrt(2)},
                    //smaller vector to a larger vector
                    {new Vector(new double[]{1}), new Vector(new double[]{1, 1, 2}), Math.sqrt(5)}, 
                });
    }

    @Test
    public void testEuclideanDistance() {
        assertEquals("Euclidean distance must return expected results.",
                expectedResult, testVectorA.EuclidianDistance(testVectorB), 0);
    }

}
