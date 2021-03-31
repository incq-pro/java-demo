package pro.incq.design.state.gumball.v2;

import lombok.ToString;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-26
 */
public class NoQuarterState implements State {
    public GumballMachineV2 machine;

    public NoQuarterState(GumballMachineV2 machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        machine.state = new HasQuarterState(machine);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there is not quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

}
