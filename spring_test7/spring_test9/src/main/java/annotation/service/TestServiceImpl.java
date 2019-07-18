package annotation.service;

import annotation.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService{

    @Resource
    private TestDao testDao;
    @Override
    public void test() {
       testDao.test();
        System.out.println("service层的test方法");
    }
}
