package pro.incq.design.state.gumball.v2;

import lombok.ToString;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-26
 */
public class WinnerState implements State {
    public GumballMachineV2 machine;

    public WinnerState(GumballMachineV2 machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert another quarter!");
    }

    @Override
    public void ejectQuarter() {
        throw new IllegalStateException();
    }

    @Override
    public void turnCrank() {
        throw new IllegalStateException();
    }

    @Override
    public void dispense() {
        throw new IllegalStateException();
    }

}
