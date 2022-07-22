package pro.incq.design.state.gumball.v2;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-26
 */
public interface State {
    default void insertQuarter() {
        throw new IllegalStateException();
    }

    default void ejectQuarter() {
        throw new IllegalStateException();
    }

    default void turnCrank() {
        throw new IllegalStateException();
    }

    default void dispense() {
        throw new IllegalStateException();
    }

}
