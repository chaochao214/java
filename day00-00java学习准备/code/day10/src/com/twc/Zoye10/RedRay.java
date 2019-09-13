package com.twc.Zoye10;

public interface RedRay {
     abstract  void   controlTV(TV tv);
     default   void   connecting(){
         System.out.println("外接设备连接成功，可以使用红外线");
     }

}
