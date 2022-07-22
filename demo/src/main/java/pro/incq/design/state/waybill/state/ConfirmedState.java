package pro.incq.design.state.waybill.state;

import pro.incq.design.state.waybill.Content;
import pro.incq.design.state.waybill.State;
import pro.incq.design.state.waybill.StateMachine;

/**
 * 运单状态 - 已确认
 */
public  class ConfirmedState extends State {
    @Override
    public void ship(Content content) {
        content.machine.state = StateMachine.SHIP_STATE;
        // post process
    }
}
