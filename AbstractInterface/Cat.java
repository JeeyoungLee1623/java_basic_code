package AbstractInterface;

// 자바에서 다중 상속은 불가하다.
public class Cat extends Animal{
    // 부모의 변수 + 메서드를 상속(생성자는 제외)
    // 부모의 생성자를 상속받고 싶으면 자식 클래스에 super() 라는 키워드를 추가. this() 와 유사하게 이해하면 될듯.


//접근 범위 default 또는 protected
    String nick_name = "야옹이 cat";
    Cat(String name, int age){
        super(name, age);
        // super 를 통해 아래와 같이 초가화 로직을 상속
        // super 를 통해 private 변수가 접근이 안됨에도, animal 클래스가 초기화를 진행하므로
        // 간접적으로 private 변수도 사용할 수가 있게 된다.
//        this.name1 = name1;
//        this.age1 = age1;
    }

        

   // @Overriding 어노테이션을 붙이는건 옵션 하지만 써주는 것이 좋다. 왜냐면 다른 사람이 코드를 분석할 때 덮어 썻다는 것을 확인 할 수 있다.

    // 부모 클래스인 Animal 에 이미 정의가 되어 있지만 내가 덮어 쓸 수도 있다.
    @Override
    public void play() {
        System.out.println("사뿐사뿐 걸어다닙니다. ");

    }

    // Animal 클래스에 abstract 키워드로 인해 구현을 강제받고 있는 메서드
    // 특정메서드를 인터페이스화 시킨 방식
    @Override
    public void abstract_test() {
        
    }

//    void shape(){
//    }

    // @Override 을 붙일 수 없는 경우는 부모 클래스에 없는 경우 재 정의 할수 없으므로 붙일 수 없다.
    void Cry (){
        System.out.println("야옹 야옹");
    }
    // private 변수는 상속을 받지 못한다.
    void test_print(){
        // cat 의 nick_name 있으면 cat 의 변수 값, 없으면 부모의 nick_name 변수값이 출력
        System.out.println(nick_name);
        // super 키워드를 통해 부모클래스의 변수임을 명시한 것. 
        System.out.println(super.nick_name);
    }

}

// 클래스 안에 클래스가 더 있는 경우는 내부클래스가 있는 경우.
// 한 클래스 내에 public 클래스는 한개만 가능/ public 을 지우면 default 상태가 되며 이는 같은 package 안에서 있는 모든 클래스에서 호출 가능하다.
// interface 를 구현 (implements) 하려면 반드시 interface 에 정의된 모든 메서드를 구현해야 한다.
// 자동으로 모든 메서드를 구현하는 방법은 빨간불이 뜰때 implements method 눌러주면 다 구현이 된다.
// 자바에서 interface 다중 구현은 가능하다.


class CatImplements implements AnimalInterface1{
    // 메서드 override : 상속 또는 구현시 부모 클래스 (interface)의 기능을 재정의 하는 것.

    @Override
    public void play() {
        System.out.println("사뿐사뿐 걸어다닙니다. ");

    }

    @Override
    public void shape() {
        System.out.println("날렵하게 생겼습니다. ");
    }

    @Override
    public void cry() {
        System.out.println("야옹 야용");

    }
}

// 자바에서 interface 다중 구현은 가능하다.
// 어차피 구현은 부모의 메서드 구현 내용을 따지지 않기 때문에 누구로부터 상속 받았는지에 대한 혼선이 없다.
class CatMultiImplements implements AnimalInterface1,AnimalInterface2 {

    @Override
    public void play() {

    }

    @Override
    public void shape() {

    }

    @Override
    public void cry() {

    }

    @Override
    public void weight() {

    }
}

