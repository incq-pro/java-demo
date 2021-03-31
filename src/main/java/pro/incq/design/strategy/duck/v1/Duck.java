package pro.incq.design.strategy.duck.v1;

/**
 * 基类
 *
 * @author pro.incq
 * @date 2021-03-29
 */
public class Duck {
    public void quark() {
        System.out.println("ga ga ga");
    }

    public void swim() {
        System.out.println("swimming...");
    }

    public void fly() {
        System.out.println("I am flying...");
    }

    public void display() {
        System.out.println("duck thing");
    }
}
