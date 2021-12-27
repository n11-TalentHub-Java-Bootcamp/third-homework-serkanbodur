package com.example.thirdhomework.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Document(collection = "product")
public class Product implements Serializable {

    @Id
    private String id;
    private String name;
    private BigDecimal price;
    private Date registrationDate;

    @DBRef
    private List<ProductComment> productCommentList;
}
