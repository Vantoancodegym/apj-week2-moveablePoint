public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint(10,14,2,5);
        moveablePoint.move();
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
