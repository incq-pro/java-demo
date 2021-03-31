package pro.incq.design.state.gumball.v2;

import lombok.ToString;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-26
 */
public class SoldState implements State {
    public GumballMachineV2 machine;

    public SoldState(GumballMachineV2 machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you have already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turn twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if (machine.count > 0) {
            machine.state = new NoQuarterState(machine);
        } else {
            machine.state = new SoldOutState(machine);
        }
    }

}
