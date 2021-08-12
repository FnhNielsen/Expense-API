package com.nielsen.expense.controllers;

import com.nielsen.expense.models.Expense;
import com.nielsen.expense.services.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expense")
public class ExpenseController
{
    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping
    public List<Expense> getAllExpenses()
    {
        return expenseRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Expense getExpense(long id)
    {
        return expenseRepository.getOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Expense postExpense(@RequestBody Expense expense)
    {
        return expenseRepository.saveAndFlush(expense);
    }

}
