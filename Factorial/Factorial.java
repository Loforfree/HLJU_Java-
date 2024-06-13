package Factorial;

public class Factorial {
    /*
     * 函数功能：非递归法求阶乘
     * 入口参数：要求阶乘的数
     * 返回值：该数的阶乘
     * */
    public long factorial1(long i){
        long a = 1;
        for(long num = 1; num <= i; num++)
            a *= num;
        return a;
    }

    public static long factorial2(long i){
        if(i == 1)
            return 1;
        else
            return i * factorial2(i - 1);
    }
}
