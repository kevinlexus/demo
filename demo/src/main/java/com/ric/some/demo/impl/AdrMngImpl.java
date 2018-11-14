package com.ric.some.demo.impl;

import com.ric.some.demo.AdrMng;
import com.ric.some.demo.Street;
import com.ric.some.demo.dao.StreetDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdrMngImpl implements AdrMng {

    @Autowired
    private StreetDAO streetDao;

    @Override
    public List<Street> getAllStreets() {
        return streetDao.findAll();
    }
}
