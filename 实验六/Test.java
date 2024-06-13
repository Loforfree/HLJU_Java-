package 实验六;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("------测试点1------");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.search(1));
        System.out.println(list.remove(1));
        System.out.println("------测试点2------");
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        System.out.println("------测试点3------");
        Node p = list.search(22);
        System.out.println(p);
        System.out.println("------测试点4------");
        p=list.search(2);
        System.out.println(p);
        System.out.println("------测试点5------");
        System.out.println(list.set(null,22));
        System.out.println("------测试点6------");
        list.set(p,22);
        System.out.println(p);
        System.out.println("------测试点7------");
        list.insertAfter(p,23);
        System.out.println(list.size());
        System.out.println("------测试点8------");
        System.out.println(list.insertAfter(null,23));
        System.out.println("------测试点9------");
        System.out.println(list.remove(12));
        System.out.println("------测试点10------");
        System.out.println(list.remove(22));
        System.out.println("------测试点11------");
        p=list.get(0);
        System.out.println(p);
        System.out.println("------测试点12------");
        p=list.get(-1);
        System.out.println(p);
        System.out.println("------测试点13------");
        p=list.get(100);
        System.out.println(p);
    }
}
