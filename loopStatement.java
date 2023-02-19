import java.util.Arrays;
import java.util.Scanner;

public class loopStatement {
    public static void main(String[] args) {


        // int num에 숫자가 주어졌을때
        // 해당 숫자를 가지고 n*1, n*2, n*3 ...n*9단을 출력해보자.
        // 반복문을 쓰지 말고, println이 9개를 써서 만들자.
/*
        System.out.println("숫자를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + " x 1 =" + (num * 1));
        System.out.println(num + " x 2 =" + (num * 2));
        System.out.println(num + " x 3 =" + (num * 3));
        System.out.println(num + " x 4 =" + (num * 4));
        System.out.println(num + " x 5 =" + (num * 5));
        System.out.println(num + " x 6 =" + (num * 6));
        System.out.println(num + " x 7 =" + (num * 7));
        System.out.println(num + " x 8 =" + (num * 8));
        System.out.println(num + " x 9 =" + (num * 9));
 */

        // while 문 기본 문법
        /*
        System.out.println("숫자를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int num = 0;
        while (num < 10) {

            System.out.println(input + "x" + num + " = " + input * num);
            num = num + 1;
        }
        */

        /*
        int num = 1;
        int num2 = 9;
        while (num < 10) {

            System.out.println(num + "X" + num2 "=" + num*num2);
            num ++;
            num2 --;
        }
         */

        // int a = 32;
        // int answer = 0;

//        answer += a%10;
//        answer += a/10;


//
//        System.out.println(answer);


        //a= 321
//        answer += a%10; //answer에 더할 값 1
//        a /= 10; //a : 32
//        answer += a%10; //answer에 더할 값 2
//        a /= 10; //a : 3
//        answer += a%10; //answer에 더할 값 3
//

        //4321
/*
        int n = 4321;
        int answer = 0;

        while (n > 0){
            answer += n%10;
            n /= 10;
        }
        System.out.println(answer);
  */

        // 약수의 갯수를 구하기: 몇갠지 => 출력
        // 100 : 1,2,4,10,20,100

//        int n = 100;
//        int count = 0;
//
//        // 100 % 1 == 0? 100%2==0?
//        int start = 1;
//
//        while(start <= 100) {
//            if(n%start==0){
//                count++;
//            }
//            start++;
//        }
//        System.out.println(count);

        // do {} while(조건식)
        //  종종 사용할 상황이 생긴다.
//        int a = 10;
//        do{
//            System.out.println("hello world");
//            a++;
//        } while(a>100);

        // 사칙 연산 프로그램 :while, switch 가지고  if 문 없이
        // scanner를 통해서 + - * / 중 하나 입력 하시오
        // 두개의 숫자 입력하시오


/*
        while(true){
            System.out.println("+ - * / 중 하나 입력 하시오");  //문자가 되어야 함
            Scanner sc = new Scanner(System.in);
            String sign = sc.nextLine();
            System.out.println("두개의 숫자를 입력하시오");
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            Double num1 = sc1.nextDouble();
            Double num2 = sc2.nextDouble();

            switch (sign) {
                case "+":
                    System.out.println("더한 값은:" + (num1 + num2));
                    break;
                case "-":
                    System.out.println("뺀 값은:" + (num1 - num2));
                    break;
                case "*":
                    System.out.println("곲한 값은:"+ (num1 * num2));
                    break;
                case "/":
                    System.out.println("나눈 값은:" + (num1 / num2));
                    break;
            }

        }
        */


        // 어래는 while문을 for문으로 변경한 내용이다.
        //  변수의 유효범위 {} 안에까지만 유효하다
        //  하위 depth에서는 상위 depth 값을 알지만
        // 상위 depth에서는 하위 depth에서 선언된 값을 알지 못합니다. 
        
        /*
        int a=0;
        while (a > 100) {

            System.out.println("hello" +a);
            a++;
        }
        System.out.println(a);
        */

        // for 문의 장점
        // 동일한 변수가 계속적으로 사용이 가능, 하지만 이중 반복문이 될 경우에는 동일한 변수 사용 불가능
      /*  for(int a=100; a>0; a--) {
            System.out.println("hello" + a);
        }
        //for 문은 동일한 변수 사용이 가능
        for(int a=100; a>0; a--) {
            System.out.println("hello" + a);
        }
       // System.out.println(a);

       */

        // 배열
        // int n1 =10;
        // int n2 = 20;
        // int n3 = 30;
        // 위의 여러 변수를 아래 처럼 한번에 선언할 수 있다.
     /*   int [] arr1 = {10,20,30};
        // 안에 있는 변수중 하나를 출력하는 방법
        System.out.println(arr1[0]);
      */
/*
        int [] arr1 = {10,20,30,40,50};
        for(int i = 0; i <5; i++){
            System.out.println(arr1[i]);
        }
        // arr1.length  라고 하는 수식이 있는데 값이 얼마나 많은지 모를때 쓸 수 있다.
*/

//
//        int[] arr = {50, 60, 20, 30, 90, 100};
//        int total = 0;

        // 합을 구하는 식
       /*
       for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        System.out.println(total); */

/*  /
        for(int i= 0; i <arr.length; i++){
            total += arr[i];
        }
    //  평균
        System.out.println(total);
        double average = (double)total / arr.length; // 소수점 중요 
        System.out.println(average);
        */

        // max에 최대 값을 넣을 것
     /*   int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        */

      /*  int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            System.out.println(min);


       */
        // 향상된 for 문
            /*
            int max = arr[0];
            int min = arr[0];
            for (int a : arr) {
                if (max < a) max = a;
                if (max > a) max = a;
            }
            */

        // 쉽게 풀 수 있는 방법
        //int total = Arrays.stream(arr).sum(); arr.s 만쳐도 나온다.
        // double avr = Arrays.stream(arr).average().getAsDouble(); // double로 평균을 낼때 getdouble 해줘야한다.
        //   int max = Arrays.stream(arr).min().getAsInt();

//        int a = 10;
//        int b = 20;
////        for (int i = 1; i <=a; i++){
////            if(a % i == 0){
////                System.out.println("약수는 " + i); }
//
//        int num = a < b ? a : b;
//        int max = 0;
//        for(int i = 1; i <= num; i++){
//            if(a % i == 0 && b % i == 0){
//                max = i;
//            }
//            int min = max * (a/max)*(b/max);

        // 숫자가 많은 경우 최대공약수 최소공배수

//        int [] arr = { 100,20,30,60,80,20,110,200,300};
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//            System.out.println(min);
//
//        int num = Arrays.stream(arr).min().getAsInt();
//
//        int max = 0;
//        for(int i = 1; i <= num; i ++){
//            boolean trueOrNot = true;
//            for(int a : arr) {
//                if(a % i !=0){
//                    trueOrNot = false;
//                }
//            }
//            if(trueOrNot == true){
//                max = i;
//            }
//        }
//        System.out.println(max);
////최대공약수
//        int min = max;
//        for(int a : arr){
//            min *= a/max;
//        }


        //배열의 자리 바꿈
//        int [] arr = {10,20};
//        System.out.println(arr);
//        System.out.println(Arrays.toString(arr)); // 배열의 값이 한번이 보고 싶을 때 보는 방법 (함수 사용) 일반적인 출력으로는 주소 값만 나옴
////        arr[0] = 20;
////        arr[1] = 10;
////        System.out.println(Arrays.toString(arr));
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));
//        // 날라갈 것 같은 , 임시의 데이터 변수는 temp 라고 한다.

