package staticproxy;


import com.lwh.proxy.Person;
import dynamicproxy.jdkproxy.Girl;

/**
 * Created by Tom on 2019/3/10.
 */
public class Son implements Person {

    public int findLove(){
        System.out.println("儿子要求：肤白貌美大长腿");
        return 0;
    }

    @Override
    public Girl info() {
        return null;
    }

    public void findJob(){

    }

    public void eat(){

    }

}
