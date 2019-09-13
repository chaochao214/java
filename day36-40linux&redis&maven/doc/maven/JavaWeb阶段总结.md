#### 一、Servlet

1. Servlet的作用
   1. 接收请求，获取请求参数
   2. 调用业务层的方法处理业务逻辑
   3. 分发转向
      1. 重定向
      2. 请求转发
   4. 响应数据给客户端
2. Servlet的编写:继承HttpServlet类，重写doGet()和doPost()方法，在doGet()里面调用doPost()
3. Servlet的生命周期:
   1. 什么时候创建:第一次访问这个Servlet的时候
   2. 什么时候销毁:服务器关闭
4. 映射配置，三种url-Pattern的配置
   1. 全路径匹配:"/demo"
   2. 目录匹配:"/demo/*"
   3. 扩展名匹配:"*.io"

#### 二、Response部分

1. 设置响应状态码:setStatus(状态码)
2. 设置响应头:setHeader(name,value)
   1. location:重定向
   2. Content-Type:响应体的内容类型，用于解决响应的中文乱码
   3. Content-Disposition:弹出下载提示框
3. 设置响应体，通过输出流进行设置
   1. getWriter()获取字符输出流
   2. getOutputStream()获取字节输出流
4. sendRedirect(path),发起重定向
5. setContentType("text/html;charset=UTF-8")解决响应的中文乱码问题

#### 三、Request

1. 获取请求行的信息
   1. getMethod()获取请求方式,GET、POST
   2. getRequestURL()获取请求的url地址
   3. getRemoteAddr()获取请求的客户端的IP地址
2. 获取请求头信息:getHeader(name)
3. 获取请求参数
   1. getParameter(参数名)，根据参数名获取一个参数值
   2. getParameterValues(参数名)，根据一个参数名获取多个参数值，得到的是一个数组
   3. getParameterMap(),获取所有的参数名和参数值，参数名就是map的key，参数值就是map的value
4. 获取项目的发布路径:getContextPath()   "/项目名"
5. 作为域对象存取值:作用范围是一次请求中
   1. setAttribute(name,value)
   2. getAttribute(name)
   3. removeAttribute(name)
6. 发起请求转发:getRequestDispatcher(path).forWard(request,response)

#### 四、ServletContext(在整个项目中只有一个对象)

1. 获取ServletContext对象
   1. 在Servlet中直接调用getServletContext()方法
   2. 使用request对象调用getServletContext()方法
2. ServletContext对象的作用:
   1. 作为域对象存取值:范围是整个项目中所有用户共享这一个对象
   2. 获取web中的静态资源的真实路径:getRealPath("路径")
   3. 将web中的静态资源转换成字节输入流:getResourceAsStream("路径")

#### 五、Cookie

1. 使用Cookie往客户端存值

   ```
   1.创建Cookie对象，并且指定其存放的键值对
   Cookie cookie = new Cookie(name,value);
   2.设置cookie的有效期和有效范围
   cookie.setMaxAge(秒)
   cookie.setPath(路径)
   3.将cookie添加到response中发送给客户端
   response.addCookie(cookie)
   ```

2. 通过cookie获取客户端传入的值

   ```
   1.获取请求中携带的所有cookie
   Cookie[] cookies = request.getCookies();
   2.遍历出每一个cookie
   3.获取cookie对象的name以及value
   String name = cookie.getName();
   String value = cookie.getValue();
   ```

#### 六、Session

session是一个域对象，它的作用域是:一次会话

一次会话能包含多次请求和响应，但是每个用户都有自己独立的会话

1. 怎么使用session存放数据:setAttribute(name,value)
2. 怎么使用session获取数据:getAttribute(name)
3. 怎么获取session对象:request.getSession(),而且每次会话中只会存在一个session对象
4. 什么代表会话结束:关闭浏览器，或者手动销毁session对象

#### 七、Filter过滤器

1. Filter的编写:实现Filter接口，并且实现它里面的方法
2. Filter的三种映射路径的配置:目的为了指定要过滤的资源
3. Filter的放行:chain.doFilter(request,response)
4. Filter的拦截方式
   1. REQUEST表示只拦截来自客户端的请求
   2. FORWARD表示只拦截来自转发的请求
5. Filter的应用场景

#### 八、ajax

1. 作用:发起异步请求
2. 使用
   1. $.get(url,请求参数,回调函数,响应数据的类型)
   2. $.post(url,请求参数,回调函数,响应数据的类型)
   3. $.ajax({key:value,key:value})这个方法相比较上面两种方法多了一个失败时的回调，能够获取服务器异常