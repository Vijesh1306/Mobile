package com.spring.MobileCart.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter


@Table(name ="mobile_details")

public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "name")
    private String Name;
    @Column(name="model")
    private String Model;
    @Column(name="price")
    private double Price;
    @Column(name="ramSize")
    private String RamSize;
    @Column(name="isDuelSimSupported")
    private boolean IsDuelSimSupported;
    @Column(name="isFmSupported")
    private boolean IsFmSupported;
    private String U_name;
    private String description;

}