//        int [] arr = {10,20,30,40,50}; // 20,30,40,50,10
//        // 시뮬레이션을 많이 돌려봐야 한다
//        for(int i=0; i <arr.length-1; i++){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        int [] arr = {10,20,30,40,50}; // 20,30,40,50,10
//        // 시뮬레이션을 많이 돌려봐야 한다
//        for(int i=0; i <arr.length-1; i++){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
        //bubble sort
////      if(arr[i] < arr[i+1])
//        // 2중 포문 + 뒷자리가 차면 그 횟수만큼 줄어들어야 하는 것도 감안 해야한다
//        System.out.println(Arrays.toString(arr));

//        int[] arr = {50, 60, 40, 70, 10, 20};
//        for (int i = 0; i < arr.length - 1; i++) {
//            int max = arr[i];
//            if(arr[i] < arr[i+1]){
//                arr[i] = arr[i+1];
//                }
//            }
        // 선생님 풀이
        // for문 사용시
//        int[] arr = {50, 60, 40, 70, 10, 20};
//        for (int i = 0; i < arr.length-1; i++) {
//           for(int j = 0; j < arr.length -i -1; j++){
//               if(arr[j] > arr[j+1]){
//                   int temp = arr[j];
//                   arr[j] = arr[j+1];
//                   arr[j+1] = temp;
//               }
//            }

        // 불필요한 점검 할 필요 없이 하는 코드 방법
        // 테스트케이스를 몇개 만들어야 한다.
        // arr.length -1 : 전체반복회수
        // 세부 반복 횟수: 5+4+3+2+1
        // 우선 규칙을 먼저 찾아야함

        //bubble sort
        // bubble sort의 i는 반복 횟수를 지정하기 위한 것
