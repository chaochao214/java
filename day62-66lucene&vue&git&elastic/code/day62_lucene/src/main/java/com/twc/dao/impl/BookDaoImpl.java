package com.twc.dao.impl;

import com.twc.dao.BookDao;
import com.twc.domain.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BookDaoImpl
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/6/15 16:15
 * @Version V1.0
 */
public class BookDaoImpl implements BookDao {

    @Override
    public List<Book> queryBookList() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///day62lucene", "root", "root");
        String sql = "select * from book";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Book> list = new ArrayList<Book>();
        while(rs.next()){
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setName(rs.getString("name"));
            book.setPrice(rs.getFloat("price"));
            book.setDesc(rs.getString("desc"));
            book.setPic(rs.getString("pic"));
            list.add(book);
        }
        return list;
    }
}
