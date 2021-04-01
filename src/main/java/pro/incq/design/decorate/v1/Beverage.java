package pro.incq.design.decorate.v1;

import lombok.Getter;

/**
 * 所有饮料都要继承此类
 *
 * @author pro.incq
 * @date 2021-03-31
 */
public class Beverage {
    @Getter
    protected String description;

    protected boolean milk;

    protected boolean soy;


    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public double cost() {
        double result = 0.0;
        if (milk) {
            result += 0.1;
        }
        if (soy) {
            result += 0.5;
        }
        return result;
    }
}
