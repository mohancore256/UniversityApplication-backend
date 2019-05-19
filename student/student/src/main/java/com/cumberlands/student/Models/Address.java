package com.cumberlands.student.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;


@Data
@Entity(name="ADDRESS")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESSID", unique = true, nullable = false)
    private Long addressId;

    @Column(name = "HOUSENUMBER")
    private String houseNumber;

    @Column(name = "STREETADDRESS")
    private String streetAddress;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "ZIP")
    private String zip;

    @Column(name = "Address_Type")
    private String addressType;

    @ManyToOne
    @JoinColumn
    private Student student;


}
