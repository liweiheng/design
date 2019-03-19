package dynamicproxy.gpproxy;


import com.lwh.proxy.Person;
import dynamicproxy.jdkproxy.Girl;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/10.
 */
public class GPProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new GPMeipo().getInstance(new Girl());
//            System.out.println(obj.getClass());
//            obj.findLove();
            Method method = obj.getClass().getMethod("info", null);
            method.invoke(obj);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
