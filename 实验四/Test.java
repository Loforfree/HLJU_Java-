package 实验四;

public class Test {
    public static void main(String[] args) {
        System.out.println("----------2----------");
        Point p1 = new Point();
        Point p2 = new Point(0,10);
        System.out.println(p1.getX()+" "+p1.getY()+" "+p1.distance(p2));

        System.out.println("----------3----------");
        Circle c1 = new Circle();
        Circle c2 = new Circle(0,0,10);

        System.out.println(c1.getCenter().getX()+" "+c1.getCenter().getY()+ " "+c1.area()+" " +c1.perimeter()+" "+c1.relation(c2));
        if(c1.relation(c2)==1) System.out.println("同心圆");
        else{System.out.println("Pass");}

        System.out.println("----------4----------");
        System.out.println(p1.toString());//p1.toString可以忽略，直接写成p1

        System.out.println("----------5----------");
        System.out.println(c1.toString());

        System.out.println("----------6----------");
        System.out.println(p1.equals(p2));

        System.out.println("----------7----------");
        Point p3=new Point(0,0);
        System.out.println(p1.equals(p3));

        System.out.println("----------8----------");
        Object p4 = new 实验二.Point(0,0);
        System.out.println(p1.equals(p4));

        System.out.println("----------9----------");
        System.out.println(p4.equals(p1));

        System.out.println("----------10----------");
        Circle c3 = new Circle();
        Circle c4 = new Circle(0,0,10);
        System.out.println(c3.equals(c4));

        System.out.println("----------11----------");
        Circle c5 = new Circle(0,0,0);
        System.out.println(c3.equals(c5));

        System.out.println("----------12----------");
        Circle c6 = new Circle();
        Point p6 = new Point(0,0);
        Circle c7 = new Circle(p6,0);
        System.out.println(c6.equals(c7));
        System.out.println(c6.equals(p6));
        System.out.println(p6.equals(c6));

        System.out.println("----------13----------");
        实验二.Point p7 = new 实验二.Point(0,0);
        Circle c8 = new Circle(p7,0);
        System.out.println(c6.equals(c8));

        System.out.println("----------14----------");
        Object c9 =new 实验二.Circle(0,0,0);
        System.out.println(c6.equals(c9));
        System.out.println(c9.equals(c6));
    }
}
