package com.payment.module.payment.b.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    private int accountId;
    private String customerName;
    private int balanceAmount;
    private int transactionAmount;


}
