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
public class VectorLengthTests {

    @Test
    public void testVectorLengthOf1() {
        
        int expected = 1;
        
        assertEquals("Vector should be of length 1.", expected, (new Vector()).getLength());

    }
    
    @Test
    public void testVectorLengthOf50() {
        
        int expected = 50;
        
        assertEquals("Vector should be of length 50.", expected, (new Vector(50,1)).getLength());

    }

}
