package com.payment.module.payment.b.api.dao;

import com.payment.module.payment.b.api.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account, Integer> {
    Account findByAccountId(int accountId);
}
