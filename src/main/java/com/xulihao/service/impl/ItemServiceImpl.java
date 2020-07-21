package com.xulihao.service.impl;

import com.xulihao.dao.ItemDao;
import com.xulihao.pojo.Item;
import com.xulihao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    //查询方法采用默认传播属性，设置只读为true，提高查询效率
    public Item findById(int id) {
        return itemDao.selectItemByid(id);
    }
}
