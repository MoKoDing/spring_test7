import annotation.controller.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMore {
    public  static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("annotationContext.xml");
        TestController testController=(TestController) applicationContext.getBean("testController");
        testController.test();
    }
}
