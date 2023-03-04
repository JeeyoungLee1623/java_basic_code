import javax.swing.*;
import java.lang.reflect.AnnotatedType;
import java.sql.Array;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

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
//        sb.insert(10,"dsdfsa"); //(index자리, 끼워넣고 싶은 문자) StringBuffer 에서 가능
//        String result2 = sb.toString();
//        System.out.println(result2);
//


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
//        String s = "trjy hello world";
//        String [] s_arr = s.split("");
//        String answer = "";
//        int cnt = 0;
//        for(int i = 0; i < s_arr.length; i++){
//            if(s_arr[i].isBlank()){
//                answer += s_arr[i];
//                cnt = 0; // 공백을 0으로 만들어줌으로 index값을 0123으로 갈 수 있게끔 해준다.
//            }else{
//                if(cnt % 2 == 0){
//                    answer += s_arr[i].toUpperCase();
//                }else{
//                    answer += s_arr[i].toLowerCase();
//                }
//                cnt++;
//            }
//        }
//        System.out.println(answer);

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


        // String 에서 int 로 변환
        // Integer.parseInt
//        String st = "10";
//        int num = Integer.parseInt(st);
//        System.out.println(num);

        //int 에서 String 으로 변환
        // Integer.toString / String.valueOf
        // 웬만한 타입은 모두 toString 을 가지고 있다.
        // new 해서 만드는 대부분의 객체에 toString 이 있다.

//        int a = 10;
//        String st = Integer.toString(a);
//        st = String.valueOf(a);
//
//      // char int 간의 변환
//        char ch = 'a';
//        int num = (int)ch;
//        num = Character.valueOf(ch);
//        System.out.println(num);
//
//        //상호간의 변환은 꼭 기억하고 있어야 한다.

        // 배열 선언하는 방법
        //선언과 동시에 초기화
//        int [] arr = {10,20,30,40,50};
//        // 선언만 / 선언만 하는 자바의 배열은 반드시 길이를 명시해야 한다.
//        // primitive 타입은 해당 타입으로 초기화, 참조형 변수는 null 로 초기화
//        int [] arr2 = new int [5]; // new 는 int 에 대한것이 아니다.
//        System.out.println(arr2[3]);
//        arr2[0] = 10;
//        arr2[1] = 20;
//        arr2[2] = 30;
//        // 이런식으로 값을 넣는다.
//
//
//        // String 은 배열의 값이 null 로 셋팅이 된다.
//        String [] st_arr = {"abc", "bfs"};
//        String [] st_arr1 = new String[10];
//        System.out.println(st_arr1[5]);


        //Arrays 클래스 기능
//        int [] arr = {30,20,10,50};
//        // 오름차순 정렬: Arrays.sort
//        // 프로그래밍에서 별다른 설정이 없으면, 정렬의 기본은 오름차순
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        // 내림차순 같은 경우엔 Integer 를 쓰거나, Comparator 를 이용해야 한다.
        // Arrays.sort 의 내리마순은 collections.reverseOrder 를 써야 한다. 그런데, primitive 타입은 안된다.
//        String [] st_arr = {"sbc", "aaa", "hfs"};
//        // 문자 모든 자리수의 오름 차순을 비교하여 정렬을 시킨다.
//        Arrays.sort(st_arr, Collections.reverseOrder());
//
//        // int 의 내림차순 정렬: Integer 로 변환을 해주고 Collection.reverseOrder 해준다.
//        // Collection.reverseOrder 는 기본중의 기본 자료형에는 먹히지 않는다. int 가 그 대표적인 예
//        Integer [] arr_integer = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        Arrays.sort(arr_integer, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr_integer));
//
//        // int 의 내림차순이 기억이 안나면 오름차순으로 정렬시키고, 내림차순은 직접 해야한다.
//        Arrays.sort(arr);
//        int [] arr_new = new int[arr.length];
//        int cnt = 0;
//        for(int i = arr.length-1; i>=0; i--){
//            arr_new[cnt] = arr[i];
//            cnt++;
//        }
//        System.out.println(arr_new);


        // 검색 : binarySearch(이진검색) = 자료형이 정렬되어 있어야 정상적으로 자료를 검색하여 index 를 return.
        // binarySearch는 프로그래밍 전반에서 아주 중요하다 / index의 절반을 잘라서 크다 작다를 비교 
        // 주로 database 에서 주로 사용한다
