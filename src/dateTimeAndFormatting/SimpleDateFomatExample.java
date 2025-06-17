package dateTimeAndFormatting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFomatExample {
    public static void main(String[] args) {
        Date now = new Date();

        //날짜를 "yyyy-MM-dd HH:mm:ss" 형식의 문자열로 변환
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(now);

        System.out.println(formattedDate);
    }
}
