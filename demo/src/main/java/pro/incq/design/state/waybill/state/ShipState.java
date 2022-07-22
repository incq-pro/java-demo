package pro.incq.design.state.waybill.state;

import pro.incq.design.state.waybill.Content;
import pro.incq.design.state.waybill.State;
import pro.incq.design.state.waybill.StateMachine;

/**
 * 运单状态 - 已发车
 */
public class ShipState extends State {
    @Override
    public void ship(Content content) {
        // 重复发车
    }

    @Override
    public void arrival(Content content) {
        boolean isAutoSign = false;
        if (isAutoSign) {
            content.machine.state = StateMachine.SIGN_STATE;
            // post process
        } else {
            content.machine.state = StateMachine.RECEIPT_STATE;
            // post process
        }
    }
}
