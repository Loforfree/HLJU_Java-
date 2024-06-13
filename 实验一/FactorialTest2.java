package 实验一;

public class FactorialTest2 {
    int[] arr = new int[1000001];
    int[] shu = new int[1000001];
    public void factorial(int n) {
        int flag=1;
        while(n>1) {
            int c=1,s=1;
            //将n放入shu数组中
            int cur = n;
            if(flag==1) {
                flag=0;
                while(cur!=0) {
                    shu[s]=cur%10;
                    cur=cur/10;
                    s=s+1;
                }
                shu[s]=-1;
            }
            //核心运算
            int x = 0,temp = 0,add=0;
            for(int i=1;shu[i]!=-1;i++) {
                x=shu[i];
                temp = (n-1)*x+add;
                add=0;
                if(temp>9 && shu[i+1]!=-1) {
                    arr[c]=temp%10;
                    add = temp/10;
                }
                else {
                    arr[c] = temp;
                }
                c=c+1;
            }
            arr[c]=-1;

            //将arr中的数拆开放到shu中
            int head=arr[c-1];int j=1;
            for(int i=1;i<=c-1;i++) {
                if(arr[i]>9) {
                    while(head!=0) {
                        shu[j]=head%10;
                        head=head/10;
                        ++j;
                    }
                }
                else {
                    shu[j]=arr[i];
                    ++j;
                }
                shu[j]=-1;
            }
            n--;
        }
        int len=0;
        while(shu[len]!=-1){++len;}
        System.out.printf("阶乘结果是>>");
        for(int d=len-1;d>=1;d--) {
            System.out.printf("%d",shu[d]);
        }
    }
}
