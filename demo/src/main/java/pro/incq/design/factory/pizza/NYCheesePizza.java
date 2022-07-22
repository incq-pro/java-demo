package pro.incq.design.factory.pizza;

import lombok.ToString;

/**
 * 披萨
 *
 * @author pro.incq
 * @date 2021-04-01
 */
@ToString(callSuper = true)
public class NYCheesePizza extends Pizza{
    public NYCheesePizza() {
        super("ny-cheese");
    }
}
