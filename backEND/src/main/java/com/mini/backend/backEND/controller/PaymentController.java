package com.mini.backend.backEND.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mini.backend.backEND.service.PayPalClient;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping(value = "/paypal")
public class PaymentController {

   
    private final PayPalClient payPalClient;

   
  
    @PostMapping(value = "/make/payment")
    public Map<String, Object> makePayment(@RequestParam("sum") String sum){
        return payPalClient.createPayment(sum);
    }
    @PostMapping(value = "/complete/payment")
     
    public Map<String, Object> completePayment(HttpServletRequest request){
    return payPalClient.completePayment(request);

    
}
    
}
