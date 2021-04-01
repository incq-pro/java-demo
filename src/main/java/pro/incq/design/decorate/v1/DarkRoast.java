package pro.incq.design.decorate.v1;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-31
 */
public class DarkRoast extends Beverage{
    @Override
    public double cost() {
        return super.cost() + 10.1;
    }
}
