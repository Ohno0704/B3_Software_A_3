public class RectangleCloneable extends ShapeCloneable {
    public RectangleCloneable () {
        super();
    }

    @Override
    public void draw(int w, int h) {
        System.out.println("Draw Rectangle of "
                + String.valueOf(w) + " X " + String.valueOf(h));
    }
}
