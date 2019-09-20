package com.twc.test;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;

import java.io.File;

/**
 * @Author: twc
 * @Date 2019/6/15 21:54
 **/
public class CreateIndex {

     // 创建索引库
     @Test
     public void testCreateIndexOne() throws Exception {
          //创建分词器
          Analyzer analyzer = new StandardAnalyzer();

          //索引存储位置
          Directory directory = FSDirectory.open(new File("D:/index").toPath());

          //IndexWriterConfig配置了IndexWriter对象的参数信息
          IndexWriterConfig indexWriterConfig = new IndexWriterConfig(analyzer);

          //创建IndexWriter写入对象  Directory d, IndexWriterConfig conf
          IndexWriter indexWriter = new IndexWriter(directory,indexWriterConfig);

          //创建文档对象
          Document doc = new Document();
          doc.add(new TextField("id",19999+"", Field.Store.YES));
          doc.add(new TextField("name","小红", Field.Store.YES));
          doc.add(new TextField("price",19.9+"", Field.Store.YES));
          doc.add(new TextField("pic","http://1.jpg", Field.Store.YES));
          doc.add(new TextField("desc","这是一本描述idea使用的书", Field.Store.YES));
          //将文档写入到索引库
          indexWriter.addDocument(doc);

          //提交操作
          indexWriter.commit();

          //回收资源
          indexWriter.close();
     }

}
