package pro.incq.design.state.waybill.bo;

import lombok.Data;

import java.util.Date;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-26
 */
@Data
public class Waybill {
    public String waybillId;

    public Integer waybillStatus;

    public Date actualShippingTime;

    public Date receiptTime;

    public String routeId;
}
