package com.ecom.serviceImpl;

import com.ecom.entity.Product;
import com.ecom.payload.ProductDto;
import com.ecom.repository.ProductRepo;
import com.ecom.service.ProductServiceI;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductServiceI {
    @Autowired
    private ProductRepo productRepo;
    
    @Autowired
    private ModelMapper mapper;

    List<Product> list = new ArrayList<>();

    // create Product
    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = this.mapper.map(productDto, Product.class);
        Product saved = this.productRepo.save(product);
        return this.mapper.map(saved,ProductDto.class);
    }

    // update product
    @Override
    public ProductDto updateproduct(ProductDto newProduct, Integer productId) {
        Product product = productRepo.findById(productId).get();

        return null;
    }
    //get Product
    @Override
    public ProductDto getProduct(int productId) {
        return null;
    }

    //get All Products
    @Override
    public List<ProductDto> getAllProducts() {
        return null;
    }
    //delete Product
    @Override
    public void deleteProduct(Integer productId) {

    }



}
