package instance_class;

public class ConstructorMain {

    public static void main(String[] args) {
//        ConstructorTest ct1 = new ConstructorTest();
//        System.out.println(ct1.getPassword());
//        System.out.println(ct1.getAge());

        // 초기화를 강제로 시키는 것
        ConstructorTest ct2 = new ConstructorTest("aaaa", 20);
        System.out.println(ct2.getPassword());
        System.out.println(ct2.getAge());




    }

}
