package org.acme.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;


@Entity
@Table(name = "product")
@Data
public class ProductEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private String category;

    private String model;

    private BigDecimal price;
}
