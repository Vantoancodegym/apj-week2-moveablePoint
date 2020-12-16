public class MoveablePoint extends Point2D {
    private double x_speed;
    private double y_speed;
    public MoveablePoint(){};

    public MoveablePoint(double x, double y, double x_speed, double y_speed) {
        super(x, y);
        this.x_speed = x_speed;
        this.y_speed = y_speed;
    }

    public double getX_speed() {
        return x_speed;
    }

    public double getY_speed() {
        return y_speed;
    }

    public void setX_speed(double x_speed) {
        this.x_speed = x_speed;
    }

    public void setY_speed(double y_speed) {
        this.y_speed = y_speed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +" x = "+this.getXY()[0]+" y= "+this.getXY()[1]+
                " x_speed=" + x_speed +
                ", y_speed=" + y_speed +
                '}';
    }
    public void move(){
        double x = this.getXY()[0]+x_speed;
        double y = this.getXY()[1]+y_speed;
        this.setX(x);
        this.setY(y);
    }
}
