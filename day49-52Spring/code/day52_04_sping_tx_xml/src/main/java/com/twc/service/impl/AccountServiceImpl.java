package com.twc.service.impl;

import com.twc.dao.AccountDao;
import com.twc.domain.Account;
import com.twc.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;


/**
 * @Author: twc
 * @Date 2019/5/31 10:04
 **/
public class AccountServiceImpl implements AccountService {

    AccountDao accountDao;

    //代码侵入
    TransactionTemplate transactionTemplate;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }


    @Override
    public void transfer(final String fromName, final String toName, final float money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                System.out.println(transactionStatus.isCompleted()+" "+ transactionStatus.isNewTransaction());
                // 1：使用转账人的账号查询数据库，获取转账人的账号信息Account
                Account fromAccount = accountDao.findAccountByName(fromName);
                // 2：使用收账人的账号查询数据库，获取收账人的账号信息Account
                Account toAccount = accountDao.findAccountByName(toName);
                // 3：转账人的账号-100
                fromAccount.setMoney(fromAccount.getMoney()-money);
                // 4：收账人的账号+100
                toAccount.setMoney(toAccount.getMoney()+money);
                // 5：更新转账人的账号信息
                accountDao.updateAccount(fromAccount);
                // 抛出异常
               // int i = 10/0;
                // 6：更新收账人的账号信息
                accountDao.updateAccount(toAccount);
            }
        });

    }
}
