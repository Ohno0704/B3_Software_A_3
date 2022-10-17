public abstract class ShapeCloneable implements Cloneable {

    public ShapeCloneable () {
    }

    abstract void draw(int w, int h);

    @Override
    public ShapeCloneable clone () {
        ShapeCloneable cloned = null;
        try {
            cloned = (ShapeCloneable) super.clone ();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace ();
        }
        return cloned;
    }
}
