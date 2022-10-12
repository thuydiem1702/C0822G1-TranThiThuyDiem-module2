package ss6_inheritance.exercise.point_2d_3d;

public class Point3D extends Point2D {
    protected float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXyz() {
        float []arrXyz = {this.x,this.y,this.z};
        return arrXyz;
    }

    public void setXyz(float x,float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D " +
                "x=" + x +
                ", y=" + y +
                ", z=" + z ;
    }
}
