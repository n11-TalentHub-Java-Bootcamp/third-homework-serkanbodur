package com.example.thirdhomework.controller;

import com.example.thirdhomework.dto.ProductCommentDTO;
import com.example.thirdhomework.entity.ProductComment;
import com.example.thirdhomework.entityservice.ProductCommentEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/comments/")

public class ProductCommentController {

    private final ProductCommentEntityService productCommentEntityService;

    @GetMapping()
    public ResponseEntity<List<ProductCommentDTO>> findAllComments()
    {
        var commentDTOs = productCommentEntityService.findAll();
        return new ResponseEntity<>(commentDTOs, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductCommentDTO> findById(@PathVariable String id)
    {
        var productCommentDTO = productCommentEntityService.findById(id);
        return new ResponseEntity<>(productCommentDTO,HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ProductCommentDTO> save(@RequestBody ProductCommentDTO productCommentDTO)
    {
        var responseCommentDTO = productCommentEntityService.save(productCommentDTO);
        return new ResponseEntity<>(responseCommentDTO,HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteById(@RequestParam String id)
    {
        productCommentEntityService.deleteById(id);
        return new ResponseEntity<>("The comment was deleted as successfully",HttpStatus.OK);
    }
}
