package 实验二;

public class Test {
    public void testRelation(Circle c1,Circle c2){
        if(c1.relation(c2)==0){
            System.out.println("同一圆\n");
        }
        else if(c1.relation(c2)==1){
            System.out.println("同心圆\n");
        }
        else if(c1.relation(c2)==2){
            System.out.println("相交的圆\n");
        }
        else if(c1.relation(c2)==3){
            System.out.println("分离的圆\n");
        }
        else if(c1.relation(c2)==4){
            System.out.println("包含的圆\n");
        }
        else if(c1.relation(c2)==5){
            System.out.println("内切圆\n");
        }
        else if(c1.relation(c2)==6){
            System.out.println("外切圆\n");
        }
        else {
            System.out.println("无法判断\n");
        }
    }
    public void testDistance(Point p1,Point p2){
        System.out.printf("两点的距离是:%.3f\n\n",p1.distance(p2));
    }

    public void testCircle(Circle c){
        System.out.printf("圆心是(%d,%d)\n",c.getX(),c.getY());
        System.out.printf("面积是:%.3f\n",c.area());
        System.out.printf("周长是:%.3f\n\n",c.perimeter());
    }

    public void test_changePointXY(Point p,int x,int y){
        System.out.printf("初始:(%d,%d)\n",p.getX(),p.getY());
        p.setX(x);
        p.setY(y);
        System.out.printf("更改后:(%d,%d)\n\n",p.getX(),p.getY());
    }
    public void test_preCircleXY(Circle c){
        System.out.printf("初始:(%d,%d)\n",c.getX(),c.getY());
    }

    public void test_changeCircleXY(Circle c){
        System.out.printf("更改后:(%d,%d)\n\n",c.getX(),c.getY());
    }

    public void test_changeRadius(Circle c,int r){
        System.out.printf("初始半径:%f\n",c.getRadius());
        c.setRadius(r);
        System.out.printf("更改后的半径:%f\n\n",c.getRadius());
    }


    public static void select(int b) {
        if (b == 0) {
            System.out.println("同一个圆");
        } else if (b == 1) {
            System.out.println("同心圆");
        } else if (b == 2) {
            System.out.println("相交的圆");
        } else if (b == 3) {
            System.out.println("分离的圆");
        } else if (b == 4) {
            System.out.println("包含的圆");
        }
    }
}
