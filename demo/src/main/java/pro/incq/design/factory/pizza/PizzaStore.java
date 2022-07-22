package pro.incq.design.factory.pizza;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-04-01
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
