package 实验三;
import 实验二.Circle;
import 实验二.Point;

public class Color {
    private int red;
    private int green;
    private int blue;

    //默认构造方法
    public Color() {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }

    //获取到色彩对象时的构造方法
    public Color(Color a) {
        if (a == null) {
            this.red = 0;
            this.green = 0;
            this.blue = 0;
            return;
        }
        this.red = a.getRed();
        this.green = a.getGreen();
        this.blue = a.getBlue();
    }

    //获取到值的构造方法
    public Color(int r, int g, int b) {
        if(r>=0&&r<=255)this.red = r;
        else{this.red=0;}

        if(g>=0&&g<=255)this.green = g;
        else{this.green=0;}

        if(b>=0&&b<=255)this.blue = b;
        else{this.blue=0;}
    }

    //设置红色变量值
    public void setRed(int v) {
        if(v >= 0 && v <= 255) {
            this.red = v;
        } else {
            System.out.println("Invalid red value");
        }
    }

    //设置绿色变量值
    public void setGreen(int v) {
        if(v >= 0 && v <= 255) {
            this.green = v;
        } else {
            System.out.println("Invalid green value");
        }
    }

    //设置蓝色变量值
    public void setBlue(int v) {
        if(v >= 0 && v <= 255) {
            this.blue = v;
        } else {
            System.out.println("Invalid blue value");
        }
    }

    //获取rgb变量值
    public int getRed() {
        return red;
    }
    public int getGreen() {
        return green;
    }
    public int getBlue() {
        return blue;
    }
}
