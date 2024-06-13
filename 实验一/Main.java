package 实验一;
import Factorial.*;

import Factorial.Factorial;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println(jie);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("选择1运行乘法表 选择2运行阶乘>>");
        int choose = scanner.nextInt();
        //乘法表
        if(1==choose) {
            chengFa s = new chengFa();
            s.chengFa1();
            s.chengFa2();
            s.chengFa3();
        }
        if(2==choose) {
            int num;
            //阶乘1
            System.out.printf("普通阶乘>>");
            num = scanner.nextInt();
            if(num>20){
                System.out.println("输入的数太大，运行结果不准确！");
            }
            FactorialTest f1 = new FactorialTest();
            System.out.printf("阶乘结果是>>");
            System.out.println(f1.factorial(num));

            //阶乘2
            System.out.printf("大数阶乘>>");
            num = scanner.nextInt();
            FactorialTest2 f2 = new FactorialTest2();
            f2.factorial(num);
        }
    }
}