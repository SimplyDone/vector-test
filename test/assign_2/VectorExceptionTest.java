package assign_2;

import org.junit.Test;

/**
 *
 * @author Alex Zurad, Robbie McDonnell
 */
public class VectorExceptionTest {

    //getValue
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

    //euclideanDist
    @Test(expected = NullPointerException.class)
    public void testEuclidianDistanceException() {

        Vector a = new Vector();
        Vector b = null;

        a.EuclidianDistance(b);
    }

    //constructors
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

    // operations
    @Test(expected = NullPointerException.class)
    public void testAddWithVectorNullPointerException() {

        Vector a = new Vector();
        Vector b = null;
        a.add(b);
    }

    @Test(expected = NullPointerException.class)
    public void testMultWithVectorNullPointerException() {

        Vector a = new Vector();
        Vector b = null;
        a.mult(b);
    }

    @Test(expected = NullPointerException.class)
    public void testSubWithVectorNullPointerException() {

        Vector a = new Vector();
        Vector b = null;
        a.sub(b);
    }

    //subVector
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubVectorOutOfBoundsExceptionLeftUnder() {

        Vector a = new Vector(new double[]{1, 2, 3, 4, 5, 9});
        int l = -1;
        int r = 0;
        a.subV(l, r);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubVectorOutOfBoundsExceptionRightUnder() {

        Vector a = new Vector(new double[]{1, 2, 3, 4, 5, 9});
        int l = 0;
        int r = -1;
        a.subV(l, r);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubVectorOutOfBoundsExceptionLeftOver() {

        Vector a = new Vector(new double[]{1, 2, 3, 4, 5, 9});
        int l = a.getLength();
        int r = 0;
        a.subV(l, r);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubVectorOutOfBoundsExceptionRightOver() {

        Vector a = new Vector(new double[]{1, 2, 3, 4, 5, 9});
        int l = 0;
        int r = a.getLength();
        a.subV(l, r);
    }

    //appends
    @Test(expected = NullPointerException.class)
    public void testAppendVectorNullPointerException() {

        Vector a = new Vector();
        Vector b = null;
        a.append(b);

    }
    

    @Test(expected = NullPointerException.class)
    public void testAppendDoubleArrayNullPointerException() {

        Vector a = new Vector();
        double[] b = null;
        a.append(b);

    }

    @Test(expected = NullPointerException.class)
    public void testAppendIntegerArrayNullPointerException() {

        Vector a = new Vector();
        int[] b = null;
        a.append(b);

    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAppendVectorIllegalArgumentException() {

        Vector a = new Vector();
        Vector b = new Vector(new double[]{});
        a.append(b);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDoubleArrayIllegalArgumentException() {

        Vector a = new Vector();
        double[] b = {};
        a.append(b);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendIntegerArrayIllegalArgumentException() {

        Vector a = new Vector();
        int[] b = {};
        a.append(b);

    }
    
    

}
