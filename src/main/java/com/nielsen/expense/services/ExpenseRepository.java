package com.nielsen.expense.services;

import com.nielsen.expense.models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long>
{

}
