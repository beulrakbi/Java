package dateTimeAndFormatting;

import java.util.Calendar;

public class CalenderExample {
    public static void main(String[] args) {
        //현재 날짜와 시간 가져오기
        Calendar cal = Calendar.getInstance();

        //현재 날짜와 시간 가져오기
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; //0부터 시작하므로 +1
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY); //24시간제
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println("현재 날짜: " + year + "-" + month + "-" + day);
        System.out.println("현재 시간: " + hour + ":" + minute + ":" + second);

        //날짜 설정
        cal.set(2025, Calendar.JUNE, 17); // 월은 0부터 시작
        System.out.println("\n 날짜 설정 후");
        System.out.println("설정된 날짜: " + cal.get(Calendar.YEAR) + "-" + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.DAY_OF_MONTH));

        //날짜 더하기(10일 후)
        cal.add(Calendar.DATE, 10);
        System.out.println("\n10일 후: " + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DAY_OF_MONTH));

        //시간 빼기 (3시간 전)
        cal.add(Calendar.DATE, -1); //음수를 보냈기 때문에 add 메소드이지만 시간을 뺌
        System.out.println("3시간 전: " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));


    }
}
