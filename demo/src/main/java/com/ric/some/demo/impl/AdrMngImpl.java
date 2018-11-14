package com.ric.some.demo.impl;

import com.ric.some.demo.AdrMng;
import com.ric.some.demo.Street;
import com.ric.some.demo.dao.StreetDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class AdrMngImpl implements AdrMng {

    @Autowired
    private StreetDAO streetDao;
    @Autowired
    EntityManager em;

    @Override
    @Transactional
    public void printAllStreets() {
        Street street = new Street();
        street.setId(5);
        street.setName("Блабла");
        em.persist(street);
        streetDao.findAll().stream().forEach(t-> {
            System.out.println(String.valueOf(t.getId())+" "+t.getName()+"|");
        });
    }
}
