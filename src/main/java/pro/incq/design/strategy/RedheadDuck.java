package pro.incq.design.strategy;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2020-12-28
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am Red head");
    }
}
