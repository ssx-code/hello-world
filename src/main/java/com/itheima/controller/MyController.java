package com.itheima.controller;


import com.itheima.domain.Forms;
import com.itheima.service.impl.FormServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MyController {

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping("save.do")
    public void form(Forms forms){

        //获取表单 保存到数据库
        System.out.println(forms);

        FormServiceImpl formService = new FormServiceImpl();
        formService.saveUser(forms);


    }

}
