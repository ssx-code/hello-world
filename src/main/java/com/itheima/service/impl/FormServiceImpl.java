package com.itheima.service.impl;

import com.itheima.dao.FormDao;
import com.itheima.dao.impl.FormDaoImpl;
import com.itheima.domain.Forms;

public class FormServiceImpl implements com.itheima.service.FormService{
    @Override
    public void saveUser(Forms forms) {
        FormDao formDao = new FormDaoImpl();
        formDao.saveUser(forms);

    }
}
