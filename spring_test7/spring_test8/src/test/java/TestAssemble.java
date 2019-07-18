import assemble.ComplexUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssemble {
    public static void main(String[] args){
        /*初始化Spring容器ApplicationContext,加载配置文件*/
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        /*通过容器获取user1的实例*/
        ComplexUser user1=(ComplexUser) applicationContext.getBean("user1");
        /*通过容器获取user2的实例*/
        ComplexUser user2=(ComplexUser) applicationContext.getBean("user2");
        System.out.println(user1);
        System.out.println(user2);
    }
}
