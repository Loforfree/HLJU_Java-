package 实验五;

import java.util.Random;

public class MatrixTest {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("---------7---------");
        try{
            Matrix m1 = new Matrix(2,3);
            System.out.println(m1.toString());
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }

        System.out.println("---------8---------");
        double mm[][] = new double[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mm[i][j]=random.nextInt(9)+1;
            }
        }
        Matrix m = new Matrix(mm);
        System.out.println(m.toString());

        System.out.println("---------9---------");
        try{
            Matrix m3 = new Matrix(0,3);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }


        System.out.println("---------10---------");
        Matrix m4 = new Matrix(null);

        System.out.println("---------11---------");
        System.out.println(m.getCols());

        System.out.println("---------12---------");
        System.out.println(m.getRows());

        System.out.println("---------13---------");

        System.out.println(m.getData(0,0));

        System.out.println("---------14---------");
        m.setData(0,0,10);
        System.out.println(m);

        System.out.println("---------15---------");
        m.getData(-1,0);
        m.getData(3,0);
       // System.out.println(m.getRows());

        System.out.println("---------16---------");
        m.setData(0,-1);
        m.setData(0,m.getCols());

        System.out.println("---------17---------");
        m.multiply(m);
        System.out.println(m.toString());

        System.out.println("---------18---------");
        m.multiply(null);

        System.out.println("---------19---------");
        double mmm[][]= new double[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                mmm[i][j]=random.nextInt(9)+1;
            }
        }
        Matrix m2 = new Matrix(mmm);
        m.multiply(m2);

        System.out.println("---------20---------");
        System.out.println(m2.toString());
        //添加数组相加方法

        //Matrix类中不定义row和col成员变量：可以通过矩阵的数据数组直接获取行数和列数，这样可以确保每次获取的值都是最新和准确的，不用每次都更新；

        //构造方法的职责是初始化对象的状态，而不应包括复杂的逻辑或操作（如生成随机数），这违反了单一职责原则

    }
}
