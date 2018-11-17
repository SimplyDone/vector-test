/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign_2;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Alex Zurad
 */

//add to vector test suite
public class VectorEmptyConstuctorTests {
    
    @Test
    public void testEmptyConstructorNotNull() {
        
        Vector a = new Vector();
        assertNotNull("The defaullt constructor should not be null",a);
    }
    
    @Test
    public void testEmptyConstructorSize() {
        
        Vector a = new Vector();
        assertEquals("Size should be 1.", 1, a.getLength());
        
    }
    
    @Test
    public void testEmptyConstructorValue() {
        
        Vector a = new Vector();
        assertEquals("Value at index zero should be zero.", 0, a.getValue(0), 0);
        
    }
    
}
