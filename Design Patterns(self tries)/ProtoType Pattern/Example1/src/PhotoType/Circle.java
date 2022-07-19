package PhotoType;

public class Circle extends Shape{
    public Circle(){
        type="Circle";
    }
    @Override
    void draw() {
        System.out.println("This is Circle.");
    }
}
