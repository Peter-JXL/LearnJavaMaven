package com.peterjxl.test;

import com.peterjxl.dao.ItemsDao;
import com.peterjxl.domain.Items;
import com.peterjxl.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void findById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // dao测试
        ItemsDao itemDao = ac.getBean("itemsDao", ItemsDao.class);
        Items items = itemDao.findById(1);
        System.out.println(items);

        //service测试
        ItemsService itemsService = ac.getBean(ItemsService.class);
        Items items1 = itemsService.findById(1);
        System.out.println(items1);

    }
}
