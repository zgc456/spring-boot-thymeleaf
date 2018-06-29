package com.zheng.controller;

import com.zheng.model.TestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/29 15:23
 */
@Controller
public class ReturnController {
    @RequestMapping("/index")
    public String index(Model model){
       model.addAttribute("index","小红");
        List lists=new ArrayList();
        lists.add("123");
        lists.add(2);
        List<TestEntity> list2=new ArrayList();
        TestEntity testEntity=new TestEntity();
        testEntity.setName("小红");
        list2.add(testEntity);
        model.addAttribute("lists",lists);
        model.addAttribute("listEntity",list2);
        return "index";
    }
}
