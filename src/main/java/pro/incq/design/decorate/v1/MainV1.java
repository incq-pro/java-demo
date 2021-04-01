package pro.incq.design.decorate.v1;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-31
 */
public class MainV1 {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.cost());
    }
}
