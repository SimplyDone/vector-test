package assign_2;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Alex Zurad, Robbie McDonnell
 */
@RunWith(Parameterized.class)
public class VectorOperationsWithDoublesTest {

    private final Vector testVectorA;
    private final double testValueB;
    private final Vector expectedResult;

    private enum Type {
        ADD, MULT
    };
    private final Type currentType;

    public VectorOperationsWithDoublesTest(Type c, Vector a, double b, Vector expected) {
        testVectorA = a;
        testValueB = b;
        expectedResult = expected;
        currentType = c;
    }

    @Parameterized.Parameters
    public static Collection input() {

        Vector v[] = {new Vector(new double[]{0, 0}), // v[0]
            new Vector(new double[]{1, 2}), // v[1]
            new Vector(new double[]{3, 4}), // v[2]
            new Vector(new double[]{-5, -1}), // v[3]
            new Vector(new double[]{1, 1, 1}), // v[4]
            new Vector(new double[]{-2, 2, -3, 8, 11})};// v[5]

        return Arrays.asList(
                new Object[][]{
                    {Type.ADD, v[1], 4.0, new Vector(new double[]{5, 6})}, // tests general case
                    {Type.ADD, v[2], 0.0, v[2]}, // tests double as 0.0
                    {Type.ADD, v[0], 3.0, new Vector(new double[]{3, 3})}, //tests vector as 0 vector
                    {Type.ADD, v[1], -4.0, new Vector(new double[]{-3, -2})}, //tests with negative double
                    {Type.ADD, v[3], 2.0, new Vector(new double[]{-3, 1})}, // tests with negative elements in the vector
                    {Type.ADD, v[5], 8.0, new Vector(new double[]{6, 10, 5, 16, 19})}, // tests a complex problem with several cases

                    {Type.MULT, v[1], 4.0, new Vector(new double[]{4, 8})}, // tests general case
                    {Type.MULT, v[2], 0.0, new Vector(new double[]{0, 0})}, // tests double as 0.0
                    {Type.MULT, v[0], 3.0, new Vector(new double[]{0, 0})}, // tests vector as 0 vector
                    {Type.MULT, v[1], -4.0, new Vector(new double[]{-4, -8})}, //tests with negative double
                    {Type.MULT, v[3], 2.0, new Vector(new double[]{-10, -2})}, // tests with negative elements in vector
                    {Type.MULT, v[4], 5.0, new Vector(new double[]{5, 5, 5})}, // tests with all elements in the vector equal to 1
                    {Type.MULT, v[2], 1.0, v[2]}, //tests with the double equal to 1
                    {Type.MULT, v[5], 8.0, new Vector(new double[]{-16, 16, -24, 64, 88})} // tests a complex question with several cases
                });
    }

    @Test
    public void testAdd() {

        if (currentType == Type.ADD) {
            assertEquals("add must return expected results.",
                    expectedResult, testVectorA.add(testValueB));
        }

    }

    @Test
    public void testMult() {

        if (currentType == Type.MULT) {
            assertEquals("mult must return expected results.",
                    expectedResult, testVectorA.mult(testValueB));
        }
    }

}
