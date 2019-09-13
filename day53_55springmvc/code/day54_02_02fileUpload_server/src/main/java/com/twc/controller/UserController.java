package com.twc.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @Author: twc
 * @Date 2019/6/2 21:34
 **/

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @RequestMapping(path = "/testFileupload")
    public String testFileupload() {
        System.out.println("执行了testFileLoad方法");
        return "success";
    }

    @RequestMapping(path = "/testFileupload1")
    public String testFileupload1(HttpServletRequest request) throws Exception {
        System.out.println("执行了testFileLoad1方法");
        String path = request.getSession().getServletContext().getRealPath("upLoads");
        File file = new File(path);
        if (!file.exists()) {
            //文件不存在，则创建目录
            file.mkdirs();
        }
        //如果文件存在, 创建磁盘文件工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload fileUpload = new ServletFileUpload(factory);

        List<FileItem> list = fileUpload.parseRequest(request);
        for (FileItem fileItem : list) {
            if (fileItem.isFormField()) {
                //说明是普通的文本框

            } else {
                //一定文件上传项目
                //获取到的文件名称
                String filename = fileItem.getName();
                // 生成唯一标识
                String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
                filename = uuid + "_" + filename;
                fileItem.write(new File(file, filename));
                fileItem.delete();


            }
        }

        return "success";
    }

    public String testFileUpload2(HttpServletRequest request, MultipartFile upload) throws IOException {
        System.out.println("springmvc的文件上传");
        //上传的位置，获取项目根目录下uploads的文件夹路径
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        //获取文件的名称
        String filename = upload.getOriginalFilename();
        String uudi = UUID.randomUUID().toString();
        filename = uudi + filename;
        //使用upload中的方法就可以直接上传文件
        upload.transferTo(new File(file, filename));
        return "success";


    }
    /*//分服务器上传文件的问题
    @RequestMapping("/testFileUpload3")
     public  String  testFileUpload3(MultipartFile upload){
        String f
    }*/
}
