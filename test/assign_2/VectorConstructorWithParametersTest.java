
package assign_2;

import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/**
 *
 * @author Alex Zurad, Robbie McDonnell
 */
public class VectorConstructorWithParametersTest {
    
    @Test
    public void testDoubleArrayConstructor() {
        
        double[] expected = {1,2,3,4,5};
        double[] result = new double[expected.length];
        
        Vector test = new Vector(expected);
        
        for(int i = 0; i < expected.length; i++){
            result[i] = test.getValue(i);
        }
        
        assertArrayEquals("Vector created should equal expected.", expected, result, 0);
        
    }
    
    @Test
    public void testIntArrayConstructor() {
        
        int[] a = {1,2,3,4,5};
        double[] expected = Arrays.stream(a).asDoubleStream().toArray();
        double[] result = new double[a.length];
        
        Vector test = new Vector(a);
        
        for(int i = 0; i < a.length; i++){
            result[i] = test.getValue(i);
        }
        
        assertArrayEquals("Vector created should equal expected.", expected, result, 0);
        
    }
    
    @Test
    public void testInitalValueConstructor() {
        
        int size = 5;
        double initialValue = 2;
   
        double[] expected = new double[size];
        Arrays.fill(expected, initialValue);
        
        double[] result = new double[size];
        
        Vector test = new Vector(size, initialValue);
        
        for(int i = 0; i < size; i++){
            result[i] = test.getValue(i);
        }
        
        assertArrayEquals("Vector created should equal expected.",expected, result, 0);
        
    }
}
