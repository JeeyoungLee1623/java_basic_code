import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        // 정수형
        // 실수형 BigDecimal 을 사용해야한다.
        // 문자형
        // char 타임은 한글자 String 은 한글자 이상 char 타입 같은 경우는 숫자로 변환 가능


        //char = 작은 따옴표
        //String = 쌍따옴표
        // 타입변환 : char -> int
        /* int n1 = (int)c1;
        System.out.println(c1);
         */


        // 묵시적 타입 변환
       /* int n1 = 10;
        double d1 = n1;
        System.out.println(d1); */


        //명시적 타입 변환
       /*
        int n1 = 1;
        int n2 = 4;
        // int / int 의 결과값은 int 이므로 0이 된다. (오른쪽의 식이 먼저 계산이 된 후 메모리에 저장이 된다)
        double d1 = n1/n2;
        System.out.println(d1);
        // double / int 하여 double  결과값이 나오게 된다.
        double d2 = (double)n1/n2;
        System.out.println(d2);
        */

        // null 은 데이터가 없다는 명시적인 표현
        /*
        String s1 = null;
        System.out.println(s1);
        */

        //boolean은 true/false 2가지
        /*int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        if(n1<n2 && n2>n3) {
            System.out.println("참 입니다.");
        }else {
            System.out.println("거짓입니다. ");
        }
        */

        /*
        System.out.println("숫자 2개를 입력해주세요.");
        System.out.println("첫번째 숫자를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int firstNum= sc.nextInt();
        System.out.println("firstNum : " + firstNum);
        System.out.println("두번째 숫자를 입력해주세요.");
        Scanner sc2 = new Scanner(System.in);
        int secondNum= sc2.nextInt();
        System.out.println("secondNum : " + secondNum);

        if ( firstNum > secondNum) {
            System.out.println("더 큰 숫자는" + firstNum + "입니다");
        }else {
            System.out.println("더 큰 숫자는" + secondNum + "입니다");
        }
        */

        // 변수란 변할 수 있는 숫자, 상수는 변할 수 없는 숫자.
        int n1 = 20;
        n1 = 30;
        n1 = n1 + 10;
        System.out.println(n1);

        // final 을 통해서 변할 수 없는 상수값을 지정
        final int BUSFEE = 1000;

        // 상수값은 선언과 초기화가 따로 될수는 없다.



    }
}