//        int [] arr = {30,20,10,50};
//        Arrays.sort(arr);
//        System.out.println(Arrays.binarySearch(arr, 50));

        // 배열의 복사 : copyOf(복사하고자 하는 배열, lenth), copyOfRange (복사하고자 하는 매열, a,b)
        // 자주 사용하지는 않는다.
//        String [] arr_st = {"a1", "b1", "c1"};
//        String [] arr_st_new = Arrays.copyOf(arr_st, 5);
//        System.out.println(Arrays.toString(arr_st_new));


        // List 는 배열과의 차이는 자료 길이의 유연함이다.
        // 선언 받은 new List 를 통해 list 를 생성한다.
//      첫번째 표현 방식
//        List<String> l1 = new ArrayList<>();
//        l1.add("avd");
//        l1.add("gds");
//        System.out.println(l1);

        // 두번째 표현 방식
        // 거의 쓸 일은 없지만 ArrayList 안에다가
//        List<String> l2 = new ArrayList<>(Arrays.asList("abc" , "bdd"));

//        String [] arr = {"a1" , "b1" , "c1" , "d1"};
//        List<String> l1 = new ArrayList<>(Arrays.asList(arr)); //넣는 방법 1
//        List<String> l2 = new ArrayList<>(); // 넣는 방법 2
//        for(String a : arr) {
//            l2.add(a);
//        }
//
//
//        // List 에서 배열로 변환
//        // list 에서 값을 꺼내는 방법은 l2.get(index)
//        // list 의 크기를 l2.size();
//        String [] answer = new String [l2.size()];
//        for(int i = 0; i < answer.length; i++){
//            answer[i] = l2.get(i);
//        }
//
//        String [] answer2 = l2.stream().toArray(String[]::new); // 트랜디한 풀이 방법/ 메모리 문제가 있지만/ 현업에서도 많이 사용
//
//        int [] arr2 = {10,20,30};
//        List<Integer> n2 = new ArrayList<>();
//        for(int a : arr2){
//            n2.add(a);
//        }
//        // 형변환이 int 에서 Integer 로 자동으로 이루어 진다. (묵시적으로)
//        System.out.println(n2);

        // 배열(length) 만 빼고 다 size 다.
        // collection 프레임워크 (list, map, set, queque) 길이를 size로 한다.


        // list 의 remove 는 index 로 지울 수 있고, value 로 지울 수 도 있다.
//        List<Integer> lst = new ArrayList<>();
//        lst.add(1);
//        lst.add(2);
//        lst.add(3);
//        lst.remove(2);
//        System.out.println(lst);
//        System.out.println(lst.contains(1)); //contain 은 boolean 타입으로 출력된다.
//        System.out.println(lst.isEmpty());

        // list 의 정렬 : sort, comparator.naturaOrder(오름차순), Comparator.reverseOrder(내림차순)
//        List<String> lst = new ArrayList<>();
//        lst.add("b");
//        lst.add("a");
//        lst.add("c");
//        lst.sort(Comparator.naturalOrder());
//        lst.sort(Comparator.reverseOrder());
//        String [] arr = {"b" , "a" , "c"};
//        Arrays.sort(arr);
//        Arrays.sort(arr, Comparator.reverseOrder());


//        int [] arr_num = {4,2,1,3};
//        Integer [] arr_num_new = new Integer [arr_num.length];
//        int cnt = 0;
//        for(int a : arr_num){
//            arr_num_new[cnt] = a;
//            cnt++;
//        }


        // map 은 사전과 같다. Key 와 Value 를 한쌍으로 하는 자료형이다.
        //map 은 자료 검색 시 key 를 통해 굉장히 빠르게 value 를 찾아올 수 있다.(속도 보장). List 보다 훨씬 빠른 속도를 가지고 있다.
