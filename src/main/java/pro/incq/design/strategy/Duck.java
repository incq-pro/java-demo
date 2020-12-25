package pro.incq.design.strategy;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2020-12-28
 */
public class Duck {
    protected FlyBehaviour flyBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void quack() {

    }

    public void swim() {

    }

    public void display() {

    }
}
