package AbstractInterface.TestPackage;

// 프로그래밍에서 일반적으로 * 의미하는 것은 all 을 의미한다.
// package 하위 파일 단위의 *은 가능하지만, 하위패키지까지 모두 가져오는 *은 불가능하다.
import java.util.*;
// 아래처럼 하위 패키지를 모두 가져 올수는 없다.
//import java.*;

// java.lang 폴더는 import 할 필요 없이 자동으로 내장 import 되어 있다.
// package java.lang.String;




public class PackageTest {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        String a = "test";
    }
}
