package Generic;

public class MainClass {
    public static void main(String[] args) {
        GenericClass <Integer> gc = new GenericClass();
        gc.setName(1004);
        gc.setAge(23);

        System.out.println("이 사람의 이름은 " + gc.getName() + " 입니다.");
        System.out.println("이 사람의 나이는 " + gc.getAge() + " 입니다.");

    }
}
