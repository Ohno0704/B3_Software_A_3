import java.util.HashMap;
import java.util.Random;

public class ShapePrototypeFactory {
    HashMap<String, ShapeCloneable> protoMap;

    public ShapePrototypeFactory (){
        protoMap = new HashMap<String, ShapeCloneable>();
        protoMap.put ("RECTANGLE", new RectangleCloneable ());
        protoMap.put ("ELLIPSE", new EllipseCloneable ());
        protoMap.put ("TRIANGLE", new TriangleCloneable ());
    }

    public ShapeCloneable create (String type) {
        return protoMap.get (type).clone ();
    }

    public static void main(String args[]) {
        ShapePrototypeFactory sp_factory = new ShapePrototypeFactory();
        Random rnd = new Random();
        for (int i=0; i<10; i++) {
            int type = rnd.nextInt(3);  // type = 0,1,2
            float width = (float) rnd.nextInt(5) + 1; // width = 1,2,3,4,5
            float height = (float) rnd.nextInt(5) + 1; // height = 1,2,3,4,5
            switch (type) {
                case 0: sp_factory.create("RECTANGLE").draw(width, height); break;
                case 1: sp_factory.create("ELLIPSE").draw(width, height); break;
                case 2: sp_factory.create("TRIANGLE").draw(width, height); break;
            }

        }
    }
}
