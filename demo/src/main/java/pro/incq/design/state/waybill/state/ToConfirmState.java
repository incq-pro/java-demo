package pro.incq.design.state.waybill.state;

import pro.incq.design.state.waybill.Content;
import pro.incq.design.state.waybill.State;
import pro.incq.design.state.waybill.StateMachine;
import pro.incq.design.state.waybill.bo.Waybill;

/**
 * 运单状态 - 待确认
 */
public  class ToConfirmState extends State {
    @Override
    public void confirm(Content content) {
        // 更新运单状态 变成已确认
        content.machine.state = StateMachine.CONFIRMED_STATE;
        // 然后执行操作？
        Waybill waybill = (Waybill)content.get("waybill");
        waybill.setWaybillStatus(1);
        // 入库 ?
    }
}
