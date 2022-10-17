public class ShapeDirector {
    private final ShapeBuilder shapeBuilder;

    public ShapeDirector () {
        shapeBuilder = new ShapeBuilder();
    }

    public Shape construct(String shapeType, int size[]){
        shapeBuilder.setShapeType(shapeType);
        if(shapeType.equals("ELLIPSE") || shapeType.equals("RECTANGLE"))
            shapeBuilder.setSize(size[0], size[1]);
        else if (shapeType.equals("HOUSE")) {
            shapeBuilder.setSize(size[0], size[1]);
            shapeBuilder.setOptionSize(size[2], size[3]);
        }
        else if (shapeType.equals("HINOMARU")) {
            shapeBuilder.setSize(size[0], size[1]);
            shapeBuilder.setOptionSize(size[2], 0);  // we don't use size[3] !
        }
        else
            return null;
        return shapeBuilder.build();
    }

    public static void main(String args[]) {
        ShapeDirector shapeDirector = new ShapeDirector();
        int size4[] = {20, 30, 22, 10};
        shapeDirector.construct("HOUSE", size4).draw();
        int size3[] = {50, 30, 10};
        shapeDirector.construct("HINOMARU", size3).draw();
    }
}
