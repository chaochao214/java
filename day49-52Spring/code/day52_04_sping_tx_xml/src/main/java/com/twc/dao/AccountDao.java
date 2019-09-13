package com.twc.dao;


import com.twc.domain.Account;

public interface AccountDao {

    // ID查询
    public Account findAccountById(Integer id);

    // 按照名称查询（返回唯一的结果）
    public Account findAccountByName(String name);

    // 更新
    public void updateAccount(Account account);
}
