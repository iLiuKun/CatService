package com.liupro.android.controller;

import com.liupro.android.pojo.CatImage;

import com.liupro.android.service.CatImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MabitsController {
    @Autowired
    private CatImageServiceImpl catImageServiceImpl;
    @RequestMapping("/save")
    public String saveCatImage() throws Exception{
        return "ceshi";
    }

//    @RequestMapping("/delete")
//    public String deleteUser(String id) {
//        catImageServiceImpl.deleteCatImage(id);
//        return "ceshi";
//    }
    @RequestMapping("/query")
    public CatImage query(String id) {
        System.out.println(catImageServiceImpl.queryCatImage(id));
        return catImageServiceImpl.queryCatImage(id);
    }

}
