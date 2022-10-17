
public class House extends Shape {
    protected int roof_width, roof_height;

    public House (int w, int h, int rw, int rh) {
        super(w, h);
        roof_width = rw;
        roof_height = rh;
    }

    @Override
    public void draw() {
        System.out.println("Draw House of "
                + String.valueOf(width) + " X " + String.valueOf(height)
                + " with roof of " + String.valueOf(roof_width) + " X "
                + String.valueOf(roof_height));
    }
}
