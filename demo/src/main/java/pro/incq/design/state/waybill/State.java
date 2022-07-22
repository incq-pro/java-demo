package pro.incq.design.state.waybill;

/**
 * 运单状态
 */
public abstract class State {

     public void confirm(Content content) {
          throw new IllegalStateException();
     }

     public void ship(Content content) {
          throw new IllegalStateException();
     }

     public void arrival(Content content) {
          throw new IllegalStateException();
     }

     public void sign(Content content) {
          throw new IllegalStateException();
     }
}
