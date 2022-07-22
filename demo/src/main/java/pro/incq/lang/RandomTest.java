package pro.incq.lang;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RandomTest {
    public static void main(String[] args) {
        System.out.println(carNum("沪A-11111"));

        BigDecimal b1 = new BigDecimal("2.31");
        System.out.println(b1.setScale(0, RoundingMode.CEILING));
        for(int i = 0; i < 1000; i++) {
//            System.out.println(ThreadLocalRandom.current().nextInt(100, 200));
        }


    }

    public static Boolean carNum(String car) {
        return car.matches("^[\\u4e00-\\u9fa5]{1}[A-Z]{1}([A-Z_0-9]{5,6}|[A-Z_0-9]{4}挂)$");
    }
}

