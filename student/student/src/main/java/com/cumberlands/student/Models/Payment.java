package com.cumberlands.student.Models;

import javax.persistence.*;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@Entity(name = "CARD")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CARD_ID")
    private Long CardId;

    @Column(name = "CARD_TYPE")
    private String cardType;

    @Column(name = "CARD_COMPANY")
    private String cardCompany;

    @Column(name = "Name_OnCard")
    private String nameOnCard;

    @Column(name = "CARD_NUMBER")
    private Long cardNumber;

    @Column(name = "CARD_EXPIREDATE")
    @JsonFormat(pattern = "MM-dd-yyyy")
    private Date expireDate;

    @Column(name = "CARD_PIN")
    private Integer cardPin;


    @ManyToOne
    @JoinColumn
    private Student student;

}
