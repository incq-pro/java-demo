package pro.incq.design.strategy;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2020-12-28
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("rubber!");
    }
}
