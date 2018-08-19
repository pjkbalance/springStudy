package cn.jk.study.spring8;

import cn.jk.study.spring8.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiakang.peng on 2018/8/19.
 */
public class Index {
    public static void main(String... args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("cn/jk/study/spring8/beans.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.add();
        userService.add();
        userService.update(2);
        userService.add();
        userService.delete(1);
        userService.update(3);
    }
}
