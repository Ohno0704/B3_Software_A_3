public class Shape3DFactory extends AbstractShapeFactory {
    @Override
    Shape create(String type, int size[]) {
        if(type.equalsIgnoreCase("CUBOID"))
            return new Cuboid(size[0], size[1], size[2]);
        else
            return null;
    }

    public static void main(String args[]) {
        Shape2DFactory shape2DFactory = new Shape2DFactory();
        int size_2d[] = {30, 20};
        shape2DFactory.create("RECTANGLE", size_2d).draw();
        Shape3DFactory shape3DFactory = new Shape3DFactory();
        int size_3d[] = {30, 10, 20};
        shape3DFactory.create("CUBOID", size_3d).draw();
    }
}
