package pro.incq.design.state.waybill.state;

import pro.incq.design.state.waybill.Content;
import pro.incq.design.state.waybill.State;

/**
 * 运单状态 - 已签收
 */
public  class SignState extends State {
    @Override
    public void ship(Content content) {
    }

    @Override
    public void arrival(Content content) {

    }

    @Override
    public void sign(Content content) {

    }
}
