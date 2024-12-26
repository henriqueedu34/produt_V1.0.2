package com.Stock.produt.itemDto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ItemDto {
    private String name;

    private BigDecimal value;

    private LocalDate expirationDate;

    private LocalDate localDate;
}
