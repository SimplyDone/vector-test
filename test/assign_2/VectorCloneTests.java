/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign_2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex Zurad
 */
public class VectorCloneTests {

    @Test
    public void testCloneNotNull() {
        
        Vector a = new Vector(new double[] {1,2,3});
        Vector b = a.clone();
        
        assertNotNull(b);
    }
    
    @Test
    public void testCloneIsIndependent() {
        
        Vector a = new Vector(new double[] {1,2,3});
        Vector b = a.clone();
        
        a.add(1);
        
        assertNotEquals("The vectors should not be equal.", a, b );
    }
}
