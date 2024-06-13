package 实验五;

public class ArrayTest {
    public static void main(String[] args) {

        ArrayReverser ar1 = new ArrayReverser(null);
        System.out.println("---------1---------");
        System.out.println(ar1.getArr().length);

        System.out.println("---------2---------");
        int[] data = new int[]{1,2,3};
        ArrayReverser ar2 = new ArrayReverser(data);
        System.out.println(ar2.getArr().length);

        System.out.println("---------3---------");
        ar2.setData(null);
        System.out.println(ar2.toString());

        System.out.println("---------4---------");
        int[] data2 = new int[]{3,2,1};
        ar2.setData(data2);
        System.out.println(ar2.toString());

        System.out.println("---------5---------");
        ar2.reverse();
        System.out.println(ar2.toString());

        System.out.println("---------6---------");
        System.out.println(ar2.toString());

    }
}
