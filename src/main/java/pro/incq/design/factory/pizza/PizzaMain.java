package pro.incq.design.factory.pizza;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-04-01
 */
public class PizzaMain {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza);

        store = new CGPizzaStore();
        pizza = store.orderPizza("cheese");
        System.out.println(pizza);
    }
}
