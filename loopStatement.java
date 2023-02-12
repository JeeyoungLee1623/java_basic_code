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


        for(int i = 2; i < 6; i++){
            System.out.println(i + "단입니다.");
            for(int j=1; j < 10; j++) {
                System.out.println(i*j);
            }
        }





























    }
}