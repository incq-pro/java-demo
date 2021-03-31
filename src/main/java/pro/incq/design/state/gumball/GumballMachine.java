package pro.incq.design.state.gumball;

import lombok.ToString;

/**
 * 糖果售货机
 *
 * @author pro.incq
 * @date 2021-03-26
 */
@ToString
public class GumballMachine {
    private static final int SOLD_OUT = 0;

    private static final int NO_QUARTER = 1;

    private static final int HAS_QUARTER = 2;

    private static final int SOLD = 3;

    private int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 放入硬币
     */
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can not insert another quarter!");
        } else if (state == SOLD_OUT) {
            System.out.println("you can not insert quarter, the machine is sold out!");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You insert a quarter");
        }
    }

    public void ejectQuarter() {
        if (state == SOLD_OUT) {
            System.out.println("You can not eject, you haven't inserted a quarter yet!");
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        } else if (state == HAS_QUARTER) {
            state = NO_QUARTER;
            System.out.println("Quarter returned!");
        } else if (state == SOLD) {
            System.out.println("Sorry, you have already turned the crank");
        }
    }

    public void turnCrank() {
        if (state == SOLD_OUT) {
            System.out.println("you turned, but there is no gumballs");
        } else if (state == NO_QUARTER) {
            System.out.println("You turned, but there is not quarter");
        } else if (state == HAS_QUARTER) {
            state = SOLD;
            System.out.println("You turned...");
            dispense();
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops, out of gumballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println(" you need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("no gumball dispensed");
        }
    }

    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);
        System.out.println(machine);
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);

        machine.insertQuarter();
        machine.ejectQuarter();
        machine.turnCrank();

        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.ejectQuarter();

        System.out.println(machine);

        machine.insertQuarter();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);

    }
}
