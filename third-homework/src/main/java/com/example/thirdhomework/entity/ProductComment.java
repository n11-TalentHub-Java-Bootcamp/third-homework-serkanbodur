package com.example.thirdhomework.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@Document(collection = "productcomment")
public class ProductComment implements Serializable{
    @Id
    private String id;

    @Column(length = 500)
    private String comment;

    private Date commentDate;

    @Field("productId")
    private String productId;

    @Field("userId")
    private String userId;
}

