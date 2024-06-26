public class Oblong {
    // the attributes
    private double length;
    private double height;
  
    // the methods
    // the constructor
    public Oblong(double lengthIn, double heightIn) {
        length = lengthIn;
        height = heightIn;
    }
    // this method allows us to read the
    public double getLength() {
        return length;
    }
    // this method allows us to read the
    public double getHeight() {
        return height;
    }
    // this method allows us to write to
    public void setLength(double lengthIn) {
        length = lengthIn;
    }
    // this method allows us to write to
    public void setHeight(double heightIn) {
        height = heightIn;
    }
  
    // this method returns the area of the Oblong
    public double calculateArea() {
        return length * height;
    }
    // this method returns the perimeter of the Oblong
    public double calculatePerimeter() {
        return 2 * (length + height);
    }
}
