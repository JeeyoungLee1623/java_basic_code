package AbstractInterface;

// final 을 클래스 앞에 붙이면 상속불가한 클래스가 된다.
// 하나라도 abstract 메서드가 있으면 클래스 전체에도 abstract 키워드를 붙여야 한다.
public abstract class Animal {

    private String name;
    private int age;

    //접근 범위 default
    String nick_name = "야옹이 animal";

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }







    void play(){
        System.out.println("네발로 뜁니다.");
    }
    // final이 붙으면 자식클래스에서 오버라이딩 불가
    public final void shape(){
        System.out.println("척추 동물 입니다.");
    }

    public abstract void abstract_test ();




}
