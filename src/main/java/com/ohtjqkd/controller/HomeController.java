package com.ohtjqkd.controller;

import com.ohtjqkd.daos.ProductDao;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController

@Controller
@Log4j2
@RequestMapping("/")
public class HomeController {
    @Autowired
    ProductDao productDao;
    @GetMapping({"/", "index"})
    public String homeController() {
        log.info("in Controller");
        return "/index";
    }
//    @GetMapping
//    public HashMap<String, Object> product() {
//        HashMap<String, Object> map = new HashMap<String, Object>();
//
////        System.out.println(categoryId);
//        map.put("index", productDao.getAllProducts());
//        return map;
//    }
//    public Map {
//        List<ProductDto> ret = productDao.getAllProducts();
//        for (ProductDto product:ret) {
//            System.out.println(product.getName());
//        }
//        System.out.println("hi");
//
//        return "index";
//    }


}