//        Map<String, String> mp = new HashMap<>();
//        //  key , value
//        // map 에 값을 더할 때 / map 에서 key 는 중복되지 않는다. 유일한 값이 되어야 한다 / value 는 중복 가능
//        // map 의 키에는 순서(index)가 없다.
//        mp.put("a1" , "abc"); // 값을 put 을 통해서 꺼낸다. / value 가 중복이 가능하므로 value 를 통해 값을 꺼낼 수는 없다.
//        mp.put("a2" , "abc");
//        mp.put("a3" , "abc");
//        System.out.println(mp);
//
//        // map 에서 값을 꺼낼 때는 key 를 통해서 값을 꺼낸다.
//        System.out.println(mp.get("a1"));
//
//        //key 목록 (쓸일이 굉장히 많다)
//        System.out.println(mp.keySet());
//
//        // 문제
//        // 각 key 에 문자 f를 붙여 출력해보라.
//
//        for(String a : mp.keySet()) {
//            System.out.println(a + "f");
//        }
//
//        // value 목록 (쓸 일이 별로 없다)
////        System.out.println(mp.values());
//
//        // containskey: 해당 key가 있는지 없는지 , remove(key)
//        System.out.println(mp.containsKey("a1"));


        // map의 요소를 출력하는 방법 1 : Enhanced For 문
//        Map<String, String> map1 = new HashMap<>();
//        map1.put("a1", "abc1");
//        map1.put("a2", "abc2");
//
//
//        // 방법 2: iterator 방식: iterator() 메소드를 이용한 요소의 출력
//        //iterator 의 특징은 요소를 꺼낼때 소모가 된다. 그래서 꺼낸 후에는 실제 map 안에는 자료가 없다.
//
//        Iterator<String> iter = map1.keySet().iterator();
//        // hasNext() 는 요소가 있는지 없는지를 boolean 형태로 출력
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//            // iter.next() 는 요소를 꺼내는 메써드


        // 완주하지 못한 선수
//        String[] participant = {"leo", "leo", "kiki", "eden", "aaaa"};
//        String[] completion = {"kiki", "leo", "eden", "aaaa"};
//        Map<String, Integer> mp = new HashMap<>();
//        // 완주자 목록을 mp 에가다가 넣어두고, participant 로 조회해올지
//        // participant 목록을 mp에다가 넣어두고 완주 목록으로 조회해올지
//
//
//        String answer = "";
//        for(String a :completion){
////           if(mp.containsKey(a)){
////               mp.put(a,mp.get(a)+1);
////           }else{
////               mp.put(a,1);
////           }
//            mp.put(a, mp.getOrDefault(a, 0) + 1);
//            System.out.println(mp);
//
//        }
//        for(String a :participant) {
//            if (!mp.containsKey(a)) {
//                answer = a;
//                break;
//            }
//            if (mp.get(a) > 1) {
//                mp.put(a, mp.get(a) - 1); {
//                    mp.remove(a);
//                }
//            }
//        }
//
//        System.out.println(answer);


        // 정렬을 해주는 Treemap 오름차순으로 정렬
//        Map<String, Integer> mp1 = new TreeMap<>();
//        String[] student = {"A형", "B형", "O형", "O형", "B형"};
//        for(String a : student){
//            mp1.put(a, mp1.getOrDefault(a, 0)+1);
//        }
//        for(String a : mp1.keySet()){
//            System.out.println("혈액형" + a  );
//        }
//

        // set 은 중복을 알아서 제거해준다. 
//        String [] class1 = {"kim", "lee", "lee", "kim", "choe"};
        // 맵으로 할 경우 메모리 낭비
//        Map<String , Integer> map1 = new HashMap<>();
//        for(String a : class1){
//            map1.put(a, map1.getOrDefault(a, 0)+ 1);
//        }
//        System.out.println(map1.keySet());

