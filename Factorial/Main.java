package Factorial;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        Factorial fact = new Factorial();
        System.out.println("请输入一个数字，程序将为您计算它的阶乘：");
        i = scanner.nextInt();
        System.out.println("非递归法求阶乘为：" + i + "! = " + fact.factorial1(i));
        System.out.println("递归法求阶乘为：" + i + "! = " + fact.factorial2(i));
        System.out.println("大数求阶乘为：" + i + "! = " + FactorialLarge.factorial2(i));
    }
}

