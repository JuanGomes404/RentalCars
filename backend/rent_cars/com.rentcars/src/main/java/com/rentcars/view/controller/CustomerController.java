package com.rentcars.view.controller;


import com.rentcars.base.BaseController;
import com.rentcars.model.customer.dto.CreateCustomer;
import com.rentcars.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController extends BaseController {

    @Autowired
    CustomerService customerService;

    @PostMapping(name = "/register")
    @Transactional
    public ResponseEntity<CreateCustomer> register(@RequestBody CreateCustomer dto){
        return ResponseEntity.ok(this.customerService.register(dto));
    }
}
