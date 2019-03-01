public class Point2d {
    private float x = 1;
    private float y = 1;


    public Point2d() {

    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x){
        this.x=x;
    }

    public float getX(){
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setXY(float X, float Y){
        this.x=x;
        this.y=y;
    }

//    public float getXY(){
//        arr[0]=this.x;
//        arr[1]=this.y;
//        return this.arr;
//    }

    @Override
    public String toString(){
        return "with x= "+getX()+" and with y= "+getY()+" we have point 2d";
    }
}
