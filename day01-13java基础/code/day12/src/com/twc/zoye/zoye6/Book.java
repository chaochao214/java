package com.twc.zoye.zoye6;

public class Book extends  BookSuper{

    //书名
    private String name;
    //出版社
    private String publishingCompany;

    public Book() {
    }

    public Book(String name, String publishingCompany) {
        this.name = name;
        this.publishingCompany = publishingCompany;
    }

    //bookMsg()拼接带书名号的书名
    public   String bookMsg(String bookname) {
        return "《" + bookname + "》";
    }

    //publishingMsg()拼接出版信息
    public   String publishingMsg(String msg) {
        return "【专柜正品<" + msg + ">原装绝版】";
    }

    //packSaleMsg()使用StringWrapper为上架销售信息包装
    public String packSaleMsg(String msg, StringWrapper wrapper) {
        return wrapper.wrap(msg);
    }

    //sale()上架销售
    public void sale() {
        //开始包装上架销售信息
        //??? publishingMsg 什么时候被调用了

        //  没有缩写
       /* String saleMsg = packSaleMsg(name, new StringWrapper() {
            @Override
            public String wrap(String str) {
                return bookMsg(name);
            }
        })
        +  packSaleMsg(publishingCompany, new StringWrapper() {
            @Override
            public String wrap(String str) {
                return publishingMsg(publishingCompany);
            }
        });
        //  lamda 表达式， 1.接口2.接口中有一个抽象方法
/*
        String saleMsg = packSaleMsg(name,name->{return bookMsg(name);})
                        + packSaleMsg(publishingCompany ,publishingCompany->{return publishingMsg(publishingCompany);});*/
         String saleMsg = packSaleMsg(name,this::bookMsg)+ packSaleMsg(publishingCompany,this::publishingMsg);
         String saleMsgBook = packSaleMsg(name,new Book()::bookMsg)+ packSaleMsg(publishingCompany,new Book()::publishingMsg);
     //   String saleMsgSuper = packSaleMsg(name,super::bookMsg)+ packSaleMsg(publishingCompany,super::publishingMsg);
     //   String saleMsgT = packSaleMsg(name,new BookT()::bookMsg)+ packSaleMsg(publishingCompany,new BookT()::publishingMsg);
        //String saleMsg = packSaleMsg(name,this::bookMsg) + packSaleMsg(publishingCompany,this::publishingMsg);

       // System.out.println(saleMsg);

        //开始售卖
      //  System.out.println("2元一本，欲练此功，必先购买！");
    }
}
