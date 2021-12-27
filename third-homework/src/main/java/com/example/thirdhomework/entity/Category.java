package com.example.thirdhomework.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "category")
public class Category {
    @Id
    private String id;
    private String name;
    private Long breakdown;
    private Category topCategory;

    @DBRef
    private List<ProductComment> productComments;
}
