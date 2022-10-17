public class ShapeFactory {
    // Get object of shapeType
    public Shape create(String shapeType, int w, int h){
        if(shapeType.equals("ELLIPSE"))
            return new Ellipse(w, h);
        else if(shapeType.equals("RECTANGLE"))
            return new Rectangle(w, h);
        else if(shapeType.equals("TRIANGLE"))
            return new Triangle(w, h);
        else
            return null;
    }

    public static void main(String args[]) {
        ShapeFactory shapeFactory = new ShapeFactory();
        // get an object of Ellipse
        Shape shape = shapeFactory.create("ELLIPSE",20, 30);
        shape.draw(); // call draw method of Ellipse
        shapeFactory.create("TRIANGLE", 20, 10).draw();
    }
}
