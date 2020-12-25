package pro.incq.design.strategy;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2020-12-28
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Fly with no way");
    }
}
