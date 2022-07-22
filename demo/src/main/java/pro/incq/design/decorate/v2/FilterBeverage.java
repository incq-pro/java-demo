package pro.incq.design.decorate.v2;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-31
 */
public class FilterBeverage extends Beverage{
    protected Beverage beverage;

    public FilterBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost();
    }
}
