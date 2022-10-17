
public class Rectangle extends Shape {
    public Rectangle(int w, int h) {
        super(w, h);
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle of "
                + String.valueOf(width) + " X " + String.valueOf(height));
    }
}
