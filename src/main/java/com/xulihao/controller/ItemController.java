package com.xulihao.controller;

import com.xulihao.pojo.Item;
import com.xulihao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("showItem")
    public String showItem(@RequestParam("id") int id, Model model){
        Item item = itemService.findById(id);
        model.addAttribute("item",item);
        System.out.println("来了");
        return "item";
    }

}
