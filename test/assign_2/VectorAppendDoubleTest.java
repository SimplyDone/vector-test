
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
public class VectorAppendDoubleTest {
    private final Vector testVector;
    private final double testValue;
    private final Vector expectedResult;


    public VectorAppendDoubleTest( Vector a, double b, Vector expected) {
        testVector = a;
        testValue = b;
        expectedResult = expected;
    }

    @Parameterized.Parameters
    public static Collection input() {

        Vector v[] = {new Vector(new double[]{1}),          // v[0]
            new Vector(new double[]{2,3}),                  // v[1]
            new Vector(new double[]{-2, -2, -3, 8, 66})};   // v[2]

        return Arrays.asList(
                new Object[][]{
                    {v[0], 1.5, new Vector(new double[]{1,1.5})}, //tests appending to a single element vector
                    {v[1], -1.5, new Vector(new double[]{2,3,-1.5})}, //tests appending to a multi element vector
                    {v[2], -100, new Vector(new double[]{-2,-2,-3,8,66,-100})},//test appending to a large vector
                  });
    }

    @Test
    public void testAdd() {

        assertEquals("Appending a double must return expected results.",
                expectedResult, testVector.append(testValue));
    }
}