//        Set<String> set1 = new HashSet<>();
//        // Set<String> set1 = new TreeSet<>(); 정렬
//        for(String a : class1){
//            set1.add(a);
//        }
//        System.out.println(set1);
//
//        // 집합은 인덱스가 없기 때문에 enhanced for 문으로만 꺼낼 수 있다.
//

        // 교집합 , 합집합, 차집합
//        String [] class1 = {"kim", "lee", "lee", "kim", "choe"};
//        Set<Integer> st1 = new HashSet<>();
//        // st1 = {1,2,3] st2 = {2,3,4} 합집합: 1,2,3,4 교집합:2,3 차집합: st1 - st2 : 1
//        st1.add(1);
//        st1.add(2);
//        st1.add(3);
//        Set<Integer> st2 = new HashSet<>(Arrays.asList(2,3,4)); //깔끔하게 선언하는 방법
//
//        // 합집합 : addAll
////        st1.addAll(st2);
////        System.out.println(st1);
//
//        // 교집합: retainAll
//        st1.retainAll(st2);
//        System.out.println(st1);
//
//        // 차집합: removeAll
//        st1.retainAll(st2);
//        System.out.println(st1);
//
//        // 값을 더하는 것 : add
//        // 여러값을 한꺼번에 더할때: addAll
//        // 제거하는 것 : remove
//
//        Set<Integer> st3 = new HashSet<>();
//        st3.add(10);
//        st3.addAll(Arrays.asList(20,30,40));
//        System.out.println(st3);
//
//        // for문으로 중복을 잘라서 돌릴 경우
//        String [] completion = {"kim", "kim", "lee"};
//        Set<String> st = new HashSet<>();
//        for(String a : completion){
//            st.add(a);
//        }
//        System.out.println(st);


        // Stack 자료 구조: 후입선출
        // 최신의 데이터를 사용해야할 때 사용된다.
//        Stack<String> st = new Stack<>();
//        // 아래 두개 메서드는 꼭 기억 해야한다
//        // 자료를 더하는 것은 push
//        st.push("a1");
//        st.push("a2");
//        st.push("a3");

        // 자료를 꺼내는 것은 pop, 그런데 pop 은 실제로 자료를 꺼내버리기 때문에,(꺼낼때도 마지막에 넣은 자료가 맨 먼저 꺼내진다)
        // peek 을 사용해서 마지막자료가 무엇인지만 확인을 할수도 있다.
//        System.out.println(st.pop()); // 실제 자료를 꺼내머리기 때문에 마지막 자료가 손실 된다.
//        System.out.println(st);
//        st.isEmpty();
//        if(st.isEmpty()) {
//            break;
//        }


//        // EG: 1분에 한번씩 환율 데이터가 쌓인다
//        int [] arr = {1300,1301,1302,1209,1240,1300,1301,1302,1289,1240};


        // 프로그래머스 예제 : 같은 숫자는 싫어

        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        Stack<Integer> st = new Stack<>();
        // 컬렉션 프레임 워크를 사용할 때는 무조건 is.Empty를 꼭 체크 해줘야 한다.
        for (int a : arr) {
            if (st.isEmpty()) {
                st.push(a);
            } else {
                if (st.peek() != a) {
                    st.push(a);
                }
            }
        }
        System.out.println(st);
        int[] answer = new int[st.size()];
        // 사이즈로 할 경우 pop 때문에 사이즈가 줄어버린다.
        // 꼭 할줄 알아야 하는 for 문
        int num = st.size();
//        for(int i = num-1; i>=0; i--){
//            answer[i] = st.pop();
//        }
//


        // 좋은 예시 방법
        int num1 = 0;
        for(int a: st){
            answer[num1] = a;
            num1++;
        }
        System.out.println(Arrays.toString(answer));













        // 리스트로도 가능

//        List<Integer> lst = new ArrayList<>();
//        for(int a : arr) {
//            if (lst.isEmpty()) {
//                lst.add(a);
//            } else {
//                if (lst.get(lst.size()-1) != a) {
//                    lst.add(a);
//                }
//            }
//        }

        













    }
}
















