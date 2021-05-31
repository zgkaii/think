package org.zgkaii.string;


/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/26 16:02
 * @Description: StringBuilder与StringBuffer 线程安全测试
 **/
public class StringBuilderAndBuffer {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        stringBuilder.append("a");
                        stringBuffer.append("b");
                    }
                }
            }).start();
        }

        Thread.sleep(1000);
        System.out.println(stringBuilder.length()); // 9996
        System.out.println(stringBuffer.length()); // 1000
    }

// StringBuilder中append  count += len 不是原子操作
//    @Override
//    public StringBuilder append(String str) {
//        super.append(str);
//        return this;
//    }
//   === >
//    public AbstractStringBuilder append(String str) {
//        if (str == null)
//            return appendNull();
//        int len = str.length();
//        ensureCapacityInternal(count + len);
//        str.getChars(0, len, value, count);
//        count += len;
//        return this;
//    }

// StingBuffer append 加synchronized锁
//    @Override
//    public synchronized StringBuffer append(String str) {
//        toStringCache = null;
//        super.append(str);
//        return this;
//    }
}