//        int[] arr = {50, 60, 40, 70, 10, 20};
//        for (int i = 0; i < arr.length-1; i++) {
//            Boolean trueOrNot = true;
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    trueOrNot = false;
//                }
//            }
//            if (trueOrNot == true) {
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        //selection sort
        // 많이 사용하는 알고리즘
//        int[] arr = {50, 20, 60, 40, 30, 10};
//        for(int i = 0; i < args.length; i++){
//            for(int j = 0; j < arr.length; j++){
//             if(arr[i] > arr[i+j]){
//                 int temp = arr[j];
//                    arr[j] = arr[i+j];
//                    arr[j + j] = temp;
//             }
//            }
//        }
//        int[] arr = {50, 20, 60, 40, 30, 10};
//        for (int i = 0; i < args.length - 1; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + j];
//                    arr[i + j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


//            int num = 1;
//            while (i+num < arr.length) {
//                if(arr[i] > arr[i+num]){
//                int temp = arr[i];
//                arr[i] = arr[i+num];
//                arr[i+num] = temp;
//            }
//            num++;
//        }
//    }


        //while문 사용시
//        int num = 0;
//        while(num <arr.length-1){
//        for(int j = 0; j < arr.length - num-1; j++){
//            if(arr[j] > arr[j+1]){
//                int temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//  }


        //제어문
        //continue , break 문
        // 1~ 100 중에서 5의 약수 또는 7의 약수를 제외한 값을 출력

//        int num = 1;
//        while(num < 101){
//            if(num % 5 ==0 || num % 7 ==0){
//                // 반복문 내에서 조건문 검사로 다시 올라가도록 하는 구문.
//                // 아래와 같이 coding 할 경우 무한 루프에 빠지게 된다.
//                continue;
//            }else{
//                System.out.println(num);
//            }
//            num++;
//        }
        // 추가적인 구문이 더 있을 경우에 해당 구문을 실행시킬 필요가 없을 때 continue;
        // continue 구문은 조건식으로 바로 올라간다
//        for(int i = 1; i <= 101; i++){
////            if (i % 5 == 0 || i % 7 == 0){
////                continue;
////            }else{
////                System.out.println(i);
////            }
////        }
////
        // break 문
        // break 문은 중도에 반복문을 강제 종료 시키는 것.
//        int num = 1;
//        while(true){
//            if (num % 5 == 0 || num % 7 == 0){
//            }else{
//                System.out.println(num);
//           }
//            num++;
//
//            if(num==101){
//                break;
//            }
//        }


        // break에서 라벨링을 했을 경우 특정 전체 for문을 종료시킬 수 있다.
        // 그렇지 않으면 가장 가까운 for문만 종료가 된다.
        // 정말 많이 활용되는 케이스

//        int [] arr= {3,20,10,40};
//        firstFor:
//        for(int i = 0; i < arr.length-1; i++){
//            boolean trueOrNot = true;
//            secondFor:
//            for(int j = 0; j < arr.length -i-1; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    trueOrNot = false;
//                    break firstFor;
//                }
//            }
//        }

        Label1:
        for(int i = 0; i <5; i++){
            System.out.println("first for 문" + i);
            Label2:
            for(int j = 0; j <5; j++){
                System.out.println("second for 문" + j);
                if(j==1) {
                    break Label1;
                }
            }
        }








/*
        //enhanced for 문
        // int에 담겨있는 값을 a에 적용 시키는 것
        // 위의 식을 아래처럼 간단히 쓸 수 있다.
        // index가 아니라 value 라서 실제 값을 불러온다.
        for(int a: arr1){
            System.out.println(a);
        }
 */

        // String 타입으로 "aaa" "bbb" "ccc" "ddd" "fff"를 담고,
        // for 문 방식으로 출력해보고
        // foreach 문을 통해 출력

/*
        String [] a = {"aaa", "bbb", "ccc", "ddd", "fff"};
        // index 는 숫자이므로 int로 받아야 한다.
            for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        for(String b : a){
            System.out.println(b);
        }
*/
        // 값이 변경 가능 하지만 enhanced for 문은 변경이 안됨. (복사본이기 때문에)
       /* int [] arr1 = {10,20,30,40,50};
        for(int i = 0; i <5; i++) {
            arr1[i]+=10; // arr1 = arr1 + 10 과 같은 문법이므로 arr1의 값 자체가 변한다.
            System.out.println(arr1[i]);
        }
        */


        // 2중 (다중) 반복문
/*
        int num = 2;
        for(int i=1; i < 10; i++){
            System.out.println(num + "x" + i + "=" + num*i);

        }
 */

    /*
        for(int i = 2; i < 6; i++){
            System.out.println(i + "단입니다.");
            for(int j=1; j < 10; j++) {
                System.out.println(i*j);
            }
        }
     */


    }
}