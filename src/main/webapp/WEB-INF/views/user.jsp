<%--
  Created by IntelliJ IDEA.
  User: lulee007
  Date: 16/1/21
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>${title}</title>
</head>
<body>
<%--显示我们的设置的标题--%>
<h1>${title}</h1>
<%--显示我们从数据库取出来的用户数据--%>
<table>
    <thead>
    <tr>
        <td>
            用户名
        </td>
        <td>
            日期
        </td>
        <td>
            日运动量(km/day)
        </td>
        <td>
            总运动量(km)
        </td>
        <td>
            总运动时间(hour)
        </td>
        <td>
            总运动次数(times)
        </td>
    </tr>
    </thead>
    <tbody>
    <%--struts2的遍历标签,循环取出用户的信息--%>
    <s:iterator value="users" id="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.date}</td>
            <td>${user.distanceDay}</td>
            <td>${user.distanceTotal}</td>
            <td>${user.hourTotal}</td>
            <td>${user.timesTotal}</td>
        </tr>

    </s:iterator>
    </tbody>
</table>

</body>
</html>
