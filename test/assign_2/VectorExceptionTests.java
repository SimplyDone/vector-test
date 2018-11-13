/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign_2;

import org.junit.Test;

/**
 *
 * @author Alex Zurad
 */
public class VectorExceptionTests {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueOutOfBoundsExceptionUnder() {

        Vector a = new Vector(new double[]{1, 2, 3, 4});
        a.getValue(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueOutOfBoundsExceptionOver() {

        Vector a = new Vector(new double[]{1, 2, 3, 4, 5, 9});
        a.getValue(6);
    }

    @Test(expected = NullPointerException.class)
    public void testEuclidianDistanceException() {

        Vector a = new Vector();
        Vector b = null;

        a.EuclidianDistance(b);

    }

}
