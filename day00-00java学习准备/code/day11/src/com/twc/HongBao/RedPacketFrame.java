package com.twc.HongBao;

import javax.swing.*;

public  abstract class RedPacketFrame extends JFrame {
/*
 群主名称
 */
  public String ownerName = "谁谁谁";
  /* openMode  红包的类型[普通红包或者手气红包]
   */
  public OpenMode openMode  = null ;
  /*
    构造方法：生成红包界面
    @param title  页面的标题

   */
  public RedPacketFrame(String title){
      super(title);
      //页面初始化
      //init();

  }
  /*
  set方法
   */
  public void setOwnerName(String ownerName){
      this.ownerName = ownerName;
  }
  public void setOpenMode(OpenMode openMode){
      this.openMode = openMode;
}



}
