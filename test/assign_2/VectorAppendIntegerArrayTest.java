
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
public class VectorAppendIntegerArrayTest {
    private final Vector testVector;
    private final int[] testValues;
    private final Vector expectedResult;

    public VectorAppendIntegerArrayTest( Vector a, int[] b, Vector expected) {
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
        
        int i[][] = {{1},            //d[0]
            {2,3},                      //d[1]
            {4,5,6},                    //d[2]
            {-2,-2,-3,8,66}};           //d[3]


        return Arrays.asList(
                new Object[][]{
                    {v[0], i[1], new Vector(new double[]{1,2,3})}, // tests multiple elements in a vector appended to one integer
                    {v[1], i[0], new Vector(new double[]{2,3,1})}, // tests one element appended to multiple integers
                    {v[1], i[2], new Vector(new double[]{2,3,4,5,6})}, // tests a generic multi elements append
                    {v[1], i[3], new Vector(new double[]{2,3,-2,-2,-3,8,66})}, // tests appending a large set of integers
                    {v[3], i[1], new Vector(new double[]{-2,-2,-3,8,66,2,3})}, // tests appending integers to a large vector 
                });
    }

    @Test
    public void testAdd() {

        assertEquals("Appending an array of integers must return expected results.",
                expectedResult, testVector.append(testValues));
    }
}