/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign_2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Alex Zurad
 */
public class VectorLengthTest {

    @Test
    public void testVectorLengthOf1() {
        
        assertEquals("Vector should be of length 1.", 1, (new Vector()).getLength());

    }
    
    @Test
    public void testVectorLengthOf50() {
        
        assertEquals("Vector should be of length 50.", 50, (new Vector(50,1)).getLength());

    }

}
