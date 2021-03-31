package pro.incq.design.state.waybill;

import pro.incq.design.state.waybill.bo.ArrivalArg;
import pro.incq.design.state.waybill.bo.ShipArg;
import pro.incq.design.state.waybill.bo.SignArg;
import pro.incq.design.state.waybill.bo.Waybill;

import java.util.Date;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-26
 */
public class Main {
    public static void main(String[] args) {
        StateMachine machine = new StateMachine();
        Waybill waybill = new Waybill();
        machine.init(waybill);
        machine.confirm();

        machine = new StateMachine();
        waybill = new Waybill();
        waybill.setActualShippingTime(new Date());
        machine.init(waybill);
        machine.ship(new ShipArg());

        machine.arrival(new ArrivalArg());

        machine.sign(new SignArg());
    }
}
