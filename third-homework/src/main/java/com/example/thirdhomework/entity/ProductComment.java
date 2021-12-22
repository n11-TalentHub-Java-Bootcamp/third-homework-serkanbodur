package com.example.thirdhomework.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@Document(collection = "productcomment")
public class ProductComment {
    @Id
    private String id;

    @Column(length = 500)
    private String comment;

    private Date commentDate;
    private String productId;
    private String userId;
}

