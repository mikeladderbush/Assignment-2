package test;

import main.Top;
import main.Pants;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

/**
 * @author Michael Ladderbush
 * 
 * This is my file to test that the construction of Top and Pants work properly. It also 
 * tests a method that determines whether the pants or top are the correct size. 
 * variables for color, brand, size and fit are initialized before any tests are run.
 */

public class outfitTest {

    private String color;
    private String brand;
    private String size;
    private String fit;

    /**
     *@Before is where variables are assigned so that later tests can use the string values.
     */
    
    @Before
    public void setup() {
        
        color = "Blue";
        brand = "Nike";
        size = "XL";
        
    }
    
    /**
     * this test makes sure that the Top class correctly creates a new object and that the 
     * variables are taken from the correct interfaces.
     */
    
    @Test
    public void testTopConstruction() {

        Top top = new Top(brand, size, color, fit);

        assertEquals(top.getColor(), color);
        assertEquals(top.getBrand(), brand);
        assertEquals(top.getSize(), size);

    }

    /**
     * this test makes sure that the Pants class correctly creates a new object and that the 
     * variables are taken from the correct interfaces.
     */
    
    @Test
    public void testPantsConstruction() {

        Pants pants = new Pants(brand, size, color, fit);

        assertEquals(pants.getColor(), color);
        assertEquals(pants.getBrand(), brand);
        assertEquals(pants.getSize(), size);

    }

    /**
     *This test is used to compare two parameters of an object and return a message if they are the
     * same.
     */
    
    @Test
    public void testTopDoesntFit() {

        Top top = new Top(brand, size, color, fit);
        
        assertNotEquals("Top is too tight", top.getSize(), top.getFit());
        
    }

    /**
     *This test is used to compare two parameters of an object and return a message if they are the
     * same.
     */
    
    @Test
    public void testPantsDontFit() {

        Pants pants = new Pants(brand, size, color, fit);
        assertNotEquals("Pants are too tight", pants.getSize(), pants.getFit());

    }

}
