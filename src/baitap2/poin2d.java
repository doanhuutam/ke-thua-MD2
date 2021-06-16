package baitap2;

public class poin2d {
    private float x;
    private float y;

    public poin2d() {
    }

    public poin2d(float x, float y) {
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

    public float[] getXY() {
        float arr[] = {getX(), getY()};
        return arr;
    }

    public void setXY(float X, float Y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "poin2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Poid3d extends poin2d{
    private float z;


    public Poid3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Poid3d() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float [] arr={getX(),getY(),getZ()};
        return arr;
    }
    public void setXYZ(float X, float Y,float Z) {
        this.z =z;
        setX(X);
        setY(Y);
    }

    @Override
    public String toString() {
        return "Poid3d{" +
                "z=" + z +
                '}' + super.toString();
    }
}
class Test{
    public static void main(String[] args) {
        poin2d ahihi=new poin2d();
        ahihi =new poin2d();
        System.out.println(ahihi);
        ahihi=new poin2d(12,3);
        System.out.println(ahihi);
        Poid3d dongoc=new Poid3d();
        dongoc = new Poid3d(1,3,3);
        System.out.println(dongoc);
        dongoc = new Poid3d();
        System.out.println(dongoc);
        }
    }

