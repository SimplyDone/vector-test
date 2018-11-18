/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign_2;

import static java.lang.Math.sqrt;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.*;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author Alex Zurad.
 */

@RunWith(Suite.class)
@SuiteClasses({VectorGetValueTests.class, VectorExceptionTests.class,
    VectorEuclideanDistTests.class, VectorNormalizeTests.class,
    VectorLengthTest.class, VectorEqualsTests.class, VectorCloneTests.class,
    VectorOperationsWithDoublesTests.class, VectorOperationsWithVectorsTests.class,
    VectorParamsConstructorsTests.class, VectorEmptyConstuctorTests.class, 
    VectorSubVectorTests.class})
public class VectorTest {

    private Vector[] testVectors;

    public VectorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        testVectors = new Vector[4];

    }

    @After
    public void tearDown() {
        testVectors = null;
    }

    @Test
    public void testDefaultConstructor() {

        testVectors[0] = new Vector();
        testVectors[1] = new Vector();

        // vectors should be equal
        assertEquals("The vectors should be equal.", true, testVectors[0].equals(testVectors[1]));

    }

    // check if append result is not null
    // compare append base case -> appended cases
    // append somehting <-> null 
    // different sized vectors
    // append 0 -> 0
    // append something <-> 0
    // compare appending both ways
    // compare equivalent appends (intArrary and double Array)
    @Test
    public void testAppendDoubleArray() {
        double aDouble[] = {1.1, 2.5};
        double bDouble[] = {1.3, 2.4, 3.0};
        double nDouble[] = null;

        testVectors[0] = new Vector(aDouble);
        testVectors[1] = new Vector();

        testVectors[1].append(aDouble);

        assertEquals("Appending a double to a vector must equal a vector constructed with the same double",
                true, testVectors[0].equals(testVectors[1]));

        assertEquals("A vector constructed with a double must equal an Appended double to a vector",
                true, testVectors[1].equals(testVectors[0]));

        testVectors[2] = new Vector();
        testVectors[3] = new Vector(nDouble);

        testVectors[2].append(0.0);

        assertEquals("A vector constructed with a double must equal an Appended double to a vector",
                true, testVectors[1].equals(testVectors[2]));
    }


}
