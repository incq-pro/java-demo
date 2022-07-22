package pro.incq.design.state.waybill.state;

import pro.incq.design.state.waybill.Content;
import pro.incq.design.state.waybill.State;
import pro.incq.design.state.waybill.StateMachine;

/**
 * 运单状态 - 已到达
 */
public  class ReceiptState extends State {
    @Override
    public void ship(Content content) {
        // 不列新状态
        // 但是要执行一些操作,重复发车的操作？
    }

    @Override
    public void arrival(Content content) {
        // 不更新状态
        // 可能要更新其他信息,重量什么的
    }

    @Override
    public void sign(Content content) {
        content.machine.state = StateMachine.SIGN_STATE;
    }
}
