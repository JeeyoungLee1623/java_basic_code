package Collection;

public class ObjectClass {
    public static void main(String[] args) {

        String a = "abc";
        int num = 10;
//        Integer.toString();
        // Java 의 모든 클래스의 조상 클래스는 Object 이다.

        // 심지어, 별도로 만든 개별클래스의 부모도 extends object 가 생략돼 있는 것.
        Player p = new Player();
        p.toString();

        // equals() 등 총 11개의 메서드가 object 클래스내에 내장되어 있다.



    }

}
