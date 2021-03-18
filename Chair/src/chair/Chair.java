package chair;

public class Chair {

    private String name;
    private String design;
    private String color;
    private double size;
    private double price;

    
    public Chair(String name,String design, String color, double size, double price){
        
        this.name=name;
        this.design=design;
        this.color=color;
        this.size=size;
        this.price=price;
    }
    
    
    //getter setter
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getDesign() {
        return this.design;
    }

    /**
     * 
     * @param design
     */
    public void setDesign(String design) {
        this.design = design;
    }

    public String getColor() {
        return this.color;
    }

    /**
     * 
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return this.size;
    }

    /**
     * 
     * @param size
     */
    public void setSize(double size) {
        this.size = size;
    }
    
   
    //a method which to count price after discount
    public double priceDiscount(double price){
        
        double discount=5;
        double priceTemp = price- discount;
        return priceTemp;
        
    }

}