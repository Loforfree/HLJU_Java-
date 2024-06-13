package 实验一;

public class chengFa
{
    public static long FactorialTest(int n) {
        if (0 == n)
        {
            return 1;
        } else
        {
            return n * FactorialTest(n - 1);
        }
    }

    public void chengFa1()
    {
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                {
                    System.out.println(j+"*"+i+"="+i*j);
                }
                else
                {
                    System.out.printf("%d*%d=%2d ",j,i,i*j);
                }
            }
        }
        System.out.println();
    }

    public void chengFa2()
    {
        for(int i=1;i<=9;i++)
        {
            for(int j=i;j<=9;j++)
            {
                if(j==i)
                {
                    for(int k=1;k<=i-1;k++)
                    {
                        System.out.printf("%-7s"," ");
                    }
                    System.out.printf("%d*%d=%2d ",i,j,i*j);
                }
                else if(j==9)
                {
                    System.out.printf("%d*%d=%2d\n",i,j,i*j);
                }
                else
                {
                    System.out.printf("%d*%d=%2d ",i,j,i*j);
                }
            }
        }
        System.out.println();
    }

    public void chengFa3()
    {
        int s=9;
        for(int i=1;i<=9;i++)
        {
            --s;
            for(int k=s;k>=1;k--)
            {
                System.out.printf("    ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                {
                    System.out.println(j+"*"+i+"="+i*j);
                }
                else
                {
                    System.out.printf("%d*%d=%2d ",j,i,i*j);
                }
            }
        }
        System.out.println();
    }
}
