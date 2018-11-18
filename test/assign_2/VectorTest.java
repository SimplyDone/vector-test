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
@SuiteClasses({VectorGetValueTests.class,
    VectorExceptionTests.class,
    VectorEuclideanDistTests.class,
    VectorNormalizeTests.class,
    VectorLengthTests.class,
    VectorEqualsTests.class,
    VectorCloneTests.class,
    VectorOperationsWithDoublesTests.class,
    VectorOperationsWithVectorsTests.class,
    VectorParamsConstructorsTests.class,
    VectorEmptyConstuctorTests.class, 
    VectorSubVectorTests.class})
public class VectorTest {


}
