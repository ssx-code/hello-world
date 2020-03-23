package com.itheima.dao.impl;

import com.itheima.dao.FormDao;
import com.itheima.domain.Forms;
import org.springframework.jdbc.core.JdbcTemplate;

public class FormDaoImpl implements FormDao {
    private  JdbcTemplate jdbcTemplate;
    @Override
    public void saveUser(Forms forms) {
        String sql = "insert into forms values(?,?,?,?)";
        jdbcTemplate.update(sql,forms.getId(),forms.getName(),forms.getSex(),forms.getRoom());
    }
}
