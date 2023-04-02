package StreamAndOptional;

import java.util.Arrays;

public class StreamApi {
    public static void main(String[] args) {

        // 스트림이란 데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 페러다임.

        int [] arr = {20,10,4,12};
        // 일반적인 Array 정렬 : 원본을 정렬시킨다.
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        // 스트림을 통한 정렬과 출력: arr 를 입력값으로 하여, 출력밧을 얻어내 원본에 영향을 끼치지 않는 
        // 함수형 패러다임 프로그래밍 방식
//        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));
//        System.out.println(Arrays.toString(arr));

//        int [] new_arr = Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(new_arr));



        // 스트림의 중개연산 (스트림의 변환) : filter, sorted, map

        // filter : 조건을 걸어 필터링, arr 중에 값이 10 이상인 value 를 담은 new_arr 을 생성
//        int [] new_arr = Arrays.stream(arr).filter(a -> a >= 10).toArray();

        // map : 스트림요소들을 주어진 함수에 인수로 전달하여, 그 반환값들로 이루어진 새로운 스트림 반환
        String [] st_arr = {"abc" , "bc" , "abcd" , "abced"};
        Arrays.stream(st_arr).map(a -> a.length()).forEach(a -> System.out.println(a));
        // 메소드 참조 : 람다 표현식에서 하나의 메소드만을 호출하는 경에 매개변수를 제거
        // 그대신 클래스이름 :: 메소드이름 형식으로 사용이 가능하다.
        Arrays.stream(st_arr).map(a -> a.length()).forEach(System.out::println);

        // 위 배열의 문자의 길이만을 담을 새로운 배열을 생성해보자.
        int [] new_st_arr = Arrays.stream(st_arr).mapToInt(a -> a.length()).toArray();
        System.out.println(Arrays.toString(new_st_arr));


        // 스트림의 최종연산 (스트림의 소모) : reduce (현업에서 많이 사용), foreach
        // reduce : arr 중에 10 이상인 value 들의 총합을 구함
        int total = Arrays.stream(arr).filter(a -> a >= 10).reduce((t,a) -> t += a).getAsInt();
        System.out.println(total);




    }
}
