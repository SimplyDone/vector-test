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

public class VectorExceptionTest {
    
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
    
    @Test(expected = IllegalArgumentException.class)
    public void testSizeInitialConstuctorIllegalArgumentException() {
        
        Vector a = new Vector(0, 1);    
    }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testDoubleArrayConstuctorIllegalArgumentException() {
        
        double[] array = {};
        Vector a = new Vector(array);    
    }
    
    @Test(expected = NullPointerException.class)
    public void testDoubleArrayConstuctorNullPointerException() {
        
        double[] array = null;
        Vector a = new Vector(array);    
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIntArrayConstuctorIllegalArgumentException() {
        
        int[] array = {};
        Vector a = new Vector(array);    
    }
    
    @Test(expected = NullPointerException.class)
    public void testIntArrayConstuctorNullPointerException() {
        
        int[] array = null;
        Vector a = new Vector(array);    
    }
    
    @Test(expected = NullPointerException.class)
    public void testOperationsWithVectorsNullPointerException() {
        
        Vector a = new Vector();
        Vector b = null;
        a.add(b);
        
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubVectorOutOfBoundsExceptionLeftUnder() {
        
        Vector a = new Vector(new double[]{1, 2, 3, 4, 5, 9});
        int l = -1;
        int r = 0;
        a.subV(l,r);
        
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubVectorOutOfBoundsExceptionRightUnder() {
        
        Vector a = new Vector(new double[]{1, 2, 3, 4, 5, 9});
        int l = 0;
        int r = -1;
        a.subV(l,r);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubVectorOutOfBoundsExceptionLeftOver() {
        
        Vector a = new Vector(new double[]{1, 2, 3, 4, 5, 9});
        int l = a.getLength();
        int r = 0;
        a.subV(l,r);
    }
    
    
    
    
    

}
