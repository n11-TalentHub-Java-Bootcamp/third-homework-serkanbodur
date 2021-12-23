package com.example.thirdhomework.entityservice;

import com.example.thirdhomework.entity.ProductComment;

import java.util.List;
import java.util.Optional;

public interface ProductCommentEntityService {
    List<ProductComment> findAll();
    ProductComment findById(String id);
    ProductComment save(ProductComment productComment);
    void deleteById(String id);
}
