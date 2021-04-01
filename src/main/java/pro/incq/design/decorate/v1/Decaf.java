package pro.incq.design.decorate.v1;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-31
 */
public class Decaf extends Beverage {
    public Decaf() {
        setMilk(true);
    }

    @Override
    public double cost() {
        return super.cost() + 3;
    }
}
