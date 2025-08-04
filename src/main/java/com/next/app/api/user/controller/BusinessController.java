package com.next.app.api.user.controller;

import com.next.app.api.user.entity.Business;
import com.next.app.api.user.entity.Product;
import com.next.app.api.user.service.BusinessService;
import com.next.app.api.user.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/businesses")
@Tag(name = "Business Controller", description = "사업자 관리 API")
@CrossOrigin(origins = "http://localhost")

public class BusinessController {

    private final BusinessService businessService;

    @Autowired
    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }
    @GetMapping
    public List<Business> getAllBusinesses() {
        return businessService.getAllBusinesses();
    }
    @GetMapping("/{id}")
    public Business getBusinessById(@PathVariable Long id) {
        return businessService.getBusinessById(id);
    }
    @PostMapping
    public Business save(@RequestBody Business business) {
        return businessService.save(business);
    }
    @PutMapping("/{id}")
    public Business update(@PathVariable Long id, @RequestBody Business business) {
        return businessService.update(id, business);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        businessService.delete(id);
    }
}
