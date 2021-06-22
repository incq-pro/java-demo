package pro.incq.mock;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.mockito.Mockito.*;
/**
 * TODO
 *
 * @author pro.incq
 * @date 2021-01-26
 */
public class MockTest {

    @Test
    public void xx() {
        Integer x1 = new Integer(1);
        Integer x2 = new Integer(1);
        System.out.println("x1 == x2:" + (x1 == x2));
        System.out.println("x1.equals(x2): " + x1.equals(x2));
    }

   @Test
   public void testMock() {
       List mockedList = mock(List.class);
       mockedList.add("one");
       mockedList.clear();

       verify(mockedList).add("one");
       verify(mockedList).clear();
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

       Map<Integer, Persion> m = persions.stream().collect(Collectors.toMap(Persion::getI, Function.identity(), (v1, v2)-> v2));
       System.out.println(m);
   }
}
