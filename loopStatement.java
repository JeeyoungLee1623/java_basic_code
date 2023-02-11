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

        System.out.println("숫자를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int num = 0;
        while (num < 10) {

            System.out.println(input + "x" + num + " = " + input * num);
            num = num + 1;
        }

    }
}