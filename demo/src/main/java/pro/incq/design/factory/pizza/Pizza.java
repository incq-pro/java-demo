package pro.incq.design.factory.pizza;

import lombok.ToString;

/**
 * 披萨
 *
 * @author pro.incq
 * @date 2021-04-01
 */
@ToString
public class Pizza {

    protected String type;

    public Pizza(String type) {
        this.type = type;
    }
    public void prepare() {
        System.out.println(type + " prepare");
    }

    public void bake() {
        System.out.println(type + " bake");
    }

    public void cut() {
        System.out.println(type + " cut");
    }

    public void box() {
        System.out.println(type + " box");
    }
}
