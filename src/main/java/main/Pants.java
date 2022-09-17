package main;

/**
 * @author Michael Ladderbush
 * 
 * The Pants class implements the interfaces Color, Size, Brand and Fit. The class initializes
 * the variables brand, size, color and fit. The constructor "Pants" uses those variables as 
 * parameters for the sake of dependency injection. Following the constructor are the methods
 * used to get each of the variables, those methods call the implemented interfaces.
 */

public class Pants implements Color, Size, Brand, Fit {

    private String brand;
    private String size;
    private String color;
    private String fit;

    /**
     * @param brand is a string variable that represents the brand name of the pants object.
     * @param size is a string variable that represents the size of the pants object.
     * @param color string variable that represents the pants color.
     * @param fit string variable that represents how the pants fit. This is different from the 
     * previous parameters because it is used for testing whether or not the clothing item will
     * fit.
     */
    
    public Pants (String brand, String size, String color, String fit) {

        this.brand = brand;
        this.size = size;
        this.color = color;
        this.fit = fit;

    }

    /**
     *This calls the Brand interfaces abstract method and returns the variable brand.
     * @return
     */
    
    @Override
    public String getBrand() {

        return brand;
    
    }
    
    /**
     *same function as getBrand but for size
     * @return
     */
    
    @Override
    public String getSize() {
    
        return size;
        
    }
    
    /**
     *same as getBrand but for color
     * @return
     */
    
    @Override
    public String getColor() {
    
        return color;

    }

    /**
     *same as getBrand but for fit
     * @return
     */
    
    @Override
    public String getFit() {

        return fit;

    }

}