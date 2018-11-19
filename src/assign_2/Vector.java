package assign_2;

import java.util.Arrays;

/** @version 4.0
 * 
 *  @author Alex Zurad, Robbie McDonnell
 */

public class Vector {

    private double[] elements;

    /**
     *  Creates a vector of size 1 with an initial value of 0.
     */
    public Vector() {
        this(1, 0);

    }

    /** Creates a vector with a specified size and initial value
     * 
     * @param size The size of the vector
     * @param d The value of every element in the vector
     * @throws IllegalArgumentException When size <= 0
     */
    public Vector(int size, double d) throws IllegalArgumentException {

        if (size <= 0) {
            throw new IllegalArgumentException("Vector size cannot be 0 or less.");
        }

        elements = new double[size];
        Arrays.fill(elements, d);

    }

    /** Creates a vector from an array of doubles.
     * 
     * @param d The double array
     * @throws NullPointerException When array is null
     * @throws IllegalArgumentException When length of array is 0
     */
    public Vector(double[] d) throws NullPointerException, IllegalArgumentException {

        if (d == null) {
            throw new NullPointerException("Input array cannot be null!");
        } else if (d.length == 0) {
            throw new IllegalArgumentException("Input array cannot be zero.");
        }

        elements = d.clone();
    }

    /** Creates a vector from an array of integers.
     * 
     * @param i The integer array
     * @throws NullPointerException When array is null
     * @throws IllegalArgumentException When length of array is 0
     */
    public Vector(int[] i) throws NullPointerException, IllegalArgumentException {
        this(Arrays.stream(i).asDoubleStream().toArray());

    }

    public Vector append(double[] doubleArray) throws NullPointerException {
        
        return append(new Vector(doubleArray));
    }

    public Vector append(int[] intArray) throws NullPointerException {
        return append(new Vector(intArray));
    }

    public Vector append(Vector v) throws NullPointerException {
        
        Vector appended = new Vector(this.getLength() + v.getLength(), 0.0);
        
        appended = appended.add(this);
        
        for(int i = this.getLength(); i<appended.getLength(); i++){
            appended.elements[i] = v.elements[i-this.getLength()];
        }
        
        return appended;
    }

    public Vector append(double aDouble) {
        return append(new Vector(1, aDouble));

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

    public Vector add(Vector v) throws NullPointerException {//add this to V, returning a Vector the same size as this

        int len = this.getLength();

        Vector vectorSum = new Vector(len, 0.0);

        for (int q = 0; q < len; q++) {
            vectorSum.elements[q] += this.elements[q];
        }

        if (len >= v.getLength()) {
            len = v.getLength();
        }

        for (int w = 0; w < len; w++) {
            vectorSum.elements[w] += v.elements[w];
        }
        return vectorSum;
    }

    public Vector add(double aDouble) { //add aDouble to every element of this

        int len = this.getLength();
        Vector vectorSum = new Vector(len, 0.0);

        for (int q = 0; q < len; q++) {
            vectorSum.elements[q] = aDouble + this.elements[q];
        }

        return vectorSum;
    }

    public Vector sub(Vector v) throws NullPointerException {//sub this – V

        int len = this.getLength();

        Vector vectorSub = new Vector(len, 0.0);

        for (int q = 0; q < len; q++) {
            vectorSub.elements[q] += this.elements[q];
        }

        if (len >= v.getLength()) {
            len = v.getLength();
        }

        for (int w = 0; w < len; w++) {
            vectorSub.elements[w] -= v.elements[w];
        }
        return vectorSub;

    }

    public Vector subV(int l, int r) throws IndexOutOfBoundsException {//will return a sub vector between the

        int lower = Math.min(l, r);
        int diff = Math.abs(l-r);
        
        double[] d = new double[diff + 1];
        
        
        for(int i = 0; i <= diff; i++){
            d[i] = elements[i + lower];
            
        }
        
        return new Vector(d);
    }

    public Vector mult(Vector v) throws NullPointerException {//Multiple every element of this by corresponding element in V

        int len = this.getLength();

        Vector vectorMult = new Vector(len, 0.0);

        for (int q = 0; q < len; q++) {
            vectorMult.elements[q] = this.elements[q];
        }

        if (len >= v.getLength()) {
            len = v.getLength();
        }

        for (int w = 0; w < len; w++) {
            vectorMult.elements[w] *= v.elements[w];
            if (vectorMult.elements[w] == -0.0) {
                vectorMult.elements[w] = 0.0;
            }
        }
        return vectorMult;
    }

    public Vector mult(double aDouble) {//Multiply every element of this by aDouble

        int len = this.getLength();
        Vector vectorMult = new Vector(len, 1);

        for (int q = 0; q < len; q++) {
            vectorMult.elements[q] = this.elements[q] * aDouble;
        }

        return vectorMult;

    }

    public Vector Normalize() {//returns this as a normalized vector

        double[] newElements = new double[elements.length];

        boolean allZero = true;

        for (double i : elements) {
            if (i != 0) {
                allZero = false;
            }
        }

        if (allZero) {
            return this.clone();
        }

        double length = 0;

        for (int i = 0; i < getLength(); i++) {
            length += Math.pow(elements[i], 2);
        }

        length = Math.sqrt(length);

        for (int i = 0; i < getLength(); i++) {
            newElements[i] = elements[i] / length;
        }

        return new Vector(newElements);

    }

    public double EuclidianDistance(Vector v) throws NullPointerException {//returns the Euclidian distance between this and V.

        if (v == null) {
            throw new NullPointerException("Vector cannot be null!");
        }

        double[] elems = new double[Math.max(this.getLength(), v.getLength())];
        double length = 0;

        if (this.getLength() > v.getLength()) {

            for (int i = 0; i < v.getLength(); i++) {
                elems[i] = v.getValue(i);
            }

            for (int i = 0; i < elems.length; i++) {
                length += Math.pow(this.getValue(i) - elems[i], 2);
            }

        } else if (this.getLength() <= v.getLength()) {

            for (int i = 0; i < this.getLength(); i++) {
                elems[i] = this.getValue(i);
            }

            for (int i = 0; i < elems.length; i++) {
                length += Math.pow(v.getValue(i) - elems[i], 2);
            }

        }

        length = Math.sqrt(length);

        return length;
    }

}
