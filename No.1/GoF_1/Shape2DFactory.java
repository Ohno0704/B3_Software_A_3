
public class Shape2DFactory extends AbstractShapeFactory {
    ShapeFactory factory = new ShapeFactory();
    @Override
    Shape create(String type, int size[]) {
        return factory.create(type, size[0], size[1]);
    }
}
