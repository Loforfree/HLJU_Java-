package 实验四;
public class Point extends 实验二.Point {
    public Point(int x,int y){
        super(x,y);
    }
    public Point(){
        super();
    }
    @Override
    public boolean equals(Object obj) {//上溯
        if(obj instanceof 实验二.Point){
            实验二.Point p = (实验二.Point)obj;
            return p.getX()==getX()&&p.getY()==getY();
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "("+getX()+","+getY()+")";
    }
}
