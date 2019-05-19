package com.cumberlands.student.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity(name = "STUDENT")
//@Accessors(chain = true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@AllArgsConstructor
//@NoArgsConstructor(force = true)
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID", unique = true, nullable = false)
    private Long studentID;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "AGE")
    private String age;

    @Column(name = "DOB")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date DOB;

    @Column(name = "USERBNAME")
    private String  userName;

    @Column(name = "PASSWORD")
    private String password;


    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Address> address;


    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Payment> payments;



}
