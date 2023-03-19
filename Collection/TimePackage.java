package Collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class TimePackage {
    public static void main(String[] args) {
        // 예전에는 Calender 클래스를 사용 했지만, 월을 표현함에 있어 0~11 까지로 표현을 하지는 문제 등
        // 몇가지 문제로 인해 java.time 패키지를 이용하게 되었다.


        // java.time 패키지 중에 LocalDateTime 이 가장 많이 사용 된다.
        // LocalTime, LocalDate, LocalDateTime

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime present = LocalTime.now();
        System.out.println(present);

        // 현업에서 날짜 비교하는 것이 많이 사용된다.
        // LocalDateTime.now() 지금 현재 시간을 알려주는 것
        LocalDateTime now = LocalDateTime.now();
        // 날짜를 만들어 내는 것 LocalDateTime.of()
        LocalDateTime input = LocalDateTime.of(2024,02,16,17,05,16);
        System.out.println(input);
        System.out.println(now);
        // 시간 비교, 이전인지 이 이후인지
        System.out.println(input.isBefore(now));

        // 오늘 연도만 출력하려면  / return 갑은 int
        System.out.println(now.getYear());
        System.out.println(now.getDayOfWeek());

        
        // 오전 오후 구분짓는 법 : ChronoField 를 사용하여 오전이면 0, 오후면 1을 구할 수 있다.
        System.out.println(now.get(ChronoField.AMPM_OF_DAY));

        String ampm = "";
        if(now.get(ChronoField.AMPM_OF_DAY) == 0){
            ampm = "오전";
        }else{
            ampm = "오후";
        }
        System.out.println("지금은" + ampm + "입니다.");







    }
}
