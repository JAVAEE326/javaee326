<%--
  Created by IntelliJ IDEA.
  User: 37269
  Date: 2018/11/12
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一品优购</title>
</head>
<body>
<%=request.getRemoteUser()%> 你好，欢迎来到一品优购  <a href="http://localhost:9100/cas/logout?service=http://www.baidu.com">退出</a>
</body>
</html>
<%--request.getRemoteUser()为了获取远程登录名--%>