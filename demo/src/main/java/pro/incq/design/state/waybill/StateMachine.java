package pro.incq.design.state.waybill;

import pro.incq.design.state.waybill.bo.ArrivalArg;
import pro.incq.design.state.waybill.bo.ShipArg;
import pro.incq.design.state.waybill.bo.Waybill;
import pro.incq.design.state.waybill.bo.SignArg;
import pro.incq.design.state.waybill.state.ConfirmedState;
import pro.incq.design.state.waybill.state.ReceiptState;
import pro.incq.design.state.waybill.state.ShipState;
import pro.incq.design.state.waybill.state.SignState;
import pro.incq.design.state.waybill.state.ToConfirmState;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-26
 */
public class StateMachine {

    public static final State TO_CONFIRM_STATE = new ToConfirmState();

    public static final State CONFIRMED_STATE = new ConfirmedState();

    public static final State SHIP_STATE = new ShipState();

    public static final State RECEIPT_STATE = new ReceiptState();

    public static final State SIGN_STATE = new SignState();

    public State state;

    Content content;

    public StateMachine() {
        content = new Content(this);
    }

    public void init(Waybill waybill) {
        content.put("waybill", waybill);
        if (waybill.waybillStatus == null) {
            state = TO_CONFIRM_STATE;
        } else if (waybill.actualShippingTime != null) {
            state = SHIP_STATE;
        } else if (waybill.receiptTime != null) {
            state = RECEIPT_STATE;
        } else {
            throw new IllegalArgumentException("运单状态未知！！");
        }
    }

    public void confirm() {
        state.confirm(content);
    }

    public void ship(ShipArg arg) {
        content.put("shipArg", arg);
        state.ship(content);
    }

    public void arrival(ArrivalArg arg) {
        content.put("ArrivalArg", arg);
        state.arrival(content);
    }

    public void sign(SignArg arg) {
        content.put("SignArg", arg);
        state.sign(content);
    }
}
