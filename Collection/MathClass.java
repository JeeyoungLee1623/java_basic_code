package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathClass {
    public static void main(String[] args) {
        // Math.random 은 임의의 double 형 소수(0 이하 실수값)을 반환하는 것
//       double temp = Math.random();
//        System.out.println(temp);
//        // 0~99 까지 임의 수를 출력
//
//        int result = (int)(temp*100);
//        System.out.println(result);
//
//        // Math.abs() 는 절대값(마이너스가 아닌 플러스)을 반환하는 함수
//        int input = -100;
//        System.out.println(Math.abs(input));
//

        double d1 = 0.1234;
        // Math.floor() : 내림 / Math.Ceil() : 올림 / Math.round() : 반올림
        System.out.println(Math.ceil(d1));
        System.out.println(Math.floor(d1));
        System.out.println((double) Math.round(d1*100)/100);

        
        // Math.max() 는 둘중에 더 큰 값 / Math.min 둘중에 더 작은 값
        System.out.println(Math.max(1.03,1.06));
        
        // Math.pow 는 제곱 연산, Math.Sqrt() 는 제급근을 연산
        System.out.println(Math.pow(10, 2));
        System.out.println(Math.sqrt(10));
        
        // 자동 형변환
//        List<Integer> lst = new ArrayList<>(Arrays.asList(10,20,30));
//        for (int al : lst) {
//        }










    }
}
