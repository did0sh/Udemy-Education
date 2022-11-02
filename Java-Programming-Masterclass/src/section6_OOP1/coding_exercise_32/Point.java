package section6_OOP1.coding_exercise_32;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(Math.pow((0-x),2) + Math.pow((0-y),2));
    }

    public double distance(int pointX, int pointY){
        return Math.sqrt(Math.pow((x-pointX),2) + Math.pow((y-pointY),2));
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow((x-point.getX()),2) + Math.pow((y-point.getY()),2));
    }
}
