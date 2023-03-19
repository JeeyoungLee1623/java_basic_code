package AnonymousLambda;

public class AnonymousMain {
    public static void main(String[] args) {


        // 일반 객체
//        Anonymous a1 = new Anonymous();
//        System.out.println(a1.getNum());
//        System.out.println(a1.getClass()); // Class 의 이름을 출력하는 함수


        // 익명 객체 : 상속을 받긴 받으나, 상속의 형태가 아니다.
        // 즉 본래의 이름을 잃어버린 익명클래스(객체) 가 된다.
        // interface 는 override 는 필수
        // override 해서 별도의 클래스를 만들기 싫을 때 주로 사용
        // 그때 별도의 클래스 없이 익명 클래스를 즉시 만들어서 사용.
//        Anonymous a2 = new Anonymous(){
//            private int num = 2;
//            @Override
//            public int getNum(){
//                return this.num;
//            }
//        };


//        System.out.println(a2.getNum());
//        // 참조 변수의 타입이 Class 로 출력되지 않고, 실행하고 있는 클래스의 이름이 출력된다.
//        System.out.println(a2.getClass());


        // 마지막 대괄호에 ; 필수
//        AnimalInterface ai = new AnimalInterface(){
//            @Override
//            public void cry(String a) {
//
//                System.out.println("야옹 야옹");
//            }
//        };
//        ai.cry();


        // 익명 객체 방식에서 익명 함수 방식으로의 전환 즉, 메서드에 이름이 없다는 뜻.
        // 매개변수의 타입 또는 갯수 만으로도 메서드를 구분지을 수 있을 때 익명 함수를 쓸 수 있다.
        // -> (람다식)함수 전환으로 {} 의 역할을 한다.
        AnimalInterface ai2 = (String a) -> System.out.println(a + "야옹 야옹");
        ai2.cry("abc");







    }
}

