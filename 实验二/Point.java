package 实验二;

public class Point {
    private int x,y,dis;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        this.x=0;
        this.y=0;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public static double Distance(Point p1,Point p2){
        int a = p2.x - p1.x;
        int b = p2.y - p1.y;
        double c = a*a+b*b;
        return Math.sqrt(c);
    }
    public double distance(Point p){
        int a = p.x - this.x;
        int b = p.y - this.y;
        double c = a*a+b*b;
        return Math.sqrt(c);
    }
}
