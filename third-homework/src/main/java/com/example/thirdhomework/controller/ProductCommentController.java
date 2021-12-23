package com.example.thirdhomework.controller;

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
    public ResponseEntity<List<ProductComment>> findAllComments()
    {
        var comments = productCommentEntityService.findAll();
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }

    @GetMapping({"id"})
    public ResponseEntity<ProductComment> findById(@PathVariable String id)
    {
        var productComment = productCommentEntityService.findById(id);
        return new ResponseEntity<>(productComment,HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<ProductComment> save(@RequestBody ProductComment productComment)
    {
        var responseComment = productCommentEntityService.save(productComment);
        return new ResponseEntity<>(responseComment,HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteById(@RequestParam String id)
    {
        productCommentEntityService.deleteById(id);
        return new ResponseEntity<>("The comment was deleted as successfully",HttpStatus.OK);
    }
}
