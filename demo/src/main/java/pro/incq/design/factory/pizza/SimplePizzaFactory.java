package pro.incq.design.factory.pizza;

/**
 * 简单工厂方法
 *
 * @author pro.incq
 * @date 2021-04-01
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYCheesePizza();
            case "clam":
                return new NYClamPizza();
            default:
                break;
        }
        return null;
    }
}
