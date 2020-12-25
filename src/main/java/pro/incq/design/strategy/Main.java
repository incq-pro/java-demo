package pro.incq.design.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * entry point
 *
 * @author zhangqiang
 * @date 2020-12-28
 */
public class Main {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());
        for (Duck duck : ducks) {
            duck.display();
            duck.performFly();
        }
    }
}
