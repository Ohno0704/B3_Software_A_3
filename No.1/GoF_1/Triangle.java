
public class Triangle extends Shape {
    public Triangle(int w, int h) {
        super(w, h);
    }

    @Override
    public void draw() {
        System.out.println("Draw Triangle of "
                + String.valueOf(width) + " X " + String.valueOf(height));
    }
}
