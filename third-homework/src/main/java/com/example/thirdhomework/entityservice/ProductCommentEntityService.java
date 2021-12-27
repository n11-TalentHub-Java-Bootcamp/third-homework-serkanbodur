package com.example.thirdhomework.entityservice;

import com.example.thirdhomework.dto.ProductCommentDTO;
import com.example.thirdhomework.entity.ProductComment;

import java.util.List;

public interface ProductCommentEntityService {
    List<ProductCommentDTO> findAll();
    ProductCommentDTO findById(String id);
    ProductCommentDTO save(ProductCommentDTO productCommentDTO);
    void deleteById(String id);
}
