package 实验二;

public class Main {
    public static void main(String[] args){

        Test t = new Test();

        // 1
        System.out.println("测试点1>>");
        Point p1 = new Point();//不传具体值默认是(0,0)
        Point p2 = new Point(0,3);
        t.testDistance(p1,p2);

        //2
        System.out.println("测试点2>>");
        Circle c1 = new Circle();
        t.testCircle(c1);

        //3
        System.out.println("测试点3>>");
        Circle c2 = new Circle(1,1,10);
        t.testCircle(c2);

        //4
        System.out.println("测试点4>>");
        Circle c3 = new Circle(1,1,-1);
        t.testCircle(c3);

        //5
        System.out.println("测试点5>>");
        Point p3 = new Point(1,1);
        Circle c4 = new Circle(p3,10);
        t.testCircle(c4);

        //6
        System.out.println("测试点6>>");
        Point p4 = new Point(1,1);
        Circle c5 = new Circle(p4,-1);
        t.testCircle(c5);

        //7
        System.out.println("测试点7>>");
        Circle c6 = new Circle(null,10);
        t.testCircle(c6);

        //8
        System.out.println("测试点8>>");
        Point pp = new Point(1,1);
        t.test_changePointXY(pp,10,10);//后两个参数是要更改成的x,y的值

        //9
        System.out.println("测试点9>>");
        Circle cc = new Circle(null,10);
        t.test_changeRadius(cc,20);//第二个参数是更改后的r值

        //10
        System.out.println("测试点10>>");
        t.test_changeRadius(cc,-20);

        //11
        System.out.println("测试点11>>");
        t.test_preCircleXY(cc);
        cc.setCenter(new Point(20,20));
        t.test_changeCircleXY(cc);

        //12
        System.out.println("测试点12>>");
        t.test_preCircleXY(cc);
        cc.setCenter(null);
        t.test_changeCircleXY(cc);

        //13
        System.out.println("测试点13>>");
        Circle cc1 = new Circle();
        Circle cc2 = new Circle(0,0,0);
        t.testRelation(cc1,cc2);

        //14
        System.out.println("测试点14>>");
        Circle cc3 = new Circle();
        Circle cc4 = new Circle(0,0,1);
        t.testRelation(cc3,cc4);

        //15
        System.out.println("测试点15>>");
        Circle cc5 = new Circle(0,0,10);
        Circle cc6 = new Circle(1,1,5);
        t.testRelation(cc5,cc6);

        //16
        System.out.println("测试点16>>");
        Circle cc7 = new Circle(0,0,10);
        Circle cc8 = new Circle(0,5,10);
        t.testRelation(cc7,cc8);

        //17
        System.out.println("测试点17>>");
        Circle cc9 = new Circle(0,0,10);
        Circle cc10 = new Circle(0,20,10);
        t.testRelation(cc9,cc10);

        //思考题4测试
        System.out.println("思考题4测试>>");
        Point ppp1 = new Point(0,0);
        Point ppp2 = new Point(1,1);
        three_dimensional three1 = new three_dimensional();
        three_dimensional three2 = new three_dimensional();
        three1.set3Point(ppp1,0);
        three2.set3Point(ppp2,1);

        System.out.printf("Distance:%.3f",three2.distance(three1));
    }
}
