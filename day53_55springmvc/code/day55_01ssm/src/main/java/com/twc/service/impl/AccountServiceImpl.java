package com.twc.service.impl;

import com.twc.dao.IAccountDao;
import com.twc.domain.Account;
import com.twc.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/6/3 10:57
 **/
@Service("accountService")
@Transactional
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public void saveAccount(Account account) {
        System.out.println("seviceImpl 保存用户");
        accountDao.save(account);
    }


    @Override
    public List<Account> findAllAccount() {
        System.out.println("业务层实现,查询所有的账户...");
        return accountDao.findAll();
    }
}
