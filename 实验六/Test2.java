package 实验六;

public class Test2 {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        System.out.println("------测试1------");
        System.out.println(shop.size());
        System.out.println(shop.get(0));
        System.out.println(shop.delete(null));
        System.out.println("------测试2------");
        System.out.println(shop.add(new Cat("波斯猫",1)));
        System.out.println(shop.add(new Cat("橘猫",2)));
        System.out.println(shop.add(new Cat("折耳猫",1)));
        System.out.println(shop.add(new Dog("柯基犬",1)));
        System.out.println(shop.add(new Dog("阿尔多狗",2)));
        System.out.println(shop.add(new Dog("阿尔多狗",2)));
        System.out.println(shop.add(new Cat("阿尔多狗",2)));
        System.out.println(shop.size());
        System.out.println(shop.get(0).toString());
        System.out.println("------测试3------");
        System.out.println(shop.delete(new Cat("橘猫",1)));
        System.out.println(shop.size());
        System.out.println(shop.getPets().toString());
        System.out.println("------测试4------");
        System.out.println(shop.delete(new Cat("波斯猫",1)));
        //System.out.println(shop.delete(new Cat("阿尔多狗",2)));
        //System.out.println(shop.delete(new Cat("折耳猫",1)));
        System.out.println(shop.size());

        System.out.println(shop.getPets().toString());

    }
}
