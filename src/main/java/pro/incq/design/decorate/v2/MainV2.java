package pro.incq.design.decorate.v2;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-31
 */
public class MainV2 {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.cost());
        beverage = new Whip(beverage);
        System.out.println(beverage.cost());
    }
}
