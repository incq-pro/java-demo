package pro.incq.design.state.gumball.v2;

import lombok.ToString;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-26
 */
public class HasQuarterState implements State {
    public GumballMachineV2 machine;

    public HasQuarterState(GumballMachineV2 machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert another quarter!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned!");
        machine.state = new NoQuarterState(machine);
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        machine.state = new SoldState(machine);
        machine.state.dispense();
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }

}
