<%--
  Created by IntelliJ IDEA.
  User: JasperWong
  Date: 2016/8/17
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<html xmlns="http://www.w3.org/1999/xhtml">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/ssm/user/login" method="post" id="myform">
    <input type="text" id="username" name="username"/>
    <input type="password" id="password" name="password"/>
    <input type="submit" value="提交" id="login" />
</form>
</body>
</html>
