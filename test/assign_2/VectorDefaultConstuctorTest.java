
package assign_2;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Alex Zurad, Robbie McDonnell
 */

public class VectorDefaultConstuctorTest {
    
    @Test
    public void testDefaultConstructorNotNull() {
        
        Vector a = new Vector();
        assertNotNull("The default constructor should not be null",a);
    }
    
    @Test
    public void testDefaultConstructorSizeIs1() {
        
        Vector a = new Vector();
        assertEquals("The size of the vector created should be 1.", 1, a.getLength());
        
    }
    
    @Test
    public void testDefaultConstructorValueIs0() {
        
        Vector a = new Vector();
        assertEquals("The value at index 0 should be 0.", 0, a.getValue(0), 0);
        
    }
    
}
