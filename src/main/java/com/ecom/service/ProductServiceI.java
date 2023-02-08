package com.ecom.service;

import com.ecom.payload.ProductDto;

import java.util.List;

public interface ProductServiceI {
    /**
     * This method create new product
     * @since 1.0
     * @see-com.ecom.ProductController
     * @param-product
     * @return
     */
    public ProductDto createProduct(ProductDto product);

    public ProductDto updateproduct(ProductDto newProduct, Integer productId);

    public ProductDto getProduct(int productId);

    public List<ProductDto> getAllProducts();

    public void deleteProduct(Integer productId);

}
