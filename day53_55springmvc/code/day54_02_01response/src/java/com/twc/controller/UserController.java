package com.twc.controller;

import com.twc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: twc
 * @Date 2019/6/2 20:01
 **/
@Controller
@RequestMapping(path = "/user")
public class UserController {
    @RequestMapping(path = "/testReturnString")
    public String testReturnString() {
        System.out.println("执行了testReturnString的方法");
        return "success";
}

    /**
     * 请求参数的绑定
     */
    @RequestMapping(path = "/userUpdate")
    public String update(String username,String password,Model model) {
        /**
         *  model的数值该怎么传入
         */
       /* User user = new User();
        user.setUsername("张三");
        user.setAge(11);*/

      //  model.addAttribute("user", user);
        return "update";
    }

    @RequestMapping(path = "/testVoid")
    public void testVoid() {

        System.out.println("执行了testVoid的方法");
    }

    @RequestMapping(path = "testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setUsername("张 ");
        user1.setAge(123);

        User use2 = new User();
        use2.setAge(11);
        use2.setUsername("赵四");

        list.add(user1);
        list.add(use2);

        mv.addObject("list", list);
        return mv;
    }

    /**
     * @return 使用forward关键字进行请求转发
     * forwar: 转发路径。 不走视图解析器房，所以需要编写完整的路径
     */

    @RequestMapping("/testForwardOrRedirect2")
    public String testForwardRedirect2() {
        System.out.println(" testForwardRedirct方法的问题");

        return "forward:/user/testReturnString";
    }

    /**
     * redirect实现重定向的问题
     *
     * @return
     */

    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect() throws Exception {
        System.out.println("方法执行重定向的问题");
        //为什么要报错啊，搞不明白的问题
        //return "redirect:/index.jsp";
        return "redirect:/user/testReturnString";
    }

    /**
     * 获取请求体的数据问题
     *
     * @param body
     */
    @RequestMapping("/testJson")
    public @ResponseBody
    User testJson(@RequestBody String body) {
        System.out.println(body);
        User u = new User();
        u.setUsername("张三");
        u.setAge(11);
        return u;
    }
}
