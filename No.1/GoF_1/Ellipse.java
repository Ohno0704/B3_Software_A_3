
public class Ellipse extends Shape {
    public Ellipse(int w, int h) {
        super(w, h);
    }

    @Override
    public void draw() {
        System.out.println("Draw Ellipse of "
                + String.valueOf(width) + " X " + String.valueOf(height));
    }
}
