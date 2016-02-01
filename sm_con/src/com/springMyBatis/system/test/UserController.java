package com.springMyBatis.system.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springMyBatis.system.dao.UserDao;
import com.springMyBatis.system.model.User;

public class UserController {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao=(UserDao) ctx.getBean("userDao");
        User user=new User();
        //添加两条数据
        user.setCol1("99");
        user.setCol2("999");
        user.setCol3("9999");
        userDao.addUser(user);
        System.out.println("添加成功");
//        //查询数据
//        user.setCol1("99");
//        user.setCol2("999");
//        System.out.println(userDao.getUser(user).toString());
        //修改数据
//        user.setCol1("1");
//        user.setCol3("3");
//        userDao.updateUser(user);
//        System.out.println("修改成功");
//        //删除数据
//        userDao.deleteUser("7");
//        System.out.println("删除成功");
        
    }

}