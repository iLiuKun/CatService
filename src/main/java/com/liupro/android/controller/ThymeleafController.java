package com.liupro.android.controller;

import com.liupro.android.pojo.CatImage;
import com.liupro.android.service.CatImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("th")
public class ThymeleafController {

    @Autowired
    private CatImageServiceImpl catImageServiceImpl;
    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name","thymeleaf-index");
        return "index";
    }

    @RequestMapping("/catImages")
    public String catimages(ModelMap map){
        CatImage catImage = new CatImage();
        catImage.setUrl("");
        catImage.setId("");
        map.addAttribute("catImage",catImage);
        return "catimages";
    }

    @PostMapping("/postform")
    public String postform(CatImage catImage) throws Exception {
        catImageServiceImpl.saveCatImage(catImage);

        System.out.println("姓名：" + catImage.getId());
        System.out.println("年龄：" + catImage.getUrl());

        return "redirect:/th/catImages";
    }

}
