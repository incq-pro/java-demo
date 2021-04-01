package pro.incq.design.decorate.v2;

import lombok.Getter;

/**
 * 所有饮料都要继承此类
 *
 * @author pro.incq
 * @date 2021-03-31
 */
public abstract class Beverage {
    @Getter
    protected String description;




    public abstract double cost();
}
