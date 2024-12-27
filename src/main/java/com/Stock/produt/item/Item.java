package com.Stock.produt.item;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "ITENS")
public class Item {
    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true, name = "Name_produt")
    private String name;

    @Column(name = "\"value\"")
    private BigDecimal value;

    @Column(name = "Data_validade")
    private LocalDate expirationDate;

    private LocalDate localDate;

    @PrePersist
    public void prePersist() {
        this.localDate = LocalDate.now();
    }
}
