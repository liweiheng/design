package staticproxy;


import com.lwh.proxy.Person;
import dynamicproxy.jdkproxy.Girl;

/**
 * Created by Tom on 2019/3/10.
 */
public class Father implements Person {
    private Son person;

    public Father(Son person){
        this.person = person;
    }

    public int findLove(){
        System.out.println("父亲物色对象");
        this.person.findLove();
        System.out.println("双方父母同意，确立关系");
        return 0;
    }

    @Override
    public Girl info() {
        return null;
    }

    public void findJob(){

    }


}
