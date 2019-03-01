public class Point3d extends Point2d {
    private float z = 0;

    public Point3d() {

    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.setZ(z);
    }

    @Override

    public String toString() {
        return "x= " + getX() + " y= " + getY() + "z= " + getZ();
    }

}

