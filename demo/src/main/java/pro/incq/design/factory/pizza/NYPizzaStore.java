package pro.incq.design.factory.pizza;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-04-01
 */
public class NYPizzaStore extends PizzaStore {

    @Override
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
