package pro.incq.lang.time;

import java.time.LocalTime;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-02-04
 */
public class TimeTest {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        LocalTime l2 = LocalTime.now();
        l2  = lt.plusSeconds(1);
        l2 = LocalTime.parse("12:01:00.12345");
        System.out.println(l2);
        System.out.println(lt.compareTo(l2));
    }
}
