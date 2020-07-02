package com.lks.platform.controller;

import com.lks.platform.sdk.ITestService;
import com.lks.platform.sdk.vo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class TestController {
    @Autowired
    private ITestService testService;

    @GetMapping("/test1")
    public Object test1(){
        QueryVo query1=new QueryVo();
        query1.setAddr("dsf1");
        query1.setName("cdsc1");

        QueryVo query2=new QueryVo();
        query1.setAddr("dsf2");
        query1.setName("cdsc2");

        return testService.getUserList1("12",query1,query2);
    }

    @GetMapping("/test2")
    public Object test2(){
        QueryVo query1=new QueryVo();
        query1.setAddr("dsf1");
        query1.setName("cdsc1");

        QueryVo query2=new QueryVo();
        query1.setAddr("dsf2");
        query1.setName("cdsc2");

        return testService.getUserList2("12",query1);
    }

}
