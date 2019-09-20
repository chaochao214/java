package com.twc.dao;

import com.twc.domain.Book;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/6/15 21:40
 **/
public interface BookDao {
      List<Book> queryBookList()  throws  Exception;

}
