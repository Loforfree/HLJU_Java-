package 实验四;

import 实验二.Point;

public class Circle extends 实验二.Circle {
    private 实验四.Point center;
    public Circle(){
        super();
    }
    public Circle(int x,int y,double r){
        super(x,y,r);
    }
    public Circle(实验二.Point c, double r){
        super(c,r);
    }
    @Override
    public boolean equals(Object obj) {//上转
        if(obj instanceof 实验二.Circle){
            实验二.Circle c = (实验二.Circle) obj;//下转型
            //return getCenter().equals(c.getCenter())&&c.getRadius()==getRadius();
            return getCenter().getX()==c.getCenter().getX()&&getCenter().getY()==c.getCenter().getY()
                    &&c.getRadius()==getRadius();
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "("+getX()+","+getY()+")"+" "+getRadius();
    }
}
