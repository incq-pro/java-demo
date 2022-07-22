package pro.incq.lang.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * 多线程处理迭代器
 *
 * @author pro.incq
 * @date 2021-04-06
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            System.out.println(random.nextInt(100));
        }

        if (true) {
            return;
        }
        // 生成迭代器
        List<Integer> data = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            data.add(i);
        }
        Iterator<Integer> it = data.iterator();

        // 多线程处理
        Thread[] threads = new Thread[4];
        for (int i = 0; i < 4; i++) {
            threads[i] = new Task(it);
            threads[i].start();
        }
        // 等待执行完成
        for (int i = 0; i < 4; i++) {
            threads[i].join();
        }
        System.out.println("done!!");
    }

    private static class Task extends Thread {
        final Iterator<Integer> it;

        public Task(Iterator<Integer> it) {
            this.it = it;
        }

        @Override
        public void run() {
            Integer data = null;
            while (true) {
                // 多线程需要同步
                synchronized (it) {
                    if (it.hasNext()) {
                        data = it.next();
                    } else {
                        // 没有数据要处理了，跳出循环
                        break;
                    }
                }
                process(data);
            }
        }

        private void process(Integer data) {
            System.out.println(data);
        }
    }
}
