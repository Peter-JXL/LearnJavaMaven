package com.peterjxl.service.impl;

import com.peterjxl.dao.ItemsDao;
import com.peterjxl.domain.Items;
import com.peterjxl.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
