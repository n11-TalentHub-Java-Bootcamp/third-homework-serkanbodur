package com.example.thirdhomework.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ProductCommentDTO {
    private String id;
    private String comment;
    private Date commentDate;
    private String productId;
    private String userId;
}
