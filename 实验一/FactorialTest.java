package 实验一;

public class FactorialTest {
    public static long factorial(int n)
    {
        if(n==1)return 1;
        else
        {
            return n*factorial(n-1);
        }
    }
}
