package com.nielsen.expense.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.With;

import java.sql.Timestamp;
import java.time.LocalDateTime;

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
    @Getter
    private Timestamp timestamp;

    public Expense(int id, String name, float price, LocalDateTime expenseDate, Timestamp timestamp)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.expenseDate = expenseDate;
        this.timestamp = timestamp;
    }
}


