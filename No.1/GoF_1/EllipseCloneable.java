public class EllipseCloneable extends ShapeCloneable {
    public EllipseCloneable() {
        super();
    }

    @Override
    public void draw(int w, int h) {
        System.out.println("Draw Ellipse of "
                + String.valueOf(w) + " X " + String.valueOf(h));
    }
}
