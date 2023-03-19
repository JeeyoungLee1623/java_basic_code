package Java_basic_grammer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CodingTest {
    public static void main(String[] args) {

        String[] arr = {"abc", "bcdddd", "bcccccccc"};
//        String answer = "";
//        boolean checked = true;
//        for (String s : arr) {
//            if (s.length() > 5 && s.length() <= 10) {
//                checked = false;
//                answer = s.toUpperCase();
//                break;
//            }
//        }
//        if(checked){
//            answer = "없음";
//        }
//
//        System.out.println(answer);

        // stream 은 매개변수화 시키는 것
        // 선언된 변수가 스트림으로 포함될 경우 복제본 생성
        String answer = Arrays.stream(arr).filter(a->a.length() >= 5 && a.length() <= 10)
                .map(a->a.toUpperCase()).findFirst().orElse("없음");






    }
}