package Java_basic_grammer;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        System.out.println("나누실 숫자 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int child = 10;
        // 예외 발생 가능ㅎ성이 있는 구간에 try catch 를 통해 예외를 감싼다.
        try{
            System.out.println("나눗셈의 결과는 " + child/input);

        } catch (ArithmeticException e ){
//            System.out.println(e.getMessage());
            e.printStackTrace(); // 이것을 주로 사용한다
            System.out.println("0으로 나눠서 에러가 발생했습니다");
        } catch (Exception e){ //모든 에러를 표현
            System.out.println("나눗셈에서 예외가 발생했습니다");
        }finally { // 거의 사용하지 않음, 에러가 나든 안나든 무조건 실행이 되기 때문에
            System.out.println("무조건 실행되는 finally 구문");
        }

        System.out.println("감사합니다.");








    }
}
