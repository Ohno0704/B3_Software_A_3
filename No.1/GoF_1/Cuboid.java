public class Cuboid extends Shape {
    float depth;
    public Cuboid(int w, int h, int d) {
        super(w, h);
        depth = d;
    }

    @Override
    public void draw() {
        System.out.println("Draw Cuboid of "
                + String.valueOf(width) + " X " + String.valueOf(height) + " X " + String.valueOf(depth));
    }
}
