package pro.incq.design.state.waybill;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文
 *
 * @author pro.incq
 * @date 2021-03-26
 */
public class Content {
    public StateMachine machine;
    Map<String, Object> args;

    public Content(StateMachine machine) {
        this.machine = machine;
        args = new HashMap<>();
    }

    public void put(String key, Object obj) {
        args.put(key, obj);
    }

    public Object get(String key) {
        return args.get(key);
    }

}
