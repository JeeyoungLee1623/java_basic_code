import java.util.Arrays;
import java.util.Scanner;

public class otherVariables {
    public static void main(String[] args) {

        // 기조 차료형: 숫자. 문자(char), boolean, null
        // 문자가 1개 이상이면: String
        //여러자료형을 하나의 변수 표현 : 배열
//        int [] arr1 = { 10.20, 30};
//        String [] arr2 = {"kin","Lee", "Choe"};

        // 기타자료형
        // 자바에서 배열의 문제는 배열의 길이를 줄이고 늘릴 수가 없다. 특히 출력할 때에 일반적으로 출력하면 주소가 나옴
        // List : 배열의 발전된 형태 자바에서 엄청 많이 사용됨.
        // list -> 사용하는 이유는 배열의 길이를 늘이고 줄일 수가 있기 때문이다. / 일반적인 출력이 가능하다.
        // map : key(이름), value
        // set, queue, stack



        // String의 표현 방식
        // 1) 리터럴 표현 방식
        // 원시자료형의 표현 방식
//        char c1 = 'a';
//        String st1 = "hello";
//        System.out.println(st1);
//        System.out.println(c1);
//        char c2 = 'a';
//        System.out.println(c2);
//        System.out.println(c1==c2);
//        // 2) new String 표현 방식 : 참조타입
//        // new 라는 키워는 class를 기반으로 객체를 만들때 사용
//        // 하지만 특별히 String은 많이 사용하는 자료형이기 때문에 new를 안붙여도 된다.
//
//        String st2 = new String("hello");
//        // 원시타입은 메모리주소에 값을 담아 놓지만, 참조타입은 메모리에 메모리 주소를 담아둔다.
//        // 둘의 값이 담기는 메모리 자체가 달라서 값은 같아도 false가 나온다.
//        System.out.println(st1==st2);
//        // 그래서 원시타입과 참조타입의 값을 비교 할 때는 .equals(미리 class에 만들어진 기능)로 비교한다
//        System.out.println(st1.equals(st2));


        // int와 Integer
//        //  long 의 참조타입 Long, char의 참조타입 Character
//        // 원시타입의 int만 가지고 사용하다가 좀 더 넓은 범위를 사용하고자 비슷한 참조타입을 만들었다.
//        int a = 10;
//        String st1 = "20";
//        //String을 int형식으로 변환시켜주는 함수
//        int num2 = Integer.parseInt(st1);
//        String st2 = Integer.toString(num2);
//        System.out.println(st2);
//        System.out.println(num2);
//        System.out.println(st1.getClass());

        // indexOf : 특정 문자가 특정 문자에 몇번째 index에 해당하는지 int로 return.
//        String a = "hello Java";
//        int num = a.indexOf("Java");
//        System.out.println(num);
//        //다른 방법
//        System.out.println(a.indexOf("Java"));
//
//        // contains : 특정 문자가 특정문자에 포함되어 있는지 아닌지를 boolean으로 return.
//        System.out.println(a.contains("python"));
//
            // charAt(): String을 하나씩 잘라서 char 형태로 return.
//        String st1 = "abcdelske";
//        System.out.println(st1.charAt(3) =='d');
//
//        // st1이 가지고 있는 a의 숫자는 몇개인가?
//
//        int st2 = st1.length();
//        System.out.println(st2);
//        int count = 0;
//        for(int i =0; i < st1.length(); i++){
//            if(st1.charAt(i) == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

        //reaplce: 특정문자열을 특정문자열로 대체
        //replaceAll: 특정 문자열을 특정문자열로 대체, 정규표현식 사용가능
//        String st1 = "abcdsef";
//        System.out.println(st1.replaceAll("a","o"));

        // 정규표현식(메타문자열) : 특정한 패턴을 가진 문자열을 찾는것.
        // regex -> regular expression
//        String st2 = "01safdscecsf한글dfse123";
        // 숫자를 제외한 문자만 새로운 문자열에 담아보자.
//        String st3 = st2.replaceAll("[^a-z]", "");
//        System.out.println(st3);
        //[]안에 패턴이 있는 문자나 숫자를 넣고 뒤에 넣고싶은 것을 넣는다.
        // []안에 문자나 숫자 앞에 ^넣으면 제외한다라는 부정의 의미가 된다.


        // substring(a.b) = a이상 부터 b 미만까지 문자열을 잘라낸다. (index 값을 넣어줘야 한다)
//        String st = "hello world";
//        System.out.println(st.substring(6,11)); //원본을 잘라낸 것이 아니기 때문에 원래 값이 바뀌지 않는다.

        //toUpperCase: 대문자로 변환 / toLowerCase: 소문자로 변환
//        System.out.println(st.toUpperCase()); // 원본 값이 변하지 않음.

        // split : 특정문자열을 가지고 규칙적으로 문자열을 자를때 사용.
        // 주의할 점은 return 값이 String[] 이다
//        String st = "a:b:c:d";
//        String [] st_arr = st.split(":"); //배열로 출력이 되니 배열 선언을 먼저 해줘야 한다
//        System.out.println(Arrays.toString(st_arr));

        //공백 없이도 없는걸로 설정해서 자를 수 있다. / 정말 많이 사용된다.
//        String st1 = "abcd";
//        String [] st_arr1 = st1.split(""); //배열로 출력이 되니 배열 선언을 먼저 해줘야 한다
//        System.out.println(Arrays.toString(st_arr1));

        // 문제
//        String st3 = "sndfiqwrthejflsda;fdhe";
        // w문자는 몇번째에서 시작하는지 알아맞춰보자.
        // indexof
//        System.out.println(st3.indexOf("w"));
//        // charAt
//        for(int i = 0; i < st3.length(); i++){
//            if(st3.charAt(i)=='w'){
//                System.out.println(i);
//            }
//        }

        // split을 써서 몇번째에 있는지 구해보자

//        String [] st3_arr = st3.split("");
//        System.out.println(Arrays.toString(st3_arr));
//        for(int i = 0; i <st.length(); i++){
//            if(st3_arr[i].equals("w")){
//                System.out.println(i);
//                break;
//            }
//        }

        //  문자열을 합치는 방법
        //방법 1: String에 값을 더해가면서 합친다.
        // 메모리상의 과부화가 생길 수 있는 방식, 매번 값을 재정의 하기 때문에.
//        String st = "abcd";
//        String [] st_arr = st.split("");
//        System.out.println(Arrays.toString(st_arr));
//        String result = "";
//        for(String a : st_arr){
//            result += a;
//        }
//        System.out.println(result);


        //방법 2: StringBuffer, StringBuilder // string과 호환이 잘된다.
        // 두 방법은 대부분 유사하나, StringBuilder 가 성능이 더 좋음
        // 그러나, StringBuilder 는 특정상황에서 문제가 발생할 여지가 있다.
//        StringBuffer sb = new StringBuffer();
//        sb.append("hellow");
//        sb.append(" world");
//        String result2 = sb.toString();
//        System.out.println("sb는? " + result2);


//        String [] arr = {"abx" , "bds" , "esf", "dsf"};
//        StringBuffer sb = new StringBuffer();
//        for(String a : arr) {
//            sb.append(a);
//        }
//        String result2 = sb.toString();
//        System.out.println(result2);




        // 코딩 테스트 (이상한 문자 만들기)
        // 짝수번째는 대문자 / 홀수번째는 소문자

//        String s = "try";
//        String [] arr1 = s.split("");
//        System.out.println(Arrays.toString(arr1));
//        String result = "";
//        for(int i = 0; i < arr1.length; i++){
//            String a = "";
//            if(i%2 == 0){
//                a = arr1[i].toUpperCase();
//            }else if(i%2 != 0){
//                a = arr1[i].toLowerCase();
//            }
//            result += a;
//        }
//        System.out.println(result);


//        String b = "hello";
//        String [] arr2 = b.split("");
//        System.out.println(Arrays.toString(arr2));
//        String result1 = "";
//        for(int i = 0; i < arr2.length; i++){
//            String a1 = "";
//            if(i%2 == 0){
//                a1 = arr2[i].toUpperCase();
//            }else if (i%2 != 0){
//                a1 = arr2[i].toLowerCase();
//            }
//            result1 += a1;
//        }
//        System.out.println(result1);


//        String c = "world";
//        String [] arr3 = c.split("");
//        System.out.println(Arrays.toString(arr3));
//        String result2 = "";
//        for(int i = 0; i < arr3.length; i++){
//            String a2 = "";
//            if(i%2 == 0){
//                a2 = arr3[i].toUpperCase();
//            }else if(i%2 != 0){
//                a2 = arr3[i].toLowerCase();
//            }
//            result2 += a2;
//        }
//        System.out.println(result2);
//
//        System.out.println(result + " " + result1 + " " + result2);


        // 선생님 풀이
        // 다 잘랐을 경우
        // cnt 대신에 i를 쓰지 않는 이유:
        // i로 할 경우에는 s에 들어있는 문장 전체의 index값을 처리하기 때문에 내가 설정한 값이 틀어진다. 반복작업에서 오류 발생
        // 하지만 cnt로 할 경우 초기화식 cnt = 0;을 넣어줌으로 해서 단어들 마다의 index값을 초기화 하여 설정한 반복 작업이 제대로 이루어짐.
        String s = "trjy hello world";
        String [] s_arr = s.split("");
        String answer = "";
        int cnt = 0;
        for(int i = 0; i < s_arr.length; i++){
            if(s_arr[i].isBlank()){
                answer += s_arr[i];
                cnt = 0; // 공백을 0으로 만들어줌으로 index값을 0123으로 갈 수 있게끔 해준다.
            }else{
                if(cnt % 2 == 0){
                    answer += s_arr[i].toUpperCase();
                }else{
                    answer += s_arr[i].toLowerCase();
                }
                cnt++;
            }
        }
        System.out.println(answer);

        //공백 기준으로 잘랐을 경우
        // 예제 카톡


        
        
        // Trim : 문자열 양 끝에 공백을 제거
        // 예를들어 로그인시 양 끝에 공백이 생길 경우 자동으로 제거해준다.
//        String db_input = "abx@naver.com";
//        System.out.println("로그인 ID를 입력해주세요.");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        input = input.trim();
//        System.out.println(input);
//        System.out.println(input.equals(db_input));

//        String st = " hello  World   ";
//        System.out.println(st.trim());


        //strip: 문자열 양 끝에 공백을 제거, trim 보다 더 좋은 성능
        // space 나 tab 으로 생긴 공백이 아닌 즉 아스키 코드에 정의 되어 있는 공백이 아닌 UTF-8에 정의 되어 있는 공백은
        // trim 이 인식하지 못하기 때문에 strip 으로 꼭 코딩을 해야한다.
//        String a = "  abc ";
//        System.out.println(a.trim());
//        System.out.println(a.strip());






































    }
}
