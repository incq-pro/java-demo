package pro.incq.third;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-03-16
 */
public class TestHessian {
    public static void main(String[] args) {
        DateTime date = DateUtil.offsetDay(DateUtil.parse("2020-10-30"), 1);
        byte[] a = serialize2(date);
        System.out.println(deserialize2(a).toString());
    }

    public static <T> byte[] serialize2(T t) {
        byte[] data = null;
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            Hessian2Output output = new Hessian2Output(os);
            output.writeObject(t);
            output.getBytesOutputStream().flush();
            output.completeMessage();
            output.close();
            data = os.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static <T> T deserialize2(byte[] data) {
        if (data == null) {
            return null;
        }
        Object result = null;
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(data);
            Hessian2Input input = new Hessian2Input(is);
            result = input.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) result;
    }
}
