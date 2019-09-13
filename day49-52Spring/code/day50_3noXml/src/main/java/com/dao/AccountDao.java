package com.dao;

import com.domin.Account;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/26 20:22
 **/
public interface AccountDao {
    /**
     * 查询所有
     */
    List<Account> findAllAccount();

    /**
     * 查询一个
     */
    Account findAccountById(Integer accountId);

    /**
     * 保存
     */
    void saveAccount(Account account);

    /*

      更新
     */
    void updateAccount(Account account);

    /*
     删除
     */
    void deleteAccount(Integer accountId);


}
