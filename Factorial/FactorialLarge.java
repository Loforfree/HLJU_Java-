package Factorial;

public class FactorialLarge {
    public static String factorial2(int n){
        if(n < 0){
            return "-1";
        }
        int[] array = new int[1000];
        array[0] = 1;
        if(n == 0 || n == 1){
            return "1";
        }
        int carry = 0;
        int bit = 1;
        String str ="";
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < bit; j++) {
                array[j] *= i;
            }
            for (int j = 0; j < bit - 1; j++) {
                carry = array[j] / 10;
                array[j] %= 10;
                array[j+1] += carry;
            }
            if(array[bit - 1] >= 10){
                int temp = array[bit - 1] / 10;
                array[bit - 1] %= 10;
                array[bit] += temp;
                while (temp != 0){
                    array[bit] = temp % 10;
                    temp /= 10;
                    bit++;
                }
            }
        }

        for (int m = bit - 1; m >= 0; m--) {
            str += array[m];
        }
        return str;
    }
}
