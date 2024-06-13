package 实验二;

public class Circle {
    private Point center;
    private double radius;
    private double pi = Math.PI;
    private double di;
    public Circle(){
        this.center = new Point(0,0);
        this.radius=0;
    }
    public Circle(int x,int y,double r){
        this.center = new Point(x,y);
        if(r>=0)this.radius=r;
        else this.radius=0;
    }
    public Circle(Point c,double r){
        //这里要判断传入的点是否为空
        if(c==null)//###
        {
            this.center = new Point();
        }
        else{
            this.center=c;
        }
        if(r>=0){this.radius=r;}
        else {this.radius=0;}
    }

    public int getX(){
        int x = this.center.getX();
        return x;
    }
    public int getY(){
        int y = this.center.getY();
        return y;
    }

    public void setRadius(double r){
        if(r<0){
            return;
        }
        else{
            this.radius=r;
        }
    }

    public void setCenter(Point p){
        if(p==null)
        {
            return;
        }
        this.center.setX(p.getX());
        this.center.setY(p.getY());
    }

    public double getRadius(){
        return this.radius;
    }
    public Point getCenter(){
        return this.center;
    }

    public double perimeter(){
        if(this.radius<=0) {
            return 0;
        }
        else {
            double p=2*pi*(this.radius);
            return p;
        }
    }
    public double area(){
        if(this.radius<=0) {
            return 0;
        }
        else{
            double a = pi*(this.radius)*(this.radius);
            return a;
        }

    }
    public int relation(Circle c){
        di = Math.sqrt((this.center.getX()-c.center.getX())*(this.center.getX()-c.center.getX())+(this.center.getY()-c.center.getY())*(this.center.getY()-c.center.getY()));
        if(this.center.getX()==c.center.getX() && this.center.getY()==c.center.getY() && this.radius==c.radius){
            return 0;//相同的圆
        }
        else if(this.center.getX()==c.center.getX()&&this.center.getY()==c.center.getY()){
            return 1;//同心圆
        }
        else if(di<this.radius+c.radius&&di>Math.abs(this.radius-c.radius)){
            return 2;//相交圆 r1+r2>di && r2-r1<di
        }
        else if(di>=this.radius+c.radius){
/*            if(di==this.radius+c.radius){
                return 6;
            }*/
            return 3;//分离的圆 r1+r2<di
        }
        else if(di<=Math.abs(this.radius-c.radius)){
/*            if(di==Math.abs(this.radius-c.radius)){
                return 5;
            }*/
            return 4;//包含圆r2-r1>di
        }
        else{
            return -1;
        }
    }
}
