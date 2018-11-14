package com.ric.some.demo.dao;

import com.ric.some.demo.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetDAO extends JpaRepository<Street, Integer> {

}
