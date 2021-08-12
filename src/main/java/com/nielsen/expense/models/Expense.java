package com.nielsen.expense.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.With;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@With
public class Expense
{
    @Getter
    private int id;
    @Getter
    private String name;
    @Getter
    private float price;
    @Getter
    private LocalDateTime expenseDate;

    public Expense(int id, String name, float price, LocalDateTime expenseDate)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.expenseDate = expenseDate;
    }
}


