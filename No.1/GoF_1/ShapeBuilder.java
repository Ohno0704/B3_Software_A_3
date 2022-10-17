public class ShapeBuilder {
    private String shapeType = "ELLIPSE";
    private int width = 10, height = 10;
    private int opt_width = 10, opt_height = 10;

    public Shape build() {
        if(shapeType.equals("ELLIPSE"))
            return new Ellipse(width, height);
        else if(shapeType.equals("RECTANGLE"))
            return new Rectangle(width, height);
        else if(shapeType.equals("TRIANGLE"))
            return new Triangle(width, height);
        else if(shapeType.equals("HOUSE"))
            return new House(width, height, opt_width, opt_height);
        else if(shapeType.equals("HINOMARU"))
            return new Hinomaru(width, height, opt_width); // use opt_width as radius
        else
            return null;
    }

    public void setShapeType (String type) {
        shapeType = type;
    }

    public void setSize(int w, int h) {
        width = w; height = h;
    }

    public void setOptionSize(int w, int h) {
        opt_width = w; opt_height = h;
    }

    public static void main(String args[]) {
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.setShapeType("HOUSE");
        shapeBuilder.setSize(30, 20);
        shapeBuilder.setOptionSize(32, 10);
        Shape house = shapeBuilder.build();
        house.draw(); // call draw method of Ellipse
        shapeBuilder.setShapeType("HINOMARU");
        shapeBuilder.setSize(50, 30);
        shapeBuilder.setOptionSize(10, 10);
        shapeBuilder.build().draw();  // draw Hinomaru
        shapeBuilder.setShapeType("ELLIPSE");
        shapeBuilder.build().draw();  // draw Rectangle with previous setting of size
    }
}
