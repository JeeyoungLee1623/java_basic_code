package AbstractInterface;

import java.util.ArrayList;
import java.util.List;

public class AbstractMain {
    public static void main(String[] args) {
        // 객체를 만들어서 기능을 불러올 경우 즉 c1.play(); 찍힐 경우 이미 출력하는 기능이 만들어져 있으므로 따로 출력 할 필요 없음.
//        Cat c1 = new Cat();
//        c1.play();
//        c1.shape();
//        c1.Cry();

        // 객체타입을 CatImplements 로 할수도 있지만, AnimalInterface1 로도 할 수 있다.
        // CatImplements c2 = new CatImplements();
        // 하지만 보통 아래와 같이 객체를 생성한다.
//        AnimalInterface1 c2 = new CatImplements();
//        c2.cry();
//        c2.play();
//        c2.shape();

        // list 는 interface 이고, ArrayList, LinkedList 등 구현체들에게 메서드 Overriding 을 강제한다.
//        List<String> st1 = new ArrayList<>();
//
//
//        Dog d1 = new Dog();
//        d1.play();
//        d1.shape();
//        d1.Cry();




        // 상속에서의 super()
//        Cat c13 = new Cat("야옹이1", 20);
//        System.out.println(c13.getName());
//        c13.test_print();


        //Accesscontrol 테스트
//        AccessControl ac = new AccessControl();
//        System.out.println(ac.name1);
//        System.out.println(ac.name2);
//        System.out.println(ac.name3);
        
        
        // final 키워드는 변수, 메서드, 클래스에 모두 적용 가능
        // 주로 변수 앞에 변경불가능한 상수를 나타내는 키워드로 사용된다. 
        // 클래스 앞에 붙으면 상속불가, 메서드 앞에 붙으면 오버라이딩 불가

//        final String s1 = "abc";
//        s1 = "abc2"; // 상수를 재 정의 하는 것이 불가.








    }
}
