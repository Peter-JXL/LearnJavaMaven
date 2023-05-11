package com.peterjxl.test;

import com.peterjxl.dao.ItemsDao;
import com.peterjxl.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void findById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中拿到所需的dao的代理对象
        ItemsDao itemDao = ac.getBean("itemsDao", ItemsDao.class);
        Items items = itemDao.findById(1);
        System.out.println(items);
    }
}
