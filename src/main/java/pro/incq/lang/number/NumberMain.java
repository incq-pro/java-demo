package pro.incq.lang.number;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-26
 */

@Getter
@Setter
@ToString
class T {
    BigDecimal load;
}
public class NumberMain {


    public static void main(String[] args) {
        T t = new T();
        BigDecimal b = BigDecimal.valueOf(0.33333333333333333);
        t.load = b.setScale(3, BigDecimal.ROUND_HALF_UP);
        System.out.println(t);
    }
}
