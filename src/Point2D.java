public class Point2D {
    private double x;
    private double y;
    public Point2D(){};
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY(){
        double [] newArray= new double[2];
        newArray[0]=x;
        newArray[1]=y;
        return newArray;
    }
    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
