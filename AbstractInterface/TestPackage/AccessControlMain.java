package AbstractInterface.TestPackage;

import AbstractInterface.AccessControl;

public class AccessControlMain extends AccessControl {
    public static void main(String[] args) {
    
        // AccessControl 테스트
        AccessControl ac = new AccessControl();
//        System.out.println(ac.name1);
//        System.out.println(ac.name2); // AccessControl 은 부모의 클래스로서 protected 를 받는 것이 아닌 주는 것이기에 받을 수 없다.
//
//        System.out.println(ac.name3);
//
//        // protected 변수의 경우 상속을 받을 경우 다른 패키지라 할지라도 접근 가능
//        AccessControlMain ac2 = new AccessControlMain();
//        System.out.println(ac2.name1);
//        System.out.println(ac2.name2);
//        System.out.println(ac2.name3);

    }
}
