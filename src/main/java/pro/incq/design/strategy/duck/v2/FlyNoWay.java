package pro.incq.design.strategy.duck.v2;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-29
 */
public class FakeFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("do not fly...");
    }
}
