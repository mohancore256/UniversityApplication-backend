package com.cumberlands.student.Services;


import com.cumberlands.student.Models.Payment;
import com.cumberlands.student.Repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    @Autowired
    public PaymentRepository paymentRepository;

    public Payment addCreditCard(Payment Card){
        return paymentRepository.save(Card);
    }

//    public CreditCard getCreditCard(Long creditCardId){
//        return creditCardRepository.findById(creditCardId);
//    }

}
