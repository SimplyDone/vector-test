
package assign_2;

import java.util.Arrays;

/**
 *
 * @author Alex Zurad
 */
public class Vector {

    private double[] elements;

    public Vector() {
        
    }

    public Vector(int size, double d) {
        
    }

    public Vector(double[] d) {

    }

    public Vector(int[] i) {

    }
    
    //append methods

    public Vector append(double[] doubleArray) {
        return null;
    }

    public Vector append(int[] intArray) {
        return null;
    }

    public Vector append(Vector V) {
        return null;
    }

    public Vector append(double aDouble) {
        return null;
    }

    public Vector clone() {
        return null;
    }

    public boolean equal(Vector V) { //this and V are the same
        return false;
    }

    public int getLength() {//returns number of elements in this
        return 0;
    }

    public double getValue(int i) {//returns the value this[i]
        return 0.0;
    }

    public Vector add(Vector V) {//add this to V, returning a Vector the same size as this
        return null;
    }

    public Vector add(double aDouble) { //add aDouble to every element of this
        return null;
    }

    public Vector sub(Vector V) {//sub this – V
        return null;
    }

    public Vector subV(int l, int r) {//will return a sub vector between the
        //indices l and r inclusive
        return null;
    }

    public Vector Mult(Vector V) {//Multiple every element of this by corresponding element in V
        return null;
    }

    public Vector Mult(double aDouble) {//Multiply every element of this by aDouble
        return null;
    }

    public Vector Normalize() {//returns this as a normalized vector
        return null;
    }

    public double EuclidianDistance(Vector V) {//returns the Euclidian distance between this and V.
        return 0.0;
    }

}
