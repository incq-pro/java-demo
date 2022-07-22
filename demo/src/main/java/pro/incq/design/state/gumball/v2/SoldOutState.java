package pro.incq.design.state.gumball.v2;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-26
 */
public class SoldOutState implements State {

    public GumballMachineV2 machine;

    public SoldOutState(GumballMachineV2 machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can not insert quarter, the machine is sold out!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can not eject, you haven't inserted a quarter yet!");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned, but there is no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

}
