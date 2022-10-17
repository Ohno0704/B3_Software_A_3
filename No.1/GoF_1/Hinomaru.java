public class Hinomaru extends Shape {
    protected int radius;  // radius of inner circle

    public Hinomaru (int w, int h, int rad) {
        super(w, h);
        radius = rad;
    }

    @Override
    public void draw() {
        System.out.println("Draw Hinomaru of "
                + String.valueOf(width) + " X " + String.valueOf(height)
                + " with circle of " + String.valueOf(radius));
    }
}
