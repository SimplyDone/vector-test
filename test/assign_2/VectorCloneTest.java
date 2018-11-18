
package assign_2;


import org.junit.Test;
import static org.junit.Assert.*;

/** 
 *
 * @author Alex Zurad
 */
public class VectorCloneTest {

    @Test
    public void testCloneNotNull() {
        
        Vector a = new Vector(new double[] {1,2,3});
        Vector b = a.clone();
        
        assertNotNull("The cloned vector should not be null.",b);
    }
    
    @Test
    public void testCloneIsIndependent() {
        
        Vector a = new Vector(new double[] {1,2,3});
        Vector b = a.clone();
        
        a.add(1);
        
        assertNotEquals("Modifing the original vector should not affect its clone.", a, b );
    }
}
