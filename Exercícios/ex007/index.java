package ex007;

public class index {
public static class Rectangle {
    //attributes
    double height;

    double length;
    //Constructor method if the attribute "initialLenght" isn't specified 

    Rectangle (double initialHeight){
        this.height = initialHeight;
        this.length = 10.0;
    }

    //Default constructor method 
    Rectangle (double initialHeight, double initialLength){
        this.height = initialHeight;
        this.length = initialLength;
    }

    //Method for calculating the area of the rectangle
    double calcArea(){
        return height * length;
    }
    
}

public static void main(String[] args) {
    System.out.println("Welcome to the rectangles place!");
    Rectangle rectangle1 = new Rectangle(12.5);

    System.out.println("This is your area: " + rectangle1.calcArea());
}

}