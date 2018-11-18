/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign_2;

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
public class VectorEuclideanDistTest {
    private final Vector testVectorA;
    private final Vector testVectorB;
    private final double expectedResult;
    
    public VectorEuclideanDistTest(Vector a, Vector b, double expected ){
        testVectorA = a;
        testVectorB = b;
        expectedResult = expected;
    }
    
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(
                new Object[][] {
                    {new Vector(new double[] {0}), new Vector(new double[] {0}), 0}, //zero vector to zero vector
                    {new Vector(new double[] {0,0}), new Vector(new double[] {1,1}), Math.sqrt(2)}, //zero vector to non-zero vector
                    {new Vector(new double[] {1,2,-1}), new Vector(new double[] {1,1,2}), Math.sqrt(10)}, //non-zero vector to non-zero vector
                    {new Vector(new double[] {1,2,3}), new Vector(new double[] {1,2,3}), 0}, //A vector to itself
                    {new Vector(new double[] {1,2,-1}), new Vector(new double[] {1,1}), Math.sqrt(2)}, //larger vector to a smaller vector
                    {new Vector(new double[] {1}), new Vector(new double[] {1,1,2}), Math.sqrt(5)}, //smaller vector to a larger vector
                });
    }
    
    @Test
    public void testEuclideanDistance() {
        assertEquals("euclideanDist must return expected results.",
                 expectedResult, testVectorA.EuclidianDistance(testVectorB), 0);
    }
    
}