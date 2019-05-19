package com.cumberlands.student.Controllers;



import com.cumberlands.student.Models.Payment;
import com.cumberlands.student.Services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/creditCard")
public class PaymentController {

    @Autowired
    public PaymentService paymentService;

    @PostMapping(value = "/save")
    public Payment createCreditCard(@RequestBody  Payment card){
    return paymentService.addCreditCard(card);
    }

}
