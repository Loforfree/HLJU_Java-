public class MyClass implements Runnable{
    private String name;

    public MyClass(String s){
        this.name=s;
    }

    public void run(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println(name+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        MyClass m1 = new MyClass("m1");
        MyClass m2 = new MyClass("m2");
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }
}