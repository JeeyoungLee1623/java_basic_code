package FileStream;

import java.io.*;

public class FileWriteRead {
    public static void main(String[] args)  {
        // Java 의 File 라이브러리를 통해 파일을 생성하고 Read 하는 방법
        // 기본적으로 파일을 read 하고 write 하는 작업은 시간이 오래걸리는 작업이다.
        // 그래서 버퍼(Buffer)라는 중간매개 메모리를 사용한다.

        try {
            // 파일 입출력의 경우 예외가 발생할 가능성이 높기 때문에, 라이브러리에서 예외처리 강제.
            // FileWriter, FileReader  방식은 io 패키지로, 동기 blocking 방식을 사용한다.
            // nio 패키지도 있는데, 이것은 비동긴 non-blocking 방식을 사용하여 성능을 높인다. (요즘 많이 쓰는 방식)
            FileWriter fw = new FileWriter("test_file.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("손흥민");
            bw.newLine();
            bw.write("이강민");
            bw.newLine();
            bw.close(); // 자바 내에서는 garbage collector 가 있기 때문에 메모리 관리를 안해줘도 되지만
            // 메모리 관리를 해주어야 하는 타 언어나 타 시스템과 연결할때는 간간히 라이브러리에 close 를 해주어야 한다.
        }catch (IOException e){
            // IOException 은 input output 을 예외처리 해주는 것
            e.printStackTrace();
        }

        // file read 또한 buffer 를 사용해 read 한다.
        try{
            FileReader fr = new FileReader("test_file.txt");
            BufferedReader br = new BufferedReader(fr);
            String readLine = null;
            while(true){
                // br.readLine() 은 한줄 한줄 소모가 된는 메서드.
                readLine = br.readLine();
                if(readLine == null){
                    break;
                }
                System.out.println(readLine);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }













    }
}
