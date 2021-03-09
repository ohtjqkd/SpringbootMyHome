package com.ohtjqkd.controller;

import com.ohtjqkd.daos.ProductDao;
import com.ohtjqkd.dtos.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/find")
public class FindProdController {
    @Autowired
    private ProductDao productDao;

    @GetMapping
    public String getProducts(Model model) {
        Map<String, List<ProductDto>> map = new HashMap<String, List<ProductDto>>();
        List<ProductDto> resultArr = productDao.getAllProducts();
        model.addAttribute("productList", null);
        return "/find";
    }
    @GetMapping("/all")
    public String getAllProduct(Model model) {
        Map<String, List<ProductDto>> map = new HashMap<String, List<ProductDto>>();
        List<ProductDto> resultArr = productDao.getAllProducts();
        model.addAttribute("productList", resultArr);
        return "/find::#item-list";
    }
}
