package com.example.thirdhomework.entityservice.impl;

import com.example.thirdhomework.converter.ProductCommentConverter;
import com.example.thirdhomework.dto.ProductCommentDTO;
import com.example.thirdhomework.entity.ProductComment;
import com.example.thirdhomework.entityservice.ProductCommentEntityService;
import com.example.thirdhomework.exception.CommentIsNotExistException;
import com.example.thirdhomework.repository.ProductCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductCommentEntityServiceImpl implements ProductCommentEntityService {

    private final ProductCommentRepository productCommentRepository;

    public List<ProductCommentDTO> findAll() {
        var comments = productCommentRepository.findAll();
        if(comments.isEmpty()) {
            throw new CommentIsNotExistException("There is no comment to show!");
        }
        return ProductCommentConverter.INSTANCE.convertProductCommentsToProductCommentDTOs(comments);
    }

    public ProductCommentDTO findById(String id) {
        Optional<ProductComment> productComment = productCommentRepository.findById(id);
        if (!(productComment.isPresent())) {
            throw new CommentIsNotExistException("The comment with " + id + " id number is not found!");
        }
        return ProductCommentConverter.INSTANCE.convertProductCommentToProductCommentDTO(productComment.get());
    }

    @Override
    public ProductCommentDTO save(ProductCommentDTO productCommentDTO) {
        var comment = ProductCommentConverter.INSTANCE.convertProductCommentDTOToProductComment(productCommentDTO);
        productCommentRepository.save(comment);
        return ProductCommentConverter.INSTANCE.convertProductCommentToProductCommentDTO(comment);
    }

    public void deleteById(String id) {
        productCommentRepository.findById(id).orElseThrow(() -> new CommentIsNotExistException("The comment with " + id + " id number is found!"));
        productCommentRepository.deleteById(id);
    }
}
