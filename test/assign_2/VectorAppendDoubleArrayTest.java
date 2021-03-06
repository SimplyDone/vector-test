
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
public class VectorAppendDoubleArrayTest {
    private final Vector testVector;
    private final double[] testValues;
    private final Vector expectedResult;

    public VectorAppendDoubleArrayTest( Vector a, double[] b, Vector expected) {
        testVector = a;
        testValues = b;
        expectedResult = expected;
    }
    
    @Parameterized.Parameters
    public static Collection input() {

        Vector v[] = {new Vector(new double[]{1}),  // v[0]
            new Vector(new double[]{2,3}),          // v[1]
            new Vector(new double[]{4,5,6}),        // v[2]
            new Vector(new double[]{-2, -2, -3, 8, 66})};// v[3]
        
        double d[][] = {{1},            //d[0]
            {2,3},                      //d[1]
            {4,5,6},                    //d[2]
            {-2,-2,-3,8,66}};           //d[3]


        return Arrays.asList(
                new Object[][]{
                    {v[0], d[1], new Vector(new double[]{1,2,3})}, // tests multiple elements in a vector appended to one double
                    {v[1], d[0], new Vector(new double[]{2,3,1})}, // tests one element appended to multiple doubles 
                    {v[1], d[2], new Vector(new double[]{2,3,4,5,6})},// tests a generic multi elements append
                    {v[1], d[3], new Vector(new double[]{2,3,-2,-2,-3,8,66})}, // tests appending a large set of doubles
                    {v[3], d[1], new Vector(new double[]{-2,-2,-3,8,66,2,3})}, // tests appending doubles to a large vector 
                });
    }

    @Test
    public void testAdd() {

        assertEquals("Appending an array of doubles must return expected results.",
                expectedResult, testVector.append(testValues));
    }
}