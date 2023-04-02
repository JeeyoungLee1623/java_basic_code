package Thread;

import java.util.List;

public class MainClass {
    static int total = 100;
    public static void main(String[] args) throws InterruptedException {



        // Thread 생성 방법 2가지
        // 1.Runnable 구현 방식 (익명객체)
//        Thread th1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("first thread");
//            }
//        });
//        th1.start();
//
//
//        // 2.Thread 상속 방식
//        Thread th2 = new ThreadWithClass();
//        th2.start();
//
//
//        // 3.Runnable 람다 함수 방식
//        Thread th3 = new Thread(() -> System.out.println("third class"));
//        th3.start();
//
//        // 4. Runnable의 또다른 방식 (간편 코드 방식)
//        new Thread(() -> System.out.println("Fourth class")).start();


//        // 동기적 도서대출 방식
//        for(int i = 0; i<1000; i++){
//            if(total <=0){
//                break;
//            }
//            System.out.println("대출완료");
//            total -= 1;
//            System.out.println("현재 남아있는 책 수량은 " + total);
//        }
//        System.out.println("최종적으로 남아 있는 책 수량 " + total);



//        // 비동기적 도서대출 방식 (멀티 스레드 방식), 성능은 비동기적 실행이 우세하다.
//        for(int i = 0; i<1000; i++){
//            if(total <=0){
//                break;
//            }
//            new Thread(() -> {
//                System.out.println("대출완료");
//                total -= 1;
//                System.out.println("현재 남아있는 책 수량은 " + total);
//            }).start();
//        }
//        System.out.println("최종적으로 남아 있는 책 수량 " + total);


        // 비동기적 도서대출 방식 (멀티 스레드 방식) - 별도의 클래스로 구현
        // 멀티쓰레드 상황에서 동기적 코딩을 하는 방법: ***중요 1. join / 2. synchronized ***중요

        for(int i = 0; i<1000; i++){
//            if(LibraryMultiThread.book_total <=0){
//                break;
//            } //  synchronized 를 사용할 경우 if 문은 상속 하는 다른 클래스에 넣는다.  보통은 join 을 쓴다.
           Thread th = new Thread(new LibraryMultiThread());
            th.start();
//            th.join();
        }
        System.out.println("최종적으로 남아 있는 책 수량 " + LibraryMultiThread.book_total);


        

    }
}
