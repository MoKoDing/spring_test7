import annotation.dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
//        初始化Spring容器ApplicationContext,加载配置文件
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过容器获取test实例
        TestDao dao1=(TestDao) applicationContext.getBean("test");//test是配置文件中的id
        dao1.sayHello();
    }
}
