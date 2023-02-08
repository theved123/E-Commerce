package com.ecom.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ecom.payload.ProductDto;
import com.ecom.service.ProductServiceI;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServiceI productServiceI;


    // create Product
    @PostMapping("/")
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto product) {


        ProductDto newProduct = productServiceI.createProduct(product);
        System.out.println("Product Created....");
        return new ResponseEntity<ProductDto>(newProduct, HttpStatus.CREATED);


    }

    // update Product
    @PutMapping("/{productId}")
    public ResponseEntity<ProductDto> updateproduct(@PathVariable("productId") Integer productId, @RequestBody ProductDto newProduct) {

        ProductDto updateproduct = this.productServiceI.updateproduct(newProduct, productId);
        return new ResponseEntity<ProductDto>(updateproduct, HttpStatus.ACCEPTED);


    }

    // get single product
    @GetMapping("/{productId}")
    public ProductDto getProduct(@PathVariable Integer productId) {

        ProductDto productid = this.productServiceI.getProduct(productId);

        return productid;

    }

    // get All Product
    @GetMapping("/")
    public ResponseEntity<List<ProductDto>> getAllProduct() {
        List<ProductDto> allProducts = this.productServiceI.getAllProducts();
        return new ResponseEntity<List<ProductDto>>(allProducts, HttpStatus.ACCEPTED);

    }


    // delete
    @DeleteMapping("/{productId}")
    public String deleteproduct(@PathVariable Integer productId) {
        productServiceI.deleteProduct(productId);

        return "product Delete Succefully...";

    }
}
