package Java_basic_grammer;

    // 재귀함수란 특정함수가 자기자신을 호출하는 형태의 함수를 말한다.
public class RecursiveCall {
    public static void main(String[] args) {

        // 숫자 n이 있을 때 1~n 까지의 합계를 구하라. 누적합계
        // 방법1 for 문이나 while 문으로 통해 반복 연산을 한다.
//        int n = 10;
//        int total = 0;
//        for(int i = 1; i <= n; i++) {
//            total += 1;
//        }

        // 방법 1
//        int recur_test = 1;
//        recur_add(recur_test);


        // 방법 2
//        int recur_test = 1;
//        recur_add(recur_test,0);

        // 방법 3
//        int recur_test = 1;
//        int recur_total = recur_add(recur_test);
//        System.out.println(recur_total);


        // factorial 재귀함수 : 10! -> 10*9*....*1
        // factorial 을 재귀함수로 구현

//        int factorial_total = factorial(10);

    }

//    static int total = 0;
//    public static void recur_add(int a){
        // 방법 1. 클래스 변수를 선언하여 클래스 변수에 더하여 계산
//        total += a;
//        if(a==10){
//            total += a;
//            return;
//        }
//        recur_add(a+1);
//
//

//        public static void recur_add(int a, int total){
//        // 방법 2. 매개변수에 ,total 값을 달고 다닌다. 그리고 재귀함수 밖에서 값을 꺼낼때는 static 을 활용하기도 한다.
//            total += a;
//        if(a==10){
//            return;
//        }
//        recur_add(a+1, total);
//    }

    // 방법3. return 을 void 가 아닌 int 로 둔다. (거의 쓰지 않는 방법)
//    static int static_total = 0;
//    public static int recur_add(int a){
//        if(a==10){
//            return 10;
//        }
//    return a + recur_add(a+1);
//    }


        // factorial
//        public static int factorial(int a){
//          if(a ==1){
//              return 1;
//          }
//          return a*factorial(a-1);
//        }
















}
