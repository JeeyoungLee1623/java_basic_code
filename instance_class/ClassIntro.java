package instance_class;

public class ClassIntro {
    // static 이 붙으면 메서드가 아니라, 클래스 함수라 부른다.
    // 메서드는 클래스를 통해 만들어진 객체의 함수다.
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


        // a 회사의 재무처리를 한다.
        // 클래스 변수와 클래스 함수를 사용한 방식의 문제점.
//        int total_a = Calculator.add(10);
//        System.out.println(total_a);
//
//        //b 회사의 재무처리를 한다.
//        int total_b = Calculator.add(10);
//        System.out.println(total_b);



        // 클래스의 복제본을 만드는게 객체이고, 각변수명을 calA.instance_total / calB.instance_total 등 따로 관리하게 된다.
        Calculator calA = new Calculator();
        calA.instance_add(10);
        System.out.println(calA.instance_total);

        Calculator calB = new Calculator();
        int total_b= calB.instance_add(10);
        System.out.println(total_b);







    }





}
