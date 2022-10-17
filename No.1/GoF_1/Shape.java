
public abstract class Shape {
    protected int width, height;

    public Shape (int w, int h) {
        width = w;
        height = h;
    }

    abstract void draw();
}
