package pro.incq.lang.number;

import cn.hutool.core.util.NumberUtil;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        xx(BigDecimal.valueOf(605));
        xx(BigDecimal.valueOf(606));
    }

    public static void xx(BigDecimal shippingPrice) {
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal fiveHundred = new BigDecimal(500);
        BigDecimal decimal = shippingPrice.movePointRight(2).remainder(new java.math.BigDecimal(1000));
        if (NumberUtil.isGreater(decimal, java.math.BigDecimal.ZERO) && NumberUtil.isLess(decimal, fiveHundred)) {
            result = decimal.movePointLeft(2);
        }
        if (NumberUtil.isGreater(decimal, fiveHundred)) {
            result = decimal.subtract(fiveHundred).movePointLeft(2);
        }
        BigDecimal x = shippingPrice.subtract(result);
        System.out.println(x);
    }
}
