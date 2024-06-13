package 实验二;

public class three_dimensional {//三维空间的点
    Point p;
    public int z;
    public void set3Point(Point pp,int z){
        this.p = pp;
        this.z = z;
    }
    public double distance(three_dimensional p2){
        int thisx = this.p.getX();
        int thisy = this.p.getY();
        int x2 = p2.p.getX();
        int y2 = p2.p.getY();
        double distance = Math.sqrt((thisx-x2)*(thisx-x2)+(thisy-y2)*(thisy-y2)+(this.z-p2.z)*(this.z-p2.z));
        return distance;
    }
}
