package pro.incq.design.strategy.duck.v2;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-29
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
