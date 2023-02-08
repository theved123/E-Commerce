package com.ecom.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String productName;
    private  String productDesc;
    private  Double productPrice;
    private  Integer productQuantity;
    private boolean live;
    private  String imageName;
    private boolean stock=true;

}
