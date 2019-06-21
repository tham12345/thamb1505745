/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nganhangmau.dao;

import java.util.List;
import java.util.Map;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TranTham
 */
@Repository
@Transactional
public class dao {
    
    @Autowired
    private JdbcTemplate jdbctemplate;
    public List<Map<String , Object>> getBN(){
        final String sql = "select * from benhnhan";
        return jdbctemplate.queryForList(sql);
    }
}
