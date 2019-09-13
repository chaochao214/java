package com.twc.web.controller;

import com.twc.domain.Account;
import com.twc.service.IAccountService;
import com.twc.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/6/3 11:09
 **/
@Controller
@RequestMapping(path = "/account")
public class accountController {
    @Autowired
    private IAccountService accountService;


    /**
     * 查询所有的用户问题
     *
     * @return
     */
    @RequestMapping(path = "/findAllAccount")
    // Model的具体操作？
    public String findAllAccount(Model model) {

        System.out.println("表现层，执行查找所有的用户");
        List<Account> list = accountService.findAllAccount();
        System.out.println(list);
        model.addAttribute("list", list);
        return "success";
    }

    /**
     * 保存用户
     */
    @RequestMapping(path = "/save")
    public String saveAccount(Account account) {
        System.out.println("表现层，保存账户");
        accountService.saveAccount(account);
        return "redirect:/account/findAllAccount";
    }
}
