package annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao{
    @Override
    public void test() {
        System.out.println("dao层的test方法");
    }
}
