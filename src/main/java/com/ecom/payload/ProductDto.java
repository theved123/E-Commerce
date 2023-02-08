package com.ecom.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ProductDto {
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
