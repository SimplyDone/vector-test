
package assign_2;

import java.util.Arrays;

/** @version 2.0
 *
 *  @author Alex Zurad
 */

public class Vector {

    private double[] elements;

    public Vector() {
        this(1,0);
        
    }

    public Vector(int size, double d) throws IllegalArgumentException {
        
        if (size <= 0){
            throw new IllegalArgumentException("Vector size cannot be 0 or less.");
        }
        
        elements = new double[size];
        Arrays.fill(elements, d);
        
    }

    public Vector(double[] d) throws NullPointerException {
        
        if (d == null){
            throw new NullPointerException("Input array cannot be null!");
        }
        
        elements = d.clone();
    }

    public Vector(int[] i) throws NullPointerException {
        this(Arrays.stream(i).asDoubleStream().toArray());
        
    }
    
    //append methods

    public Vector append(double[] doubleArray) throws NullPointerException, OutOfMemoryError {
        return null;
    }

    public Vector append(int[] intArray) throws NullPointerException, OutOfMemoryError {
        return null;
    }

    public Vector append(Vector V) throws NullPointerException, OutOfMemoryError {
        return null;
    }

    public Vector append(double aDouble) throws OutOfMemoryError {
        return null;
       
    }

    public Vector clone() {
        return new Vector(elements);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Arrays.hashCode(this.elements);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vector other = (Vector) obj;
        if (!Arrays.equals(this.elements, other.elements)) {
            return false;
        }
        return true;
    }


    public int getLength() {//returns number of elements in this
        return elements.length;
    }

    public double getValue(int i) throws IndexOutOfBoundsException {//returns the value this[i]
        return elements[i];
    }

    public Vector add(Vector V) throws NullPointerException {//add this to V, returning a Vector the same size as this
        return null;
    }

    public Vector add(double aDouble)  { //add aDouble to every element of this
        return null;
    }

    public Vector sub(Vector V) throws NullPointerException {//sub this – V
        return null;
    }
    
    public Vector subV(int l, int r) throws IndexOutOfBoundsException {//will return a sub vector between the
        //indices l and r inclusive
        return null;
    }

    public Vector mult(Vector V) throws NullPointerException {//Multiple every element of this by corresponding element in V
        return null;
    }

    public Vector mult(double aDouble) {//Multiply every element of this by aDouble
        return null;
    }

    public Vector Normalize() {//returns this as a normalized vector
        return null;
    }

    public double EuclidianDistance(Vector V) throws NullPointerException {//returns the Euclidian distance between this and V.
        return 0.0;
    }

}
