package instance_class;

public class ClassIntro {
    // 클레스는 변수 + 함수의 집합이다.
    // static 이 붙으면 메서드가 아니라, 클래스 함수라 부른다.
    // 메서드는 클래스를 통해 만들어진 객체의 함수다.
    // 객체라는 것은 class 를 통해 만들어진 복제본이다.
    // 만드는 방식은 new class 명을 통해 생성하고 instance 라고도 부른다.
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int c1 = add(a,b);
//        Calculator ca = new Calculator();
//        int c2 = ca.minus(a,b);
//
//    }
//
//
//
//    // 클래스 함수
//     public static int add(int num1, int num2){
//        int result = num1 + num2;
//        return result;
//    }
//    // 매서드
//    // 객체를 만들면 heap 메모리 공간에 저장되어, 휘발 되지 않는 성질을 가진다.
//
//
        // 클랙스 변수 사용 시
//        System.out.println(Calculator.total);
        // 객체 변수 사용 시
//        Calculator c1 = new Calculator();
//        System.out.println(c1.instance_total);



        // 클래스 변수와 클래스 함수를 사용한 방식과 객체를 사용한 방식의 차이점.
        // a 회사의 재무처리를 한다.
//       int totalA =  ClassInstanceDifference1.static_add(10);
//        System.out.println(totalA);
////
//        //b 회사의 재무처리를 한다.
//        int totalB =  ClassInstanceDifference1.static_add(10);
//        System.out.println(totalB);

        // a 회사
//        ClassInstanceDifference1 ci1 = new ClassInstanceDifference1();
//        System.out.println(ci1.instance_total);
//        ci1.instance_add(10);
//        System.out.println(ci1.instance_total);

        // b 회사
//        ClassInstanceDifference1 ci2 = new ClassInstanceDifference1();
//        System.out.println(ci2.instance_total);
//        ci2.instance_add(10);
//        System.out.println(ci2.instance_total);
//





        // 클래스의 복제본을 만드는게 객체이고, 각변수명을 calA.instance_total / calB.instance_total 등 따로 관리하게 된다.
//        Calculator calA = new Calculator();
//        calA.instance_add(10);
//        System.out.println(calA.instance_total);
//
//        Calculator calB = new Calculator();
//        int total_b= calB.instance_add(10);
//        System.out.println(total_b);
//



        // 전형적인 객체 형식 예제
//        InstanceUserSample user1 = new InstanceUserSample();
//        user1.setName("홍길동");
//        user1.setPassword("sdfsdf");
//        System.out.println("이름은" + user1.getName());
//        System.out.println("비밀번호는" + user1.getPassword());



        // 메소드의 사용 목적: 중복을 피하여 프로그램을 모듈화
        // 1. 지역변수를 활용한 예시
        int a = 10;
        int b = 20;
        int c = method0(a,b);
        System.out.println("지역변수 result: " + c);


        // 1. 객체변수를 만들어보자. method1
        ClassIntro c1 = new ClassIntro();
        c1.method1(a,b);
        System.out.println("instance_result" + c1.instance_result);


        // 지역변수를 쓰려다보니 지역변수는 return을 받아 사용해야 했다.

        // 2. 클래스변수로 만들어서 사용해보자. method2
        method2(a,b);
        System.out.println("static_result" + static_result);
    }

    // 같은 클래스 안에 있기 때문에 public static 은 안붙여도 된다.

    public static int method0 (int a, int b){
        int result = ((a+b)*2)+3;
        return result;
    }
    // 객체를 만들어서 사용하니 static 을 빼야한다.
    int instance_result = 0;
    public void method1(int a, int b){
        this.instance_result = ((a+b)*2)+3;
    }
    static int static_result = 0;
    public static void method2 (int a, int b){
        int static_result = ((a+b)*2)+3;
    }

























}
