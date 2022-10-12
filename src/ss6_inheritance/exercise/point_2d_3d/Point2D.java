package ss6_inheritance.exercise.point_2d_3d;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f ;

    public Point2D() {
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXy() {
        float[] arrXy = {this.x,this.y};
        return arrXy;
    }

    public void setXy(float x,float y) {
        this.y = y;
        this.x = x ;
    }
    @Override
    public String toString() {
        return "point2d " +
                "arrXY= " + this.x +" , "+ this.y + "  , "+
                "x=" + x +
                ", y=" + y ;
    }
}
