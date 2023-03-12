package Java_basic_grammer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RecursiveCall2 {
    public static void main(String[] args) {

        int [] arr = {10,20,30,40};
        // 위 배열을 2개의 숫자로 조합할 수 있는 경우의 수를 나열하라.
        // 단 10, 20 과 20,10은 같은것으로 판단한다. 중복 없이
//        int [] arr_temp = new int[2];
//        for(int i = 0; i < arr.length; i++){
//            arr_temp[0] = arr[i];
//            for(int j = i+1; j < arr.length; j++){
//                arr_temp[1] = arr[j];
//                System.out.println(Arrays.toString(arr_temp));
//                }
//            }
        // 위배열을 3개의 숫자로 조합할 수 있는 경우의 수를 나열하라
//        int [] arr_temp = new int[3];
//        for(int i = 0; i < arr.length; i++) {
//            arr_temp[0] = arr[i];
//            for(int j = i+1; j < arr.length; j++){
//                arr_temp[1] = arr[j];
//                for(int h = j+1; h < arr.length; h++){
//                    arr_temp[2] = arr[h];
//                    System.out.println(Arrays.toString(arr_temp));
//                }
//            }
//        }

        // 3개짜리 조합을 출력하는 재귀함수 호출
        // 중복값도 호출, 합계 호출, 등도 할 줄 알아야 한다.
        // 언제 return / 인덱스 관리/ for 문의 시작점 관리
        recur(arr,new int[3],0, 0);

        }
        static void recur(int [] arr, int [] arr_temp, int index, int ijk){
        if(index == arr_temp.length){
            System.out.println(Arrays.toString(arr_temp));
            return;
              }

            for(int i = ijk; i < arr.length; i++){
                arr_temp[index] = arr[i];
                recur(arr, arr_temp, index+1, i+1);
            }

        }

    }

    // 예상할 수 없는 반복문을 만들어야 할 때, 재귀함수를 기억해야한다.
