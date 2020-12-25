package pro.incq.design.strategy;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2020-12-28
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("green head!");
    }
}

