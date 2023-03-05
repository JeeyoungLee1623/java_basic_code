package Java_basic_grammer;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        // 현재 나한테 13.000원이 있다.
        // 만약에 돈이 10,000원 이상이 있으면, "택시를 타시오" 출력
        // 만약에 돈이 5.000원 이상이 있으면, "버스를 타시오" 출력
        // 그렇지 않으면, "걸어가시오" 출력
         /*
        int i = 13000;
        if (i > 10000) {
            System.out.println("택시를 타시오");
        } else if (i > 5000) {
            System.out.println("버스를 타시오");
        } else {
            System.out.println("걸어가시오");
        }
        */
         /*
        //이상적인 코드
        int i = 13000;
        if(i >= 10000) {
            System.out.println("택시를 타시오");
        }else if (i >= 5000 && i <10000){
            System.out.println("보스를 타시오");
        }else{
            System.out.println("걸어가시오");
        }
        */

        // 사용자한테 얼마가 있는지 숫자를 입력을 받아서
        // 만약에 돈이 10,000원 이상이 있으면, "택시를 타시오" 출력
        // 만약에 돈이 2.000원 이상이 있으면, "버스를 타시오" 출력
        // 1000원 이상 있으면 킥보드를 타시오
        // 그렇지 않으면, "걸어가시오" 출력

        /*
        System.out.println("얼마를 가지고 있나요");
        Scanner sc = new Scanner(System.in);
        int myMoney = sc.nextInt();
        if(myMoney >= 10000) {
            System.out.println("택시를 타시오");
        } else if (myMoney >= 2000 && myMoney < 10000) {
            System.out.println("버스를 타시오");
        }else if (myMoney >= 1000 && myMoney < 2000) {
                System.out.println("킥보드를 타시오");
        }else{
            System.out.println("걸어가시오");
        }
         */

        // 알파벳 문자 1개를 입력을 받아, 해당 문자가 대문자 인지 소문지 인지 출력
        // 소문자는 97 ~ 122
        // 대문자는 65~90
/*
    while (true) {
        System.out.println("문자 하나만 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        char input = sc.nextLine().charAt(0);
        int input_num = input;
        System.out.println(input_num);
        if (input_num >= 65 && input_num <= 90) {
            System.out.println("알파벳 대문자 입니다.");
        } else if (input_num >= 97 && input_num <= 122) {
            System.out.println("알파벳 소문자 입니다.");
        } else {
            System.out.println("알파벳이 아닙니다.");
        }
    }
        */

        // 은행 고객센터
        // 1번을 입력하면, "대출업무입니다" 를 출력
        // 2번을 입력하면, "예금업무입니다" 를 출력
        // 3번을 입력하면, "마이데이터업무입니다" 를 출력
        // 4번을 입력하면, "외화송금업무입니다." 를출력
        // 그 외의 숫자를 입력하면 "상담원 연결합니다." 를 출력


        //switch문은 정해져 있는 숫자의 조건문일때 사용한다.
        System.out.println("a은행 입니다. 원하는 숫자를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
             System.out.println("대출업무입니다.");
             break;

            case 2:
                System.out.println("예금업무입니다.");
                break;

            case 3:
                System.out.println("마이데이터업무입니다.");
                break;

            case 4:
                System.out.println("외화송금업무입니다.");
                break;

            default :
                System.out.println("상담원 연결합니다.");
                break;
        }

    }
}
