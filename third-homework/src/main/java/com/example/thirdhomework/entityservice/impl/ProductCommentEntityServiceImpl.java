package com.example.thirdhomework.entityservice.impl;

import com.example.thirdhomework.entity.ProductComment;
import com.example.thirdhomework.entityservice.ProductCommentEntityService;
import com.example.thirdhomework.repository.ProductCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductCommentEntityServiceImpl implements ProductCommentEntityService {

    private final ProductCommentRepository productCommentRepository;

    public List<ProductComment> findAll()
    {
        return productCommentRepository.findAll();
    }

    public ProductComment findById(String id)
    {
        Optional<ProductComment> productComment = productCommentRepository.findById(id);
        if(productComment.isPresent())
        {
            return productComment.get();
        }
        return null;
    }

    public ProductComment save(ProductComment productComment)
    {
        productComment=productCommentRepository.save(productComment);
        return productComment;
    }

    public void deleteById(String id)
    {
        productCommentRepository.deleteById(id);
    }
}
