package isp.lab3.exercise4;

import static java.lang.Math.abs;

public class MyPoint {
    private int x;
    private int y;
    private int z;

    public MyPoint(){
        this.x=0; this.y=0; this.z=0;
    }

    public MyPoint(int x,int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setXYZ(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public int distance(int x, int y, int z){
       int dist=(abs(this.x-x) + abs(this.y-y)+ abs(this.z-z));
       return dist;
    }

    public int distance(MyPoint another){
        int dist=(abs(this.x-another.x) + abs(this.y-another.y)+ abs(this.z-another.z));
        return dist;
    }
}
