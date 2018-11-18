
package assign_2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Alex Zurad, Robbie McDonnell
 */
public class VectorLengthTest {

    @Test
    public void testVectorLengthOf1() {
        
        int expected = 1;
        
        assertEquals("Vector should have of length 1.", expected, (new Vector()).getLength());

    }
    
    @Test
    public void testVectorLengthOf50() {
        
        int expected = 50;
        
        assertEquals("Vector should have of length 50.", expected, (new Vector(50,1)).getLength());

    }

}
