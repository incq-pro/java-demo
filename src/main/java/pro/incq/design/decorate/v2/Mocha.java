package pro.incq.design.decorate.v2;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-31
 */
public class Mocha extends FilterBeverage {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 1.2;
    }
}
