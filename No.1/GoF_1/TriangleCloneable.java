public class TriangleCloneable extends ShapeCloneable {
    public TriangleCloneable() {
        super();
    }

    @Override
    public void draw(int w, int h) {
        System.out.println("Draw Triangle of "
                + String.valueOf(w) + " X " + String.valueOf(h));
    }
}
