package baitap3;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
    float arr[]={getxSpeed(),getySpeed()};
            return arr;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}'+super.toString();
    }
    public MoveablePoint move(float x,float y){
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }
}
class Test{
    public static void main(String[] args) {
        Point ahi=new Point();
                ahi=new Point(1,2);
        System.out.println(ahi);
                MoveablePoint don=new MoveablePoint();
                don=new MoveablePoint(4,5,6,7);
        System.out.println(don);
    }
}


