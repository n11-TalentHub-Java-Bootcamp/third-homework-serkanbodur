package com.example.thirdhomework.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Document(collection = "category")
public class Category implements Serializable {
    @Id
    private String id;
    private String name;
    private Long breakdown;
    private Category topCategory;

    @DBRef
    private List<ProductComment> productComments;
}
