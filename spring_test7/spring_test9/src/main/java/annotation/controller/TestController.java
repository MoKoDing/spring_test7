package annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import annotation.service.TestService;

@Controller
public class TestController {
    @Autowired
    private TestService testService;
    public void test(){
        testService.test();
        System.out.println("controller层的test方法");
    }
}
