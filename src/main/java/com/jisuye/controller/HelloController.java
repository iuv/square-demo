package com.jisuye.controller;

import com.jisuye.annotations.web.Controller;
import com.jisuye.annotations.web.GetMapping;
import com.jisuye.annotations.web.RequestParam;
import com.jisuye.entity.AbcEntity;
import com.jisuye.mapper.AbcMapper;

import javax.annotation.Resource;
import java.util.List;

@Controller("/")
public class HelloController {

    @Resource
    private AbcMapper abcMapper;

    @GetMapping("/id")
    public String selectAbc(@RequestParam("id") int id) {
        List<AbcEntity> list = abcMapper.selectAbc(id);
        if(list != null && list.size()>0){
            return "success! name is : " + list.get(0).getName();
        } else {
            return "error! select by db.";
        }
    }
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return "hello "+name;
    }
}
