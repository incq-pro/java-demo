package pro.incq.design.factory.pizza;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-04-01
 */
public class CGPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CGCheesePizza();
            case "clam":
                return new CGClamPizza();
            default:
                break;
        }
        return null;
    }
}
