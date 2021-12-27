package com.example.thirdhomework.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "productcomment")
public class ProductComment {
    @Id
    private String id;
    private String comment;
    private Date commentDate;

    @Field("productId")
    private String productId;

    @Field("userId")
    private String userId;
}

