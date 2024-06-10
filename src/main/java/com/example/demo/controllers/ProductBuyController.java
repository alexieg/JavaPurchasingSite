package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ProductBuyController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/purchaseProduct")
    public String purchaseProduct(@RequestParam Long productID, Model model) {
        Optional<Product> product = productRepository.findById(productID);
        if (product.isPresent()) {
            Product a = product.get();

            if (a.getInv() > 0) {
                a.setInv(a.getInv() - 1);
                productRepository.save(a);
                model.addAttribute("message", "Purchase successful");
                return "redirect:/purchasestatus?success=true";
            }
        }

        model.addAttribute("message", "Purchase failed");
        return "redirect:/purchasestatus?success=false";

    }

    @GetMapping("/purchasestatus")
    public String purchaseStatus(@RequestParam boolean success, Model model) {
        if (success) {
            model.addAttribute("message", "Purchase successful");
            return "/purchasestatus";
        } else {
            model.addAttribute("message", "Purchase failed");
        }

        return "purchaseStatus";

    }



}
