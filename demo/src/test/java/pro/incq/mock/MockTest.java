package pro.incq.mock;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.mockito.Mockito.*;

/**
 * mockito test
 *
 * @author pro.incq
 * @date 2021-01-26
 */
public class MockTest {

    @Test
    public void verify() {
        List mockedList = mock(List.class);
        mockedList.add("one");
        mockedList.clear();

        Mockito.verify(mockedList).add("one");
        Mockito.verify(mockedList).clear();
    }

    @Test
    public void testThrow() {
        List mockedList = mock(List.class);
        doThrow(new RuntimeException()).when(mockedList).clear();

        //following throws RuntimeException:
        mockedList.clear();
    }

    @Test
    public void haha() {
        class Persion {
            public int getI() {
                return 1;
            }

        }
        List<Persion> persions = new ArrayList<>();
        persions.add(new Persion());
        persions.add(new Persion());
        persions.add(new Persion());
        System.out.println(persions);

        Map<Integer, Persion> m = persions.stream().collect(Collectors.toMap(Persion::getI, Function.identity(), (v1, v2) -> v2));
        System.out.println(m);
    }
}
