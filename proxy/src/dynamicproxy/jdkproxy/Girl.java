package dynamicproxy.jdkproxy;

import com.lwh.proxy.Person;
import com.lwh.proxy.Purpose;
import com.lwh.proxy.Work;

/**
 * Created by Tom on 2019/3/10.
 */
public class Girl implements Person {
    private String name;
    private String age;

    public Girl() {
    }

    public Girl(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
        return 11;
    }


    @Override
    public Girl info() {
        return new Girl("小丽","25");
    }
}
