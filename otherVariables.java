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
        String st1 = "abcdsef";
        System.out.println(st1.replaceAll("a","o"));

        // 정규표현식(메타문자열) : 특정한 패턴을 가진 문자열을 찾는것.
        // regex -> regular expression
        String st2 = "01safdscecsf한글dfse123";
        // 숫자를 제외한 문자만 새로운 문자열에 담아보자.
        String st3 = st2.replaceAll("[^a-z]", "");
        System.out.println(st3);
        //[]안에 패턴이 있는 문자나 숫자를 넣고 뒤에 넣고싶은 것을 넣는다.
        // []안에 문자나 숫자 앞에 ^넣으면 제외한다라는 부정의 의미가 된다.























    }
}
