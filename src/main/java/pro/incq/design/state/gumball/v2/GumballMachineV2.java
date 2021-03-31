package pro.incq.design.state.gumball.v2;

import lombok.ToString;
import pro.incq.design.state.gumball.GumballMachine;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-26
 */
@ToString
public class GumballMachineV2 {
    public int count;
    public State state;

    public GumballMachineV2(int count) {
        this.count = count;
        if (count > 0) {
            state = new NoQuarterState(this);
        } else {
            state = new SoldOutState(this);
        }
    }

    /**
     * 放入硬币
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    public static void main(String[] args) {
        GumballMachineV2 machine = new GumballMachineV2(5);
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

    public void releaseBall() {
        count--;
    }
